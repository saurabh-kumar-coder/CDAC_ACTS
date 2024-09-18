#include<iostream>
#include<cstring>
#include "Student.h"
using namespace std;


Student::Student() : rollNo(), name(), area() {}

Student::Student(char rollNo[], char name[], char area[]) {
	strcpy(this->rollNo, rollNo);
	strcpy(this->area, area);
	strcpy(this->name, name);
}

void Student::Accept() {
	cout<<"Enter student details : "<<endl;
	cout<<"Roll no is : "<<endl;
	cin>>rollNo;
	cout<<"name is : "<<endl;
	cin>>name;
	cout<<"area is : "<<endl;
	cin>>area;
}
void Student::Display() {
	cout<<"Student roll no is : "<<rollNo<<endl;
	cout<<"name is : "<<name<<endl;
	cout<<"area is : "<<area<<endl;
}
