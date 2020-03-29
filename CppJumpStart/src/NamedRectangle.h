#pragma once

#include "Rectangle.h"
#include <string>

/* always use public Rectangle -- previous 
we have options but now own public is must.*/

class NamedRectangle : public Rectangle {
public:
	NamedRectangle() {}

	NamedRectangle(std::string initial_name, int initial_width, int initial_height)
		:Rectangle{ initial_width, initial_width }, _name{ initial_name }
	{}
	std::string get_name() {
		return _name;
	}
private: 
	std::string _name;
};