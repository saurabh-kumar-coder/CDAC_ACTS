package com.saurabh.Tester;
import java.util.List;
import com.saurabh.pojo.Employee;
import com.saurabh.data.EmployeeData;
public class Tester {
	public static void main(String[] args) {
		List<Employee> empData = EmployeeData.getEmployeeData();
		Employee e1 = new Employee(1);
		boolean isFound = empData.contains(e1);
		System.out.println(isFound);
	}
}