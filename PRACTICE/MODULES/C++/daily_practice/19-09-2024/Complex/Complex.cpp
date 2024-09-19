#include "Complex.h"
Complex::Complex() : real(0), img(0) {}
Complex::Complex(int real, int img) : real(real), img(img) {}
void Complex::Accept(int a, int b) {
//	cout<<"enter real part : "<<endl;
//	cin>>real;
//	cout<<"enter img part : "<<endl;
//	cin>>img;
	real = a;
	img = b;
}
void Complex::Display() {
	cout<<"real is : "<<real<<endl;
	cout<<"img is : "<<img<<endl;
}
Complex Complex::add(Complex c) {
	Complex temp;
	temp.real = real + c.real;
	temp.img = img + c.img;
	return temp;
}

Complex Complex::operator+ (Complex c) {
	Complex temp;
	temp.real = real + c.real;
	temp.img = img + c.img;
	return temp;
}
