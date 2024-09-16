#include "Employee.h"
Employee::Employee() : empId(0), name("") {}
void Employee::setEmpId(int empId) {
	this->empId = empId;
}
int Employee::getEmpId() {
	return empId;
}
void Employee::setName(string name) {
	this->name = name;
}
string Employee::getName() {
	return name; 
}

void Employee::calSalary() {
	cout<<"Employee salary called : "<<endl;
}

//		void Accept();
//		void Display();
Employee::~Employee(){}

