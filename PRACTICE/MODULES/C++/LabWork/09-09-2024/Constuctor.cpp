#include<iostream>
using namespace std;

class Employee {
	private: 
		int rollNo;
		string name;
		const float f;
	public:
		Employee() : f(0.00f) { //default
			cout<<"default constructor "<<endl;
		}
		
		Employee(int rollNo, string name) : rollNo(rollNo), name(name),f(0.01F) { //all arg const
			cout<<this->rollNo<<" "<<this->name<<" "<<this->f<<endl;
		}
		
		void Accept(int rollNo, string name) {
			this->rollNo = rollNo;
			this->name = name;
		}
		
		void Display () {
			cout<<this->rollNo<<" "<<this->name<<" "<<this->f<<endl;
		}
};

int main() {
/*
	Employee e;
	e.Accept(4, "A");
	e.Display();
	Employee *e1 = new Employee();
	e1->Display();
	Employee e2(3, "B");
	e2.Display();
	Employee e6[4];
	Employee *e5 = new Employee[4];
	
	Employee *e7 = new Employee[4];
	
	int * n = new int;
	
*/	
	int p[5];
	for(int i = 0; i < 10; i++) {
		cout<<"simple array : "<<p[i]<<endl;
	}
	/*
	for(int i = 0; i < 4; i++) {
		cout<<"pointer array : "<<endl;
		cout<<*(n + i);
	}
	*/
	
}















