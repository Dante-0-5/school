import random

def diceroll():
    return int(random.random() * 6 + 1)

wins = 0

dice_amount = int(input("How many times do you want to toll the dice?\n"))
print("Press enter to roll the dice!")
input()

for i in range(dice_amount):
    roll = diceroll()

    if roll == 6:
        print("Congratulations! You rolled a 6!")
        wins=wins+1
    else:
        print("Sorry. You rolled a " + str(roll))

    input("\nPress enter to roll the dice!\n")

print("That was it! You rolled " + str(dice_amount) + " dice and won " + str(wins) + " times.")