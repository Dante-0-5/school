from machine import Pin, ADC
import time
import network
from umqtt.simple import MQTTClient

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
light = ADC(0)


def pollbutton():
    if button.value() == 1:
        return True
    else:
        return False

def polllight():
    # Currently reacts to darkness for testing purposes. Replace "lesser than" with "greater than" later
    if light.read_u16() < 10000:
        return True
    else:
        return False



alertTriggered = False
alertTime = 0
alertTrigger = ""

client.publish(b"/1320/alarmanlage/zustand", b"Good mythical morning! Booted and ready for action.")

while True:
    while not alertTriggered:
        if pollbutton():
            alertTriggered = True
            alertTime = time.ticks_ms()
            alertTrigger = "button"
        elif polllight():
            alertTriggered = True
            alertTime = time.ticks_ms()
            alertTrigger = "light sensor"
        time.sleep(0.01)

    alertMsgInitial = "Alert scenario triggered by " + alertTrigger + "! Waiting for 30000 ticks."
    client.publish(b"/1320/alarmanlage/zustand", alertMsgInitial.encode())

    while time.ticks_diff(time.ticks_ms(), alertTime) < 30000:
        for x in range(0, 10):
            ledBlue.off()
            clicker.on()
            time.sleep(0.5)
            ledBlue.on()
            clicker.off()
            time.sleep(0.5)
        alertMsgProgress = "Alert scenario triggered " + str(time.ticks_diff(time.ticks_ms(), alertTime)) + " ticks ago by " + alertTrigger + "."
        client.publish(b"/1320/alarmanlage/zustand", alertMsgProgress.encode())
    alertTriggered = False
    client.publish(b"/1320/alarmanlage/zustand", b"Alert over. Listening for input.")