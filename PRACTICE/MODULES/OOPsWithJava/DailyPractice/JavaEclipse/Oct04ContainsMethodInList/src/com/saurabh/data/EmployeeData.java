package com.saurabh.data;
import java.util.List;
import java.util.ArrayList;
import com.saurabh.pojo.Employee;
import java.time.LocalDate;
public class EmployeeData {
	public static List<Employee> getEmployeeData() {
		List<Employee> employeeData = new ArrayList<Employee>();
		employeeData.add(new Employee(2, "ABC", LocalDate.parse("2024-03-12")));
		employeeData.add(new Employee(4, "DBC", LocalDate.parse("2022-06-12")));
		employeeData.add(new Employee(1, "CBC", LocalDate.parse("2025-09-02")));
		return employeeData;
	}
}
