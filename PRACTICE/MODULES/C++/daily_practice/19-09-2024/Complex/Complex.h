#include<iostream>
using namespace std;

class Complex {
	private:
		int real;
		int img;
	public:
		Complex();
		Complex(int , int);
		void Accept(int, int);
		void Display();
		Complex add(Complex);
		Complex operator+ (Complex);
};
