#include<iostream>
#include<string>
#include "Student.h"
//#include "Address.h"

//using namespace std;

Student::Student() : rollNo(0), name("") {}
Student::Student(int rollNo, string name, Address address): rollNo(rollNo), name(name) {}
void Student::Accept() {
	cout<<"Enter student details : "<<endl;
	cout<<"Roll no is : "<<endl;
	cin>>rollNo;
	cout<<"name is : "<<endl;
	cin>>name;
	cout<<"Address is : "<<endl;
	address.Accept();
}
void Student::Display() {
	cout<<"Student roll no is : "<<rollNo<<endl;
	cout<<"name is : "<<name<<endl;
	address.Display();
}
