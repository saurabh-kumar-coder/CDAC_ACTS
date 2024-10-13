package com.impl;

import com.entity.Address;
import com.entity.Employee;

public class Impl {
	public static void main(String[] args) {
		Address address = new Address("b3", "sopan baug");
		Employee employee = new Employee(1, "Rashul", "HR", 20000.0, address);
		System.out.println("Employee beforing cloning");
		System.out.println(employee);
		Employee clonedEmployee = null;
		try {
			clonedEmployee = (Employee)employee.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("new Cloned Object is : ");
		System.out.println(clonedEmployee);
		System.out.println("++++++++++++++++++++");
		System.out.println("Now changing the salary of both employee");
		employee.setSalary(30000);
		clonedEmployee.setSalary(10000);
		System.out.println("real employee : ");
		System.out.println(employee);
		System.out.println("cloned employee : ");
		System.out.println(clonedEmployee);
		System.out.println("++++++++++++++++++++");
		System.out.println("Changing address of real employee");
		employee.setAddress(new Address("b2", "sopan baug"));
		System.out.println(employee);
		System.out.println(clonedEmployee);
	}
}
