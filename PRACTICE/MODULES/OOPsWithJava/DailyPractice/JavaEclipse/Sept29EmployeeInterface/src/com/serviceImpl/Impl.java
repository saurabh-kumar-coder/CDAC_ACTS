package com.serviceImpl;

import com.abstractEntity.Employee;
import com.entity.ContractEmployee;
import com.entity.NoSalaryEmployee;
import com.entity.PermEmployee;
import com.service.Payable;

public class Impl {
	public static void main(String[] args) {
//		int empId, String name, String number, double salary, double basic, double incentive
		Employee e = new PermEmployee(1, "P", "65656", 5000.0, 200.0);
		System.out.println(e.toString());
		Payable p = (Payable)e;
		p.calcSalary();
		p.getBonus();
//		Payable p = new PermEmployee();
//		p.calcSalary();
//		int empId, String name, String number, double salary, int noOfDays, double ratePerDay
		Employee e1 = new ContractEmployee(2, "C", "3265", 5, 1000);
		System.out.println(e1.toString());
		Payable p1 = (Payable)e1;
		p1.calcSalary();
		p1.getBonus();
//		int empId, String name, String number, String team
		Employee e2 = new NoSalaryEmployee(2, "C", "3265", "HR");
		System.out.println(e2.toString());
		Payable p2 = (Payable)e2;
		p2.calcSalary();
	}
}