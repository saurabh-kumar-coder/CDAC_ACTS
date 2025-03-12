package com.employee.DTO;

import java.time.LocalDateTime;

public class EmployeeDto {
	
	private Long employeeId;
	
	private String empName;
	
	private String firstName;
	
	private int age;
	
	private double salary;
	
	private Long managerId;
	
	private LocalDateTime createdAt;
	
	private LocalDateTime updatedAt;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	public EmployeeDto(Long employeeId, String empName, String firstName, int age, double salary, Long managerId,
			LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.firstName = firstName;
		this.age = age;
		this.salary = salary;
		this.managerId = managerId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDto(String empName, String firstName, int age, double salary, Long managerId,
			LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.empName = empName;
		this.firstName = firstName;
		this.age = age;
		this.salary = salary;
		this.managerId = managerId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	
	
}
