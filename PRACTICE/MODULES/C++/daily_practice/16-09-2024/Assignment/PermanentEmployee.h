#include "Employee.h"
class PermanentEmployee : public Employee {
	private:
		int monthlySalary;
	public:
		PermanentEmployee();
		PermanentEmployee(int monthlySalary);
		void setMonthlySalary(int);
		int getMonthlySalary();
		~PermanentEmployee();
		void calSalary();
};

