package com.saurabh.data;
import java.util.Set;
import java.util.HashSet;
import com.saurabh.pojo.Employee;
public class EmployeeData {
	public static Set<Employee> getEmployeeData() {
		Set<Employee> emp = new HashSet<Employee>();
		emp.add(new Employee(1, "ABC"));
		emp.add(new Employee(2, "PQR"));
		emp.add(new Employee(1, "ABC"));
		emp.add(new Employee(4, "DEF"));
		return emp;
	}
}
