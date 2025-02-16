package com.basic.clonable_interface;

public class Student implements Cloneable {
	String name;
	Address address;

	public Student(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student clonedStudent = (Student) super.clone();
		clonedStudent.address = new Address(this.address.houseNo);
		return clonedStudent;
	}

	public String display() {
		return "Student [name=" + name + ", address=" + address.houseNo + "]";
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address addr = new Address(23);
		Student st = new Student("saurabh", addr);
		Student st1 = (Student)st.clone();
		System.out.println(st.display());
		System.out.println(st1.display());
		
		System.out.println("change data now");
		
		st.address.houseNo = 69;
		st1.address.houseNo = 88;
		System.out.println(st.display());
		System.out.println(st1.display());
	}
}
