package com.abstractEntity;

public abstract class Employee {
	int empId;
	String name;
	String number;
//	double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String name, String number) {
		super();
		this.empId = empId;
		this.name = name;
		this.number = number;
//		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
//	public double getSalary() {
//		return salary;
//	}
//	public void setSalary(double salary) {
//		this.salary = salary;
//	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", phone number=" + number + "]";
	}
		
}
