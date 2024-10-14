package com.emp.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
import com.emp.abstractcls.Employee;
import com.emp.concrete.ContractEmployee;
import com.emp.concrete.PermanentEmployee;
import com.emp.data.SkillsData;
import com.emp.empEnum.EmployeeEnum;
import com.emp.pojos.EmployeeKey;
import com.emp.pojos.Skills;

public class EmployeeUtility {
	public static void getEmployeeData(Map<EmployeeKey, Employee> employeeData) {
		// TODO Auto-generated method stub
		System.out.println("Get Employee Data");
		employeeData.entrySet().stream().forEach(entry -> {
			EmployeeKey key = entry.getKey();
			Employee value = entry.getValue();
			System.out.println(key + " " + value);
		});
	}
	
	public static void sortDataUsingFirstName(Map<EmployeeKey, Employee> employeeData) {
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
	
	public static void sortDataUsingFirstNameAndPhoneNo(Map<EmployeeKey, Employee> employeeData) {
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
	
	public static void writeObjectIntoFile(Map<EmployeeKey, Employee> employeeData) {
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
	
	public static void readObjectFromFile() {
		// TODO Auto-generated method stub
		try(FileInputStream fis = new FileInputStream("binary.ser");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			while(true) {
				@SuppressWarnings("unchecked")
				Map<EmployeeKey, Employee> employee = (Map<EmployeeKey, Employee>)ois.readObject();
				System.out.println(employee);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void writeCharacterIntoFile(Map<EmployeeKey, Employee> employeeData) {
		// TODO Auto-generated method stub
		try(FileWriter fw = new FileWriter("character.txt");
				BufferedWriter br = new BufferedWriter(fw);){
			employeeData.entrySet().stream()
				.forEach(entry -> {
					EmployeeKey key = entry.getKey();
					Employee val = entry.getValue();
					try {
						br.write(key.toString() + " " + val.toString());
						br.newLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				});
			System.out.println("data entered into file.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void readCharacterFromFile() {
		// TODO Auto-generated method stub
		try(FileReader fr = new FileReader("character.txt");
				BufferedReader br = new BufferedReader(fr);){
			String employee;
			while((employee = br.readLine()) != null) {
				System.out.println(employee);
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void addEmployee(Employee employee, Map<EmployeeKey, Employee> employeeData, Scanner sc) {
		// TODO Auto-generated method stub
		sc.nextLine();
		System.out.println("enter type of employee. Press P for permanent employee/ C for Contract Employee");
		String et = sc.nextLine().toLowerCase();
		System.out.println("enter employee id : ");
		Integer employeeId = sc.nextInt();
		sc.nextLine();
		System.out.println("enter first name : ");
		String firstName = sc.nextLine();
		System.out.println("enter last name : ");
		String lastName = sc.nextLine();
		System.out.println("enter date of joining : ");
		String doj = sc.nextLine();
		LocalDate dateOfJoining = LocalDate.parse(doj);
		System.out.println("enter phone number : ");
		String phoneNo = sc.nextLine();
		System.out.println("enter skills : ");
		List<Skills> skills = new ArrayList<>(SkillsData.getSkillsData().subList(1, 1));
		System.out.println("enter employee type");
		String typ = sc.nextLine();
		EmployeeEnum type = EmployeeEnum.valueOf(typ);
		if(et.equalsIgnoreCase("p")) {
			System.out.println("enter Monthly salary");
			Double monthlySalary = sc.nextDouble();
			Double salary = new PermanentEmployee(monthlySalary).calcSalary();
			employee = new PermanentEmployee(employeeId, firstName, lastName, dateOfJoining, phoneNo, skills, salary, type);
		}else if(et.equalsIgnoreCase("c")) {
			System.out.println("enter number of hours");
			Double hours = sc.nextDouble();
			System.out.println("enter rate per hours");
			Double rate = sc.nextDouble();
			Double salary = new ContractEmployee(rate, hours).calcSalary();
			employee = new ContractEmployee(employeeId, firstName, lastName, dateOfJoining, phoneNo, skills, salary, type);
		}
		employeeData.put(new EmployeeKey(firstName, phoneNo), employee);
		return;
	}

	public static void calculateNumberOfDaysFromJoiningDate(Map<EmployeeKey, Employee> employeeData) {
		// TODO Auto-generated method stub
		employeeData.entrySet().stream()
			.forEach(t -> {
				LocalDate doj = t.getValue().getDateOfJoining();
				Period period = Period.between(doj, LocalDate.now());
				System.out.println("Period : " + period);
				Integer days = (int) ChronoUnit.DAYS.between(doj, LocalDate.now());
				System.out.println("calculated date : " + days);
			});
	}
}