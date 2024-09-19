#include<iostream>
#include "Animal.cpp"
using namespace std;

class Dog : public Animal {
	public:
		void sound() {
			cout<<"Dog sound"<<endl;
		}
};
