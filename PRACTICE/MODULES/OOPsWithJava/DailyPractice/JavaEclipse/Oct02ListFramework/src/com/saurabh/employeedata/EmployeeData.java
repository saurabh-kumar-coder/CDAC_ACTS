package com.saurabh.employeedata;

import java.util.ArrayList;
import java.util.List;

import com.saurabh.pojo.Employee;

public class EmployeeData {
	public static List<Employee> getEmployeeList() {
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "ABC", "HR", 20000.0));
		employee.add(new Employee(2, "BBC", "MN", 70000.0));
		employee.add(new Employee(3, "CBC", "DEV", 30000.0));
		employee.add(new Employee(4, "DBC", "CEO", 80000.0));
		employee.add(new Employee(5, "EBC", "CL", 30000.0));
		employee.add(new Employee(6, "ABC", "HR", 10000.0));
		employee.add(new Employee(7, "CBC", "MN", 60000.0));
		employee.add(new Employee(8, "FBC", "DEV", 40000.0));
		employee.add(new Employee(9, "GBC", "CEO", 30000.0));
		employee.add(new Employee(0, "HBC", "CL", 40000.0));
		return employee;
	}
}
