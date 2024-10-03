package com.saurabh.data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.saurabh.pojo.Employee;

public class EmployeeData {
	public static List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "ABC", "acb-DEPT", LocalDate.parse("2024-02-15")));
		employeeList.add(new Employee(2, "BCS", "bcg-DEPT", LocalDate.parse("2024-06-12")));
		employeeList.add(new Employee(8, "ABC", "lcb-DEPT", LocalDate.parse("2023-08-18")));
		employeeList.add(new Employee(5, "CCS", "mcg-DEPT", LocalDate.parse("2024-01-23")));
		employeeList.add(new Employee(3, "SBC", "pcb-DEPT", LocalDate.parse("2024-10-09")));
		employeeList.add(new Employee(4, "KCS", "vcg-DEPT", LocalDate.parse("2023-07-28")));
		employeeList.add(new Employee(0, "LBC", "ocb-DEPT", LocalDate.parse("2021-04-26")));
		employeeList.add(new Employee(9, "NCS", "rcg-DEPT", LocalDate.parse("2024-12-02")));
		employeeList.add(new Employee(7, "XBC", "qcb-DEPT", LocalDate.parse("2023-11-05")));
		employeeList.add(new Employee(11, "VCS", "tcg-DEPT", LocalDate.parse("2022-12-14")));
		employeeList.add(new Employee(8, "HBC", "asb-DEPT", LocalDate.parse("2022-01-19")));
		employeeList.add(new Employee(12, "DCS", "gcg-DEPT", LocalDate.parse("2021-01-10")));
		return employeeList;
	}
}
