#include <iostream>
#include <cstdlib>
#include <ctime>

int main()
{
	srand(std::time(NULL));
	int rand_nr = (rand() % 100) + 1;

	
	return 0;
}