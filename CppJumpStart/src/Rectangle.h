#pragma once

#include "Shape.h"

class Rectangle : public Shape {
public:
	/*constructors*/
	Rectangle() :_width{}, _height{}
	{}
	Rectangle(int initial_width, int initial_height) : _width{ initial_width }, _height{ initial_height }
	{}
	/*const make a promise it would modify its variables.*/

	int area() const;
	void resize(int new_width, int new_height);


private:
	int _width;
	int _height;
};
