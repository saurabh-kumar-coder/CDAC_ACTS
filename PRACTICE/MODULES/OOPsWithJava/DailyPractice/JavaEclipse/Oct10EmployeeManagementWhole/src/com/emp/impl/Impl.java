package com.emp.impl;

import static com.emp.empEnum.EmployeeEnum.HR;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.emp.abstractcls.Employee;
import com.emp.data.EmployeeData;
import com.emp.data.SkillsData;
import com.emp.pojos.EmployeeKey;

public class Impl {
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
						getEmployeeData(employeeData);
						writeObjectIntoFile(employeeData);
					}
						break;
					case 2: {
						addEmployee(employeeData);
					}
						break;
					case 3: {
						sortDataUsingFirstNameAndPhoneNo(employeeData);
					}
						break;
					case 4: {
						sortDataUsingFirstName(employeeData);
					}
						break;
					case 5: {
						readObjectFromFile();
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

	private static void readObjectFromFile() {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("binary.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			while(true) {
				Map<EmployeeKey, Employee> employee = (Map<EmployeeKey, Employee>)ois.readObject();
				System.out.println(employee);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void writeObjectIntoFile(Map<EmployeeKey, Employee> employeeData) {
		// TODO Auto-generated method stub
		try (FileOutputStream fos = new FileOutputStream(new File("binary.ser"));
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			System.out.println("Existing Data : " + employeeData);
			oos.writeObject(employeeData);
			System.out.println("data serial");
		} catch (EOFException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("data not serial");
			System.out.println(e.getMessage());
		}
	}

	private static void sortDataUsingFirstNameAndPhoneNo(Map<EmployeeKey, Employee> employeeData) {
		// TODO Auto-generated method stub
		System.out.println("Sort Data Using First Name And Phone No");
		employeeData.entrySet().stream().sorted((entry1, entry2) -> {
			String data1 = entry1.getValue().getFirstName() + " " + entry1.getValue().getPhoneNo();
			String data2 = entry2.getValue().getFirstName() + " " + entry2.getValue().getPhoneNo();
			return data1.compareTo(data2);
		}).forEach(entry -> {
			EmployeeKey key = entry.getKey();
			Employee val = entry.getValue();
			System.out.println(key + " " + val);
		});
	}

	private static void addEmployee(Map<EmployeeKey, Employee> employeeData) {
		// TODO Auto-generated method stub
//		Integer employeeId, String firstName, String lastName, LocalDate dateOfJoining, String phoneNo, List<Skills> skills, Double salary, EmployeeEnum empType
		employeeData.put(new EmployeeKey("MON", "90000000"), new Employee(6, "MON", "DOM",
				LocalDate.parse("2019-08-26"), "90000000", SkillsData.getSkillsData().subList(1, 3), 26000.0, HR));
		System.out.println("Added Employee");
		return;
	}

	private static void sortDataUsingFirstName(Map<EmployeeKey, Employee> employeeData) {
		// TODO Auto-generated method stub
		System.out.println("Sort Data Using First Name");
		employeeData.entrySet().stream().sorted((entry1, entry2) -> {
			String name1 = entry1.getKey().getFirstName();
			String name2 = entry2.getKey().getFirstName();
			return name1.compareTo(name2);
		}).forEach(entry -> {
			EmployeeKey key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println(key + " " + value);
		});
	}

	private static void getEmployeeData(Map<EmployeeKey, Employee> employeeData) {
		// TODO Auto-generated method stub
		System.out.println("Get Employee Data");
		employeeData.entrySet().stream().forEach(entry -> {
			EmployeeKey key = entry.getKey();
			Employee value = entry.getValue();
//			System.out.println(key + " " + value);
		});
	}
}
