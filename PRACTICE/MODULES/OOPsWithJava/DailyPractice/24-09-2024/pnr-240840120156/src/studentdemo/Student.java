package studentdemo;

public class Student {
	int stuId = 1000;
	String stuName;
	double marks;
	
	public Student() {
	
	}
	public Student(String stuName, double marks) {
		this.stuId = stuId++;
		this.stuName = stuName;
		this.marks = marks;
	}
	public void display() {
		System.out.println("Id is : " + stuId);
		System.out.println("Name is : "+ stuName);
		System.out.println("marks is : "+ marks);
	}
}
