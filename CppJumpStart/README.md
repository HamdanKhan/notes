# CppJumpStart
#### Code from MVA  "C++ A General Purpose Language and Library Jump Start"

#### Part 3
* copy ({}) vs assign (=)

#### Part 4 
References 
```
void f(){
		int x{1};
		int& xref{x}; //reference to x.
		
		x = 2 // assign 2 to x
		xref = 3 // assign 3 to "x"
		int y{xref} // copy x into new object named y
}
```
Where reference comes in handy, pass by ref.
```
void multiply_by_two(int& parameter){
	parameter = parameter * 2;
}
void f(){
	int x{1};
	multiply_by_two(x);
	//x == 2 here
}
```
int& x; // Invalid; the reference must be initialized.
and will always refer to the value it was initialized by. 
i.e. it can not change.

#### Part 5
* Free store (also known as dynamic memory and heap;).
* Naked pointer, Raw pointer. 
* std::unique_ptr<Squawker>

#### Part 7
Topics not covered
* Move semantics and rvalue references.
* Legacy C++ constructs 
  * C-style arrays, C-style strings, union, printf.
* Less used syntax and keywords
  * switch, immediate if, comma operator
  * Bitwise comparisons and shifting
  * struct
* Writing templates
* Operator Overloading
* Performance considerations
* Visual Studio settings and options.
  * pre-compiled headers
  * Indenting styles 

What it can do
* https://libcinder.org		
