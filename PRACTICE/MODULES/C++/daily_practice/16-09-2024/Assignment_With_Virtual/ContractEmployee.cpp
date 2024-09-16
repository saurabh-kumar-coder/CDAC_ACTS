#include "ContractEmployee.h"

ContractEmployee::ContractEmployee() : currentDaySalary(0) {}

ContractEmployee::ContractEmployee(int currentDaySalary) : currentDaySalary(currentDaySalary) {}

void ContractEmployee::setCurrentDaySalary(int currentDaySalary) {
	//cout<<"Set daily salary of Contract employee : "<<endl;
	this->currentDaySalary = currentDaySalary;
}

int ContractEmployee::getCurrentDaySalary() {
	//cout<<"get daily salary of contract employee : "<<endl;
	return currentDaySalary;
}

ContractEmployee::~ContractEmployee() {
	cout<<"\nCONTRACT EMPLOYEE DESTRUCTOR CALLED"<<endl;
}

void ContractEmployee::calSalary() {
	//cout<<"Contract salary : ";
}
