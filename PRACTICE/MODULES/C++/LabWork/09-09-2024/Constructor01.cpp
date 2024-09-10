#include<iostream>
using namespace std;

class Student {
	int rollNo;
	string name;
	const float foo;
	public:
	Student() : rollNo(0), name(""), foo(0.00f) {}
	
	Student(int rollNo, string name, float foo) : rollNo(rollNo), name(name), foo(foo) {}
		
	void Accept(int rollNo, string name) {
		this->rollNo = rollNo;
		this->name = name;
	}
	
	void Display() {
		cout<<"roll NO :: "<<this->rollNo<<endl;
		cout<<"name :: "<<this->name<<endl;
		cout<<"foo :: "<<this->foo<<endl;
	}

};

int main() {
	
	Student s1;
	Student s2(1, "Saurabh", 2.00f);
	Student s3;
	s3.Accept(2, "Saurabh Kumar");
	s3.Display();
	Student arr[3];
	int roll;
	string name;
	for(int i = 0; i < 3;i++) {
		cout<<"roll no : "<<endl;
		cin>>roll;
		cout<<"name : "<<endl;
		cin>>name;
		arr[i].Accept(roll, name);
		arr[i].Display();	
	}
	 
}






