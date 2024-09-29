package com.entity;

import com.abstractEntity.Employee;
import com.service.Payable;

public class NoSalaryEmployee extends Employee implements Payable{
	private String team;
	
	public NoSalaryEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NoSalaryEmployee(String team) {
		super();
		this.team = team;
	}

	public NoSalaryEmployee(int empId, String name, String number, String team) {
		super(empId, name, number);
		// TODO Auto-generated constructor stub
		this.team = team;
	}
	
	@Override
	public String toString() {
		return super.toString() + "NoSalaryEmployee [team=" + team + "]";
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		System.out.println("You are not paid for work...");
		return 0;
	}
}
