
#include "Rectangle.h"

int Rectangle::area() const {
	return _width * _height;
}
void Rectangle::resize(int new_width, int new_height) {
	_width = new_width;
	_height = new_height;
}