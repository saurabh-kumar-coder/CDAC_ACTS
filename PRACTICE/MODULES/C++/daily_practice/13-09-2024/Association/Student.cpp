#include<iostream>
#include "Address.cpp"
using namespace std;

class Student {
	private:
		int rollNo;
		string name;
		Address address;
	public:
		Student() : rollNo(0), name("") {}
		Student(int rollNo, string name, Address address) : rollNo(rollNo), name(name), address(address) {}
		void Accept() {
			cout<<"enter student details : "<<endl;
			cout<<"roll no is : "<<endl;
			cin>>rollNo;
			cout<<"name is : "<<endl;
			cin>>name;
			address.Accept();
		}
		void Display() {
			cout<<"Student data is : "<<endl;
			cout<<"roll no is : "<<rollNo<<" name is : "<<name<<endl;
			address.Display();
		}
};

int main() {
	Student s;
	s.Accept();
	s.Display();
	return 0;
}
