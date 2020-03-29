
#include "NamedRectangle.h"
#include "Triangle.h"
#include <iostream>

using std::cout;
using std::endl;

int compute_area(const Shape& a_shape) {
	return a_shape.area();
}

int main_inheri() {
	NamedRectangle fred_rectangle{ "Fred", 3, 4 };
	int fred_area{ fred_rectangle.area() };

	// we are losing information here. 
	Rectangle unnamed_rectangle{ fred_rectangle };

	Rectangle& fred_ref{ fred_rectangle };
	fred_ref.resize(6, 8);
	fred_area = fred_rectangle.area();

	std::string fredname = fred_rectangle.get_name();

	Triangle triangle = {2, 2}; 

	fred_area = compute_area(fred_rectangle);
	int triangle_area = compute_area(triangle);

	cout << fred_area << endl;
	cout << triangle_area << endl;

	// Shape shape;  -- worng..

	return 0;
}