package com.emp.abstractcls;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.emp.empEnum.EmployeeEnum;
import com.emp.pojos.EmployeeKey;
import com.emp.pojos.Skills;
public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2518827404626588128L;
	private EmployeeKey employeeKey;
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private LocalDate dateOfJoining;
	private String phoneNo;
	private List<Skills> skills;
	transient Double salary;
	private EmployeeEnum empType;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer employeeId, String firstName, String lastName, LocalDate dateOfJoining, String phoneNo,
			List<Skills> skills, Double salary, EmployeeEnum empType) {
		super();
		this.employeeKey = new EmployeeKey(firstName, phoneNo);
		this.employeeId = employeeId == 0 ? 1 : employeeId;
		this.firstName = (firstName != null && firstName.equals(null)) ? "ABC" : firstName;
		this.lastName = (lastName != null && lastName.equals(null)) ? "DEF" : lastName;
		this.dateOfJoining = dateOfJoining == null ? LocalDate.now() : dateOfJoining;
		this.phoneNo = (phoneNo != null && phoneNo.equals(null)) ? "2015547896" : phoneNo;
		this.skills = (skills); // == null ? new ArrayList<>() : new ArrayList<>();
		this.salary = salary == null ? 2000.0 : 3000.0;
		this.empType = empType;
	}
	public EmployeeKey getEmployeeKey() {
		return employeeKey;
	}
	public void setEmployeeKey(EmployeeKey employeeKey) {
		this.employeeKey = employeeKey;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public List<Skills> getSkills() {
		return skills;
	}
	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public EmployeeEnum getEmpType() {
		return empType;
	}
	public void setEmpType(EmployeeEnum empType) {
		this.empType = empType;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfJoining=" + dateOfJoining + ", phoneNo=" + phoneNo + ", skills=" + skills + ", salary="
				+ salary + ", empType=" + empType + "]";
	}
	
}
