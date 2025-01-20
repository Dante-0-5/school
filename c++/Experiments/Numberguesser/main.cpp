#include <iostream>
#include <cstdlib>
#include <ctime>

int main()
{
	srand(std::time(NULL));
	int rand_nr = (rand() % 100) + 1;

	int guess = 0;
	int tries = 0;

	std::cout << "Choose a number between 1 and 100:\n";
	std::cin >> guess;

	while (guess != rand_nr) {
		if (guess < rand_nr)
		{
			std::cout << "Too low! Try again!\n";
			tries++;
			std::cin >> guess;
		}
		else if (guess > rand_nr)
		{
			std::cout << "Too high! Try again!\n";
			tries++;
			std::cin >> guess;
		}
	}

	tries++;
	std::cout << "Well done! You guessed corectly!\nIt took you ";
	std::cout << tries;
	std::cout << " tries to guess correctly!";

	return 0;
}