from machine import Pin, sleep
import time

ledBlue = Pin(16, Pin.OUT)
ledRed =  Pin(5, Pin.OUT)
button = Pin(13, Pin.IN)

'''def poll_button():
    if button.value != 1:
        return True
    else:
        return None

while True:
    print(poll_button())
    time.sleep(0.5)'''

while True:
    print(button.value)
    time.sleep(0.5)