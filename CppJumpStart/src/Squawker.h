#pragma once
#include <iostream>
#include <string>

class Squawker
{
public: 
	Squawker() {
		std::cout << "Default constructing" << std::endl;
	}

	Squawker(std::string n) : name(n) 
	{
		std::cout << "Constructing \"" << name << "\""<< std::endl;
	}
	~Squawker() {
		std::cout << "Distroying .. " << name << std::endl;
	}
private:
	std::string name;
};