package com.saurabh.pojo;
import java.time.LocalDate;

public class Employee implements Comparable<Employee> {
	private Integer empId;
	private String empName;
	private String empDept;
	private LocalDate empDoj;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String empName, String empDept, LocalDate empDoj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empDoj = empDoj;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
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
	public LocalDate getEmpDoj() {
		return empDoj;
	}
	public void setEmpDoj(LocalDate empDoj) {
		this.empDoj = empDoj;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empDoj=" + empDoj
				+ "]";
	}
	public int compareTo(Employee e) {
		return this.empId.compareTo(e.empId);
	}
//	public int compareTo(Employee e) {
//		return this.empName.compareTo(e.empName);
//	}
//	public int compareTo(Employee e) {
//		return this.empDoj.compareTo(e.empDoj);
//	}
}
