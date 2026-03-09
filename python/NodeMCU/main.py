from machine import Pin, ADC
import time
import network
from umqtt.simple import MQTTClient
import math

wlan_ssid = "wlan1320"
wlan_pass = "wlan1320pw"
mqtt_ip = "192.168.1.135"

wlan = network.WLAN(network.STA_IF)
wlan.active(True)

wlan.connect(wlan_ssid, wlan_pass)

while not wlan.isconnected():
    time.sleep(0.5)

client = MQTTClient(b"alarm_siko", mqtt_ip)
client.connect()

ledBlue = Pin(16, Pin.OUT)
clicker = Pin(12, Pin.OUT)

button = Pin(13, Pin.IN, Pin.PULL_UP)

tempSensor = ADC(0)
B = 4275 # B value of the thermistor
R0 = 100000

def pollbutton():
    if button.value() == 1:
        return True
    else:
        return False


def polltemp():
    reading = tempSensor.read()
    R = 1023.0 / reading - 1.0
    R = R0 * R
    temp = 1.0 / (math.log(R / 10000.0) / B + 1 / 298.15) - 273.15  # Convert to temperature via datasheet
    return temp

alertTriggered = False
tempTriggered = False
alertTime = 0
alertTrigger = ""
tempAvg = 0.0
tempArray = []

client.publish(b"/1320/alarmanlage/zustand", b"Good mythical morning! Booted and ready for action.")

while True:
    while not alertTriggered and not tempTriggered:
        for i in range(500):
            tempArray.append(polltemp())
            if pollbutton():
                alertTriggered = True
                alertTime = time.ticks_ms()
                alertTrigger = "button"
                break

            if polltemp() > 35:
                tempTriggered = True
                alertTime = time.ticks_ms()
                alertTrigger = "temperature"
                break
            time.sleep(0.01)

        tempAvg = sum(tempArray) / len(tempArray)
        tempMsg = "Mean temperature over the past 5 seconds: " + str(tempAvg)
        client.publish(b"/1320/alarmanlage/zustand", tempMsg.encode())
        tempArray = []

    if alertTriggered:
        alertMsgInitial = "Alert scenario triggered! Waiting for 30000 ticks."
        client.publish(b"/1320/alarmanlage/zustand", alertMsgInitial.encode())

        while time.ticks_diff(time.ticks_ms(), alertTime) < 30000:
            for x in range(0, 10):
                ledBlue.off()
                clicker.on()
                time.sleep(0.5)
                ledBlue.on()
                clicker.off()
                time.sleep(0.5)
            alertMsgProgress = "Alert scenario triggered " + str(time.ticks_diff(time.ticks_ms(), alertTime)) + " ticks ago."
            client.publish(b"/1320/alarmanlage/zustand", alertMsgProgress.encode())
        alertTriggered = False
        client.publish(b"/1320/alarmanlage/zustand", b"Alert over. Listening for input.")

    elif tempTriggered:
        alertMsgInitial = "WARN: Temperature exceeded threshold (" + str(polltemp()) + " °C)"
        client.publish(b"/1320/alarmanlage/zustand", alertMsgInitial.encode())