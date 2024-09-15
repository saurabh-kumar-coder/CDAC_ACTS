#include<iostream>
using namespace std;
class Complex {
	private:
		int real;
		int img;
	public:
		void Accept(int a, int b) {
			real = a;
			img = b;
			cout<<"Accept function : "<<real<<" "<<img<<endl;
		}
		void Display() {
			cout<<"real is : "<<real<<endl;
			cout<<"img is : "<<img<<endl;
		}
		Complex add(Complex c) {
			Complex temp;
			temp.real = real + c.real;
			temp.img = img + c.img;
			return temp;
		}
		Complex operator+(Complex c) {
			cout<<"operator overloading called : "<<endl;
			Complex temp;
			temp.real = real + c.real;
			temp.img = img + c.img;
			return temp;
		}
		
		Complex operator-(Complex c) {
			cout<<"operator overloading sub called : "<<endl;
			Complex temp;
			temp.real = real - temp.real;
			temp.img = img - temp.img;
			return temp;
		}
};

int main() {
	Complex c1, c2, c3;
	c1.Accept(8,10);
	c2.Accept(5,6);
	cout<<"C1 ";
	c1.Display();
	cout<<"C2 ";
	c2.Display();
	c1.Accept(8,10);
	c2.Accept(5,6);
	c3 = c1 - c2;
	c3.Display();
	return 0;
}
