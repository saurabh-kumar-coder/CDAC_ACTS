#ifndef CAT_CPP
#define CAT_CPP

#include<iostream>
#include "Animal.cpp"
using namespace std;

class Cat : virtual public Animal {
	public:
		void sound() override {
			cout<<"Cat sound"<<endl;
		}
};
#endif
