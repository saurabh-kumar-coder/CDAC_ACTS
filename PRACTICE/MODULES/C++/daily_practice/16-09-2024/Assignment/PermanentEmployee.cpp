#include "PermanentEmployee.h"

PermanentEmployee::PermanentEmployee() : monthlySalary(0) {}

PermanentEmployee::PermanentEmployee(int monthlySalary) : monthlySalary(monthlySalary) {}

void PermanentEmployee::setMonthlySalary(int monthlySalary) {
	cout<<"Set monthly salary of permanent employee : "<<endl;
	this->monthlySalary = monthlySalary;
}

int PermanentEmployee::getMonthlySalary() {
	cout<<"Get monthly salary of permanent employee : "<<endl;
	return monthlySalary;
}

PermanentEmployee::~PermanentEmployee() {
	cout<<"Permanent Employee DESTRUCTOR CALLED"<<endl;
}

void PermanentEmployee::calSalary() {
	cout<<"Permanent salary : ";
}
