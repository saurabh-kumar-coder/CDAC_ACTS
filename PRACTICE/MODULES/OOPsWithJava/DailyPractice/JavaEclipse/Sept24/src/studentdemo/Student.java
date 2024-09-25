package studentdemo;

public class Student {
	static int stuId = 1000;
	private String stuName;
	private double marks;
	
	public Student() {
		stuId++;
	}
	public Student(String stuName, double marks) {
		stuId++;		
		System.out.println("STU ID : "+stuId);
		this.stuName = stuName;
		this.marks = marks;
	}
	public void display() {
		System.out.println("Id is : " + stuId);
		System.out.println("Name is : "+ stuName);
		System.out.println("marks is : "+ marks);
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", marks=" + marks + "]";
	}
	
}
