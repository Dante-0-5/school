from machine import Pin
import time

ledBlue = Pin(16, Pin.OUT)
button = Pin(13, Pin.IN, Pin.PULL_UP)

def pollbutton():
    if button.value() == 1:
        return True
    else:
        return False

alertTriggered = False
alertTime = 0

while True:
    while not alertTriggered:
        buttonValue = pollbutton()
        time.sleep(0.01)
        if buttonValue:
            alertTriggered = True
            alertTime = time.ticks_ms()

    while time.ticks_diff(time.ticks_ms(), alertTime) < 30000:
        for x in range(0, 10):
            ledBlue.off()
            time.sleep(0.5)
            ledBlue.on()
            time.sleep(0.5)
    alertTriggered = False