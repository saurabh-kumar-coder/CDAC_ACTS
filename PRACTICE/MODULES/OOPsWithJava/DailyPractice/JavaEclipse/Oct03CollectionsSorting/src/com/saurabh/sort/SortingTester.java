package com.saurabh.sort;
import java.util.List;
import com.saurabh.sort.comparator.IdComparator;
import com.saurabh.sort.comparator.NameComparator;
import com.saurabh.sort.comparator.DojComparator;
import com.saurabh.pojo.Employee;
import com.saurabh.data.EmployeeData;
import java.util.Collections;
public class SortingTester {
	public static void usingComparable() {
		List<Employee> employeeList = EmployeeData.getEmployeeList();
		System.out.println("******* without sort **********");
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
		System.out.println("******* with sort **********");
		Collections.sort(employeeList);
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
	}
	public static void usingComparator() {
		List<Employee> employeeList = EmployeeData.getEmployeeList();
		System.out.println("******* without sort **********");
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
		System.out.println("******* comparator sort using Name **********");
		Collections.sort(employeeList, new NameComparator());
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
		System.out.println("******* comparator sort using Doj **********");
		Collections.sort(employeeList, new DojComparator());
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
		System.out.println("******* comparator sort using ID **********");
		Collections.sort(employeeList, new IdComparator());
		for(Employee emp : employeeList) {
			System.out.println(emp);
		}
	}
	public static void main(String args[]) {
		usingComparable();
		usingComparator();
	}
}
