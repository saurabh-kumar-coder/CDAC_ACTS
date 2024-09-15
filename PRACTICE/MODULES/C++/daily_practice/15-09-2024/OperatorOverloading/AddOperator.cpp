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
		const Complex operator+(const Complex c) const {
			cout<<"operator overloading called : "<<endl;
			Complex temp;
			temp.real = real + c.real;
			temp.img = img + c.img;
			return temp;
		}
};

int main() {
	Complex c1, c2, c3;
	c1.Accept(8,10);
	c2.Accept(5,6);
//	c3 = c1.add(c2);
	c3 = c1 + c2;
	c3.Display();
	return 0;
}
