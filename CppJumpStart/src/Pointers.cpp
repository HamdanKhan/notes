#include <iostream>

using std::cout;
using std::endl;

int main_ptr() {
	 
	int x{ 1 };
	int* pointer_to_x{ &x };
	int y{ *pointer_to_x }; 
	y = 3; 
	*pointer_to_x = 4;
	
	int* p{ &x };

	p = &y;

	int j{ *p };

	//p = nullptr;
	j = *p;

	return 0;
}