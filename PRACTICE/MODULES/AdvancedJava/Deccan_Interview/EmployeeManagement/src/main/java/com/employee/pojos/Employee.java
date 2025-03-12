package com.employee.pojos;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long employeeId;
	
	@Column(name = "name")
	private String empName;
	
//	@Column(name = "first_name")
//	private String firstName;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "salary")
	private double salary;
	
	@Column(name = "manager_id")
	private Long managerId;
	
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}

	@Column(name = "created_at")
	private LocalDateTime createdAt;
	
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

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

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long employeeId, String empName, String firstName, int age, double salary, Long managerId,
			LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
//		this.firstName = firstName;
		this.age = age;
		this.salary = salary;
		this.managerId = managerId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Employee(String empName, String firstName, int age, double salary, Long managerId, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		super();
		this.empName = empName;
//		this.firstName = firstName;
		this.age = age;
		this.salary = salary;
		this.managerId = managerId;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
}
