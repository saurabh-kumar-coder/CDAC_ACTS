package com.entity;

public class Employee implements Cloneable {
	private int empId;
	private String empName;
	private String empDept;
	private double salary;
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, String empDept, double salary, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.salary = salary;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee employee = (Employee)super.clone();
		employee.setAddress(new Address(getAddress().getHouseNo(), getAddress().getArea()));
		return employee;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId 
				+ ", empName=" + empName 
				+ ", empDept=" + empDept 
				+ ", salary=" + salary
				+ ", Address=" + address
				+ "]";
	}
}