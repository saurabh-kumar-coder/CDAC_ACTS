package com.impl;

import com.constant.EnumDept;
import com.exception.InvalidHourException;
import com.service.Employee;
import com.serviceImpl.Consultant;
import com.serviceImpl.Developer;
import com.serviceImpl.Intern;
import com.serviceImpl.Manager;

public class Impl {
	public static void main(String[] args) throws InvalidHourException {
// 		consultant salary
		Employee e = new Consultant(1, "Hari", EnumDept.Consultant, 500, 30);
		e.calculateSalary();
		e.displayDetails();
		System.out.println(e.toString());
//		Developer salary
		e = new Developer(2, "Pooja", EnumDept.Developer, 20000);
		e.calculateSalary();
		e.displayDetails();
		System.out.println(e.toString());
//		Intern Salary
		e = new Intern(3, "Raju", EnumDept.Intern, 200, 5);
		e.calculateSalary();
		e.displayDetails();
		System.out.println(e.toString());
//		Manager Salary
		e = new Manager(4, "Shubham", EnumDept.Manager, 80000);
		e.calculateSalary();
		e.displayDetails();
		System.out.println(e.toString());
	}
}