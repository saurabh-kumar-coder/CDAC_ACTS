#include<iostream>
using namespace std;

class Animal {
	private:
		int weight;
	public:
		Animal(){}
		
		Animal(int weight) : weight(weight) {}
		
		void setWeight(int weight) {
			cout<<"Animal setWeight() called "<<endl;
			this->weight = weight;
		}
		
		int getWeight() {
			cout<<"Animal getWeight() called "<<endl;
			return weight;
		}
};

class Lion : public Animal {
	private:
		int height;
	public:
		Lion() {}
		
		Lion(int height) : height(height) {}
		
		void setHeight(int height) {
			cout<<"Lion setHeight() called "<<endl;
			this->height = height;
		}
		
		int getHeight() {
			cout<<"Lion getHeight() called "<<endl;
			return height;
		}
		
		void Display() {
			cout<<"height of Lion is : " << height<<endl;
		}
};

class Tiger : public Animal {
	private:
		int width;
	public:
		Tiger() {}
		
		Tiger(int width) : width(width) {}
		
		void setWidth(int width) {
			cout<<"Tiger setWidth() called "<<endl;
			this->width = width;
		}
		
		int getWidth() {
			cout<<"Tiger getWidth() called "<<endl;
			return width;
		}
		
		void Display() {
			cout<<"width of Tiger is : " << width<<endl;
		}
};

class Liger : public Lion, public Tiger {
		
};

int main() {

	Liger l;
	l.setWidth(50);
	cout<<l.getWidth()<<endl;
	l.setHeight(20);
	cout<<l.getHeight()<<endl;
	l.setWeight(30);
	cout<<l.getWeight()<<endl;
	l.Tiger::Display();
	l.Lion::Display();
}















