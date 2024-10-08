package com.saurabh.pojo;

import java.time.LocalDate;

public class Student {
	private StudentKey studentKey;
	private String name;
	private LocalDate localDate;
	public Student() {
		
	}
	public Student(Integer rollNo, String division, String standard, String name, LocalDate localDate) {
		this.studentKey = new StudentKey(rollNo, division, standard);
		this.name = name;
		this.localDate = localDate;
	}
	public StudentKey getStudentKey() {
		return studentKey;
	}
	public void setStudentKey(StudentKey studentKey) {
		this.studentKey = studentKey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	@Override
	public String toString() {
		return "Student [studentKey=" + studentKey + ", name=" + name + ", localDate=" + localDate + "]";
	}
	
}
