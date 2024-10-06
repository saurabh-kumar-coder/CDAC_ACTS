package com.saurabh.impl;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.saurabh.data.StudentData;
import com.saurabh.pojo.Student;

public class Impl {
	public static void showMenu() {
		System.out.println("------ Menu ------");
		System.out.println("1. Add Student");
		System.out.println("2. Print All Students");
		System.out.println("3. Find student using unique (standard, division and roll no)");
	}

	public static void main(String[] args) {
		char ch = 0;
		int choice = 0;
		Map<Student, Student> studentData = StudentData.getStudentData();
		try(Scanner sc = new Scanner(System.in)){
			do {
				showMenu();
				System.out.println("Enter Your Choice");
				choice = sc.nextInt();
				switch(choice) {
					case 1:{
						try {
							addStudent(studentData, sc);
						} catch(Exception e) {
							System.out.println(e.getMessage());
						}
					}break;
					case 2:{
						try {
							printStudents(studentData);
						} catch(Exception e) {
							System.out.println(e.getMessage());
						}
					}break;
					case 3:{
						try {
							findStudent(studentData, sc);
						} catch(Exception e) {
							System.out.println(e);
						}
					}break;
					default : {
						System.out.println("Entered wrong input");
					}
				}
				System.out.println("Do you want to continue : Press Y/y");
				ch = sc.next().charAt(0);
			} while (ch == 'y' || ch == 'Y');
			
		}
	}

	private static void findStudent(Map<Student, Student> studentData, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter RollNo : ");
		Integer rollNo = sc.nextInt();
		System.out.println("Enter Standard : ");
		Integer standard = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Division : ");
		String division = sc.nextLine();
		Student student = new Student(rollNo, standard, division);
		if(!studentData.containsKey(student)) {
			System.out.println("Not Found");
		} else {
			System.out.println("Found");
			System.out.println(studentData.get(student).getRollNo()+ " -> "+studentData.get(student).getStandard()+ " -> "+studentData.get(student).getDivision()+ " -> "+studentData.get(student).getName());
		}
	}

	private static void printStudents(Map<Student, Student> studentData) {
		// TODO Auto-generated method stub
		Set<Map.Entry<Student,Student>> entries = studentData.entrySet();
		for(Map.Entry<Student,Student> entry : entries) {
			System.out.println("Printing Student : " + entry.getKey().getRollNo() + " -> " + entry.getKey().getStandard() + " -> "+ entry.getKey().getDivision() + " -> " + entry.getValue().getName());
		}
	}

	private static void addStudent(Map<Student, Student> studentData, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Enter RollNo : ");
		Integer rollNo = sc.nextInt();
		System.out.println("Enter Standard : ");
		Integer standard = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Division : ");
		String division = sc.nextLine();
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		studentData.put(new Student(rollNo, standard, division), new Student(rollNo, standard, division, name));
	}
}
