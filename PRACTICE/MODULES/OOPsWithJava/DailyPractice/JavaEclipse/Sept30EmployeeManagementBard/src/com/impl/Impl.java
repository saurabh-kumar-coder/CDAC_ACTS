package com.impl;

import com.constant.EnumDept;
import com.exception.InvalidHourException;
import com.exception.InvalidSalaryException;
import com.service.Employee;
import com.serviceImpl.Consultant;
import com.serviceImpl.Developer;
import com.serviceImpl.Intern;
import com.serviceImpl.Manager;

public class Impl {
	public static void main(String[] args) throws InvalidHourException, InvalidSalaryException {
// 		consultant salary
		Employee e = new Consultant(1, "Hari", EnumDept.Consultant, 300, 30);
		try {
			e.calculateSalary();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		e.displayDetails();
		System.out.println(e.toString());
//		Developer salary
		e = new Developer(2, "Pooja", EnumDept.Developer, 20000);
		try {
			e.calculateSalary();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		e.displayDetails();
		System.out.println(e.toString());
//		Intern Salary
		try {
			e = new Intern(3, "Raju", EnumDept.Intern, 2000, 20);
			e.calculateSalary();
		} catch (Exception ex) {
			System.out.println("INtern catch calleds");
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("INtern finally calleds");
			e.displayDetails();
			System.out.println(e.toString());
//		Manager Salary
			e = new Manager(4, "Shubham", EnumDept.Manager, 80000);
			try {
				e.calculateSalary();
			} catch (InvalidSalaryException ex) {
				System.out.println("manager finally calleds");
				System.out.println("MANAGER " + ex.getMessage());
			}
			try {
				e.displayDetails();				
			} catch (InvalidSalaryException ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println(e.toString());
		}
	}
}