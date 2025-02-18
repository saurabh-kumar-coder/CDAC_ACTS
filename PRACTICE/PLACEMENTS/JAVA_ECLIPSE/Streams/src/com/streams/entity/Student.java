package com.streams.entity;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private int age;
	private String gender;
	private char grade;
	private double marks;
	private String city;
	private List<String> courses;
	private double attendancePercentage;
	private int enrollmentYear;

	// Constructor
	public Student(int id, String name, int age, String gender, char grade, double marks, String city,
			List<String> courses, double attendancePercentage, int enrollmentYear) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.grade = grade;
		this.marks = marks;
		this.city = city;
		this.courses = courses;
		this.attendancePercentage = attendancePercentage;
		this.enrollmentYear = enrollmentYear;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public double getAttendancePercentage() {
		return attendancePercentage;
	}

	public void setAttendancePercentage(double attendancePercentage) {
		this.attendancePercentage = attendancePercentage;
	}

	public int getEnrollmentYear() {
		return enrollmentYear;
	}

	public void setEnrollmentYear(int enrollmentYear) {
		this.enrollmentYear = enrollmentYear;
	}

	// toString() method for easy debugging
	@Override
	public String toString() {
		return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", gender='" + gender + '\''
				+ ", grade=" + grade + ", marks=" + marks + ", city='" + city + '\'' + ", courses=" + courses
				+ ", attendancePercentage=" + attendancePercentage + ", enrollmentYear=" + enrollmentYear + '}';
	}

}
