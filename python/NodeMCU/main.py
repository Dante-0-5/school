from machine import Pin, sleep
import time

ledBlue = Pin(16, Pin.OUT)
ledRed =  Pin(5, Pin.OUT)

while True:
    print("Blue!")
    ledRed.value(0)
    ledBlue.value(0)
    time.sleep(0.5)

    print("Red!")
    ledRed.value(1)
    ledBlue.value(1)
    time.sleep(0.5)
