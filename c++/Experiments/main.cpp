#include <iostream>
#include <string>

static int basicInput()
{
	std::string HelloWorld;
	//string belongs to the standard namespace, so call with std::string
	std::cin >> HelloWorld;

	std::cout << HelloWorld;
	return 0;
}

int main()
{
	basicInput();
	return 0;
}