package com.saurabh.impl;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.saurabh.data.StudentData;
import com.saurabh.pojo.Student;
import com.saurabh.pojo.StudentKey;

public class Impl {
	public static void menu() {
		System.out.println("*****MENU*****");
		System.out.println("1. add student");
		System.out.println("2. find student");
		System.out.println("3. get all student");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<StudentKey, Student> studentData = new HashMap<>();
		studentData = StudentData.getStudentData();
		char ch = 0;
		int choice = 0;
		do {
			System.out.println("enter your choice");
			choice = sc.nextInt();
			switch(choice) {
				case 1: {
					System.out.println("Enter Student Roll No");
					int rollNo = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Student Division");
					String div = sc.nextLine();
					System.out.println("Enter Student Standard");
					String std = sc.nextLine();
					System.out.println("Enter Student Name");
					String name = sc.nextLine();
					studentData.put(new StudentKey(rollNo, div, std), new Student(rollNo, div, std, name, LocalDate.now()));
				}
				break;
				case 2: {
					System.out.println("Finding the Student");
					System.out.println("Enter roll no");
					int rollNo = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter Student Division");
					String div = sc.nextLine();
					System.out.println("Enter Student Standard");
					String std = sc.nextLine();
					if(studentData.containsKey(new StudentKey(rollNo, div, std))) {
						Student student = studentData.get(new StudentKey(rollNo, div, std));
						System.out.println(student);
					}
				}
				break;
				case 3: {
					System.out.println("Showing all Students");
					studentData.forEach((t, u) -> System.out.println(t + " " + u));
				}
				break;
				case 4: {
					System.out.println("Sorting data using roll no");
//					Collections.sort(studentData, );
				}
				default: {
					System.out.println("wrong entry");
				}
			}
			System.out.println("Do you want to continue ? Press y/Y");
			ch = sc.next().charAt(0);
		} while(ch == 'y' || ch == 'Y');
	}
}
