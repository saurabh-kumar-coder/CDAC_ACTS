package com.deep.entity;

public class Student implements Cloneable {
	private int rollNo;
	private Address address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student student = (Student)super.clone();
		student.address = new Address(this.address.getPlace());
		return student;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", address=" + address + "]";
	}
	
}
