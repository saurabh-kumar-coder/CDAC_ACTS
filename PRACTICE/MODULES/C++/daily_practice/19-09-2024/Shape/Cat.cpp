#include<iostream>
#include "Animal.cpp"
using namespace std;

class Cat : public Animal {
	public:
		void sound() {
			cout<<"cat sound"<<endl;
		}
};
