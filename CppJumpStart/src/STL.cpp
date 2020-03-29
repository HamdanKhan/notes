#include <algorithm>
#include <iostream>
#include <string>
#include <vector>
#include <numeric>

using namespace std;

template<class T>
T Add(T a, T b) { return a + b; }

int main() {
	int i{ Add(3, 4) };
	double d{ Add(1.1, 2.2) };
	string s{ Add(string{"Hello "}, string{" World"}) };

	vector<int> ints{3,7,11,23};
	vector<double> doubles{1.1, 5.4, 77.2, -1.2};

	int ilength = ints.size();
	int dlength = doubles.size();

	ints.push_back(-3);
	ints.push_back(22);

	ilength = ints.size();
	ints[0]++;
	auto third = ints[2];//compilers knows its type.

	int total{ 0 };
	for (unsigned int i = 0; i < ints.size(); i++) {
		total += ints[i];
	}

	int total2{};
	for (const auto& elem : ints) {//ranged for
		total2 += elem;
	}

	int total3 = accumulate(begin(ints), end(ints), 0);

	vector<int> consecutive{ 0,1,2,3,4,5,6,7,8,9 };
	vector<int> consecutive2(100);

	iota(begin(consecutive2), end(consecutive2), 0);

	consecutive.erase(begin(consecutive));
	consecutive.erase(begin(consecutive) + 2);
	consecutive.erase(begin(consecutive) + 4 , end(consecutive));

	consecutive.insert(begin(consecutive) + 1, 7);

	sort(begin(doubles), end(doubles));

	auto seventyseven = find(begin(doubles), end(doubles) , 77.2);
	*seventyseven = 7.2;

	double product = 1;
	for (auto d : doubles) {
		product *= d; 
	}

	double product2 = accumulate(begin(doubles), end(doubles), 1.0,
		[](double partialResult, double d) {return partialResult * d; });

	int numberodds = count_if(begin(ints), end(ints), [](int i) {return i % 2 == 1; });
	vector<int> odds(numberodds);
	copy_if(begin(ints), end(ints), begin(odds), [](int i) {return i % 2 == 1; });
	
	auto is_even = [](int i) {return i % 2 == 0; };
	int numberevens = count_if(begin(ints), end(ints) , is_even);
	vector<int> evens(numberevens);
	copy_if(begin(ints), end(ints), begin(evens), is_even);

	string sentence = "This is a sentence being stored in a std::string instance";
	int numberspaces = count(begin(sentence), end(sentence), ' ');
	auto colon = find(begin(sentence), end(sentence), ':');
	char atcolon = *colon;

	return 0;
}