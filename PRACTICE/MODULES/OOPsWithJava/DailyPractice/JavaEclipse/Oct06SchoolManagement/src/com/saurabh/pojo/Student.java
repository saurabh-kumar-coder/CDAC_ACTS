package com.saurabh.pojo;
import java.util.Objects;
public class Student {
	private Integer rollNo;
	private Integer standard;
	private String division;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer rollNo, Integer standard, String division) {
		super();
		this.rollNo = rollNo;
		this.standard = standard;
		this.division = division;
	}
	public Student(Integer rollNo, Integer standard, String division, String name) {
		super();
		this.rollNo = rollNo;
		this.standard = standard;
		this.division = division;
		this.name = name;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	public Integer getStandard() {
		return standard;
	}
	public void setStandard(Integer standard) {
		this.standard = standard;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", standard=" + standard + ", division=" + division + ", name=" + name
				+ "]";
	}
	
	public boolean equals(Object obj) {
//		null check
		if(obj == null) {
			return false;
		}
//		invoking object is null
		if(this == obj) {
			return true;
		}
//		type check
		if(!(obj instanceof Student)) {
			return false;
		}
		Student stu = (Student)obj;
		return Objects.equals(rollNo, stu.rollNo)
				&& standard == stu.standard
				&& division.equals(stu.division);
	}
	public int hashCode() {
		int hashReturn = Objects.hash(rollNo, standard, division);
		return hashReturn;
	}
}
