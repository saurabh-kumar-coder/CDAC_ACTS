package com.abstractModal;

import com.constant.EnumDept;
import com.exception.InvalidSalaryException;

public abstract class EmployeeDetails {
	private int id;
	private String name;
	private EnumDept dept;
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDetails(int id, String name, EnumDept dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
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
	public EnumDept getDept() {
		return dept;
	}
	public void setDept(EnumDept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", dept=" + dept + "]";
		//return "";
	}
}
