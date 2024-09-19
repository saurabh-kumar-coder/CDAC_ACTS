#include<iostream>
#include "Animal.cpp"
using namespace std;

class Dog : virtual public Animal {
	public:
		void sound() override {
			cout<<"Dog sound"<<endl;
		}
};
