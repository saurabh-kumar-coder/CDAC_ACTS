#ifndef Emp
#define Emp
#include<iostream>
#include<string>
using namespace std;

class Employee {
	private:
		int empId;
		string name;
	public: 
		Employee();
		void setEmpId(int empId);
		int getEmpId();
		void setName(string name);
		string getName();
		virtual void calSalary();
//		void Accept();
//		void Display();
		~Employee();
};
#endif
