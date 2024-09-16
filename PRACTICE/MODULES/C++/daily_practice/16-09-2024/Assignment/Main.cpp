#include "ContractEmployee.h"
#include "PermanentEmployee.h"

int main() {
	Employee *e = NULL;
	PermanentEmployee pe;
	ContractEmployee ce;
	e = &pe;
	e->calSalary();
	e = &ce;
	e->calSalary();
//	ce.setCurrentDaySalary(500);
//	cout<<ce.getCurrentDaySalary()<<endl;
	return 0;
}
