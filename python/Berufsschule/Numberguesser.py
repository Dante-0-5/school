import random

randomNr = int(random.random() * 100 + 1)
tries = 1

guess = int(input("Enter a number between 1 and 100!\n"))

if guess != randomNr:
    while guess != randomNr:
        if guess < randomNr:
            tries = tries + 1
            guess = int(input("Too low! Try again.\n"))
        elif guess > randomNr:
            tries = tries + 1
            guess = int(input("Too high! Try again.\n"))
else:
    print("Well done! First try!\n")

print("You guessed correctly!\nIt took you " + str(tries) + " tries.")