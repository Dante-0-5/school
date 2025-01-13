#include "Header.h"
//include own header files with "" instead of <>
#include <iostream>

int namespaces()
{
	a::helloWorld = "Hello World!";
	b::helloWorld = "Hello again!";

	std::cout << a::helloWorld + " " + b::helloWorld;
	
	return 0;
}

//Namespaces are similar to "folders" that identifiers (names of functions, variables etc.) can belong to.
//In this example, a::helloWorld is distinct from b::helloWorld.
//Both of these namespaces have been declared in a header file ("Header.h"). As such, Header.h has to be
//included in order to include the namespaces.