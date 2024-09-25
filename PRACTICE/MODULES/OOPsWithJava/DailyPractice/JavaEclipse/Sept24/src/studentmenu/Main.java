package studentmenu;

import java.util.Scanner;

/*
 * Write a menu driven program to add Student objects in  an array of students.
1. Add Student
2. Print Student by rollNo
3. Print All students Sorted by Marks
0. exit
 */
import studentdemo.Student;

public class Main {
	public static void showMenu() {
		System.out.println("1. Add Student\r\n" + "2. Print Student by rollNo\r\n"
				+ "3. Print All students Sorted by Marks\r\n" + "0. exit");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		Student s[] = new Student[n];
		int i = 0;
		char ch = '0';
		int choice = 0;
		do {
			showMenu();
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("I is : " + i);
				System.out.println("enter name");
				String name = sc.nextLine();
				System.out.println("enter marks");
				double marks = sc.nextDouble();
				s[i] = new Student(name, marks);
				System.out.println(s[i]);
				i++;
			}
				break;
			case 2: {
				System.out.println("enter your roll no");
				int no = sc.nextInt();
				Student student = s[1000 - no];
				System.out.println(student.toString());
			}
				break;
			case 3: {
				System.out.println("getting all students");
				for (Student stu : s) {
					System.out.println(stu.toString());
				}
			}
				break;
			default: {
				System.exit(0);
			}
			}
			System.out.println("do you want to continue(Press Y)");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		sc.close();
	}
}
