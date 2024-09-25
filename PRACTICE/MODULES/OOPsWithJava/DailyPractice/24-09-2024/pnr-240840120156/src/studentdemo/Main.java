package studentdemo;

/*
 * Write a Java program to create Student class with properties with rollNo, name, marks. Write printData method for printing Student. Create Default and parameterized constructor. Generate rollNo automatically using static field.
 */

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student("hero", 90);
		System.out.println("Student st1 details:");
		st1.display();
		Student st2 = new Student("Zero", 35);
		System.out.println("Student st2 details:");
		st2.display();
	}
}
