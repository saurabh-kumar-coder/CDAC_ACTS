#include "ContractEmployee.h"
#include "PermanentEmployee.h"

int main() {
	Employee *e = NULL;
	PermanentEmployee pe;
	ContractEmployee ce;
	e = &pe;
	e->setEmpId(1);
	e->setName("Aaa");
	pe.setMonthlySalary(25000);
	cout<<"Perm EMP id : "<<e->getEmpId()<<endl;	
	cout<<"Perm EMP name : "<<e->getName()<<endl;
	cout<<"Perm EMP Salary : "<<pe.getMonthlySalary()<<" : ";
	e->calSalary();
	cout<<endl;
	e = &ce;
	e->setEmpId(2);
	e->setName("Bbb");
	ce.setCurrentDaySalary(500);
	cout<<"Cont EMP id : "<<e->getEmpId()<<endl;	
	cout<<"Cont EMP name : "<<e->getName()<<endl;
	cout<<"Cont EMP Salary : "<<ce.getCurrentDaySalary()<<" : ";
	e->calSalary();
//	ce.setCurrentDaySalary(500);
//	cout<<ce.getCurrentDaySalary()<<endl;
	return 0;
}
