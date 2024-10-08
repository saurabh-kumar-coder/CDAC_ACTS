package com.saurabh.employeedata;
import java.util.List;

import com.saurabh.pojo.Employee;

import java.util.ArrayList;
import java.time.LocalDate;
public class EmployeeData {
	public static List<Employee> getEmployeeData() {
		List<Employee> employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(4, "KBC", LocalDate.parse("2024-10-06")));
		employeeList.add(new Employee(8, "BBC", LocalDate.parse("2022-01-09")));
		employeeList.add(new Employee(6, "FBC", LocalDate.parse("2021-11-12")));
		employeeList.add(new Employee(2, "ABC", LocalDate.parse("2024-11-12")));
		employeeList.add(new Employee(7, "LBC", LocalDate.parse("2026-10-02")));
		employeeList.add(new Employee(3, "HBC", LocalDate.parse("2020-02-22")));
		employeeList.add(new Employee(1, "CBC", LocalDate.parse("2022-02-02")));
		return employeeList;
	}
}
