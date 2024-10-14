package com.emp.impl;

import java.util.Map;
import java.util.Scanner;

import com.emp.abstractcls.Employee;
import com.emp.data.EmployeeData;
import com.emp.pojos.EmployeeKey;
import com.emp.utility.EmployeeUtility;

public class Impl {
	public static Employee employee = null;
	public static void showMenu() {
		System.out.println("+++++ MENU +++++");
		System.out.println("1. Write data into file");
		System.out.println("2. Add Employee");
		System.out.println("3. Sort Data Using First Name And Phone No");
		System.out.println("4. Sort Data Using First Name");
		System.out.println("5. Read Object From File");
		System.out.println("6. Write Character Into File");
		System.out.println("7. Read Character From File");
		System.out.println("8. Calculate Number Of Days From Joining Date");
		System.out.println("9. Get Employee Data");
		System.out.println("0. To EXIT");
	}
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
				case 9: {
					EmployeeUtility.getEmployeeData(employeeData);
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
