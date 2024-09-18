#include "PermanentEmployee.h"

PermanentEmployee::PermanentEmployee() : monthlySalary(0) {}

PermanentEmployee::PermanentEmployee(int monthlySalary) : monthlySalary(monthlySalary) {}

void PermanentEmployee::setMonthlySalary(int monthlySalary) {
	//cout<<"Set monthly salary of permanent employee : "<<endl;
	this->monthlySalary = monthlySalary;
}

int PermanentEmployee::getMonthlySalary() {
	//cout<<"Get monthly salary of permanent employee : "<<endl;
	return monthlySalary;
}

void PermanentEmployee::calSalary() {
	cout<<"Monthly salary is : "<<monthlySalary * 30<<endl;
}

PermanentEmployee::~PermanentEmployee() {
	cout<<"\nPERMANENT Employee DESTRUCTOR CALLED"<<endl;
}

