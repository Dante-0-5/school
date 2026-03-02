from machine import Pin
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
button = Pin(13, Pin.IN, Pin.PULL_UP)

def pollbutton():
    if button.value() == 1:
        return True
    else:
        return False

alertTriggered = False
alertTime = 0

client.publish(b"/alarmanlage/zustand", b"Good mythical morning! Booted and ready for action.")

while True:
    while not alertTriggered:
        buttonValue = pollbutton()
        time.sleep(0.01)
        if buttonValue:
            alertTriggered = True
            client.publish(b"/alarmanlage/zustand", b"Alert scenario triggered! Waiting for 5000 ticks.")
            alertTime = time.ticks_ms()

    while time.ticks_diff(time.ticks_ms(), alertTime) < 5000:
        for x in range(0, 10):
            ledBlue.off()
            time.sleep(0.5)
            ledBlue.on()
            time.sleep(0.5)
    alertTriggered = False
    client.publish(b"/alarmanlage/zustand", b"Alert over. Listening for input.")
