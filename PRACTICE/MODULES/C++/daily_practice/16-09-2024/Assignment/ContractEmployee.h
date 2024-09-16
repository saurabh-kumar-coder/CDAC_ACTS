#include "Employee.h"
class ContractEmployee : public Employee {
	private:
		int currentDaySalary;
	public:
		ContractEmployee();
		ContractEmployee(int);
		void setCurrentDaySalary(int);
		int getCurrentDaySalary();
		~ContractEmployee();
		void calSalary();
};
