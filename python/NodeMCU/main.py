from machine import Pin, sleep
import time

led = Pin(16, Pin.OUT)

for x in range(0, 10):
    print("Blink!")
    led.value(0)
    time.sleep(1)
    led.value(1)
    time.sleep(1)
