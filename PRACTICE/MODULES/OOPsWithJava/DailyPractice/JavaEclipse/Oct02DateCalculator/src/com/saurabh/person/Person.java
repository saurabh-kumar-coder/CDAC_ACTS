package com.saurabh.person;

import java.util.Date;

public class Person {
	private String name;
	private String dept;
	private Date dob;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String dept, Date dob) {
		super();
		this.name = name;
		this.dept = dept;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dept=" + dept + ", dob=" + dob + "]";
	}
	
}
