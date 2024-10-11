package com.emp.impl;

import java.util.Map;
import java.util.Scanner;

import com.emp.abstractcls.Employee;
import com.emp.data.EmployeeData;
import com.emp.pojos.EmployeeKey;
import com.emp.utility.EmployeeUtility;

public class Impl {
	public static Employee employee = null;

	public static void main(String[] args) {
		Map<EmployeeKey, Employee> employeeData = EmployeeData.getEmployeeData();

		try (Scanner sc = new Scanner(System.in)) {
			int choice = 0;
			char ch = 0;
			do {
				System.out.println("enter your choice : ");
				choice = sc.nextInt();
				switch (choice) {
				case 1: {
					EmployeeUtility.getEmployeeData(employeeData);
					EmployeeUtility.writeObjectIntoFile(employeeData);
				}
					break;
				case 2: {
					EmployeeUtility.addEmployee(employee, employeeData, sc);
				}
					break;
				case 3: {
					EmployeeUtility.sortDataUsingFirstNameAndPhoneNo(employeeData);
				}
					break;
				case 4: {
					EmployeeUtility.sortDataUsingFirstName(employeeData);
				}
					break;
				case 5: {
					EmployeeUtility.readObjectFromFile();
				}
					break;
				case 6: {
					EmployeeUtility.writeCharacterIntoFile(employeeData);
				}
					break;
				case 7: {
					EmployeeUtility.readCharacterFromFile();
				}
					break;
				case 8: {
					EmployeeUtility.calculateNumberOfDaysFromJoiningDate(employeeData);
				}
					break;
				default: {
					System.out.println("you entered wrong choice");
				}
				}
				System.out.println("Do You Want To Continue: Press Y/y");
				ch = sc.next().charAt(0);
			} while (ch == 'y' || ch == 'Y');
		}
	}
}
