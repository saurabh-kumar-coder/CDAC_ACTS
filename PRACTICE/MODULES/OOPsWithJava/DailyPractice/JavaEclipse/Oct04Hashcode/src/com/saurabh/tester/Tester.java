package com.saurabh.tester;
import java.util.Set;
import com.saurabh.data.EmployeeData;
import com.saurabh.pojo.Employee;
public class Tester {
	public static void main(String[] args) {
		Set<Employee> emp = EmployeeData.getEmployeeData();
		System.out.println(emp.hashCode());
//		System.out.println("Hi " + "hi".hashCode());
		System.out.println(emp);
		
	}
}
