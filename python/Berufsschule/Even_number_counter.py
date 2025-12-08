number = int(input("Enter a number: "))

sum1 = 0
amount = 0

for i in range(0, number+1):
	if i % 2 == 0:
		sum1 += i
		amount += 1

print("Sum of all even numbers from 1 to your number: " + str(sum1))
print("Amount of all even numbers from 1 to your number: " + str(amount))