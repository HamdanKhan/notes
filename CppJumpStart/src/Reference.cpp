#include <iostream>

using std::cout;
using std::endl;

void multiply_by_two(int& parameter) {
	parameter = parameter * 2;
}

int main_ref() {

	int x{ 1 };
	int y{ x };
	y = 2; 

	const int& xref{ x };

	x = 2;
	// xref = 3;

	int copy{ xref };

	int h{ 1 };
	multiply_by_two(h);
	cout << h << endl;

	return 0;
}
