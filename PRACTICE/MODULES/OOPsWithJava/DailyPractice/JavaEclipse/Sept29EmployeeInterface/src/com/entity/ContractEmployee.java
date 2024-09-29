package com.entity;

import com.abstractEntity.Employee;
import com.service.Payable;

public class ContractEmployee extends Employee implements Payable{
	private int noOfDays;
	private double ratePerDay;
	
	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int empId, String name, String number, int noOfDays, double ratePerDay) {
		super(empId, name, number);
		// TODO Auto-generated constructor stub
		this.noOfDays = noOfDays;
		this.ratePerDay = ratePerDay;
	}
	
	public ContractEmployee(int noOfDays, double ratePerDay) {
		super();
		this.noOfDays = noOfDays;
		this.ratePerDay = ratePerDay;
	}

	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [noOfDays=" + noOfDays + ", ratePerDay=" + ratePerDay + "]";
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public double getRatePerDay() {
		return ratePerDay;
	}

	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}

	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		System.out.println("Contract Employee : calc salary");
		System.out.println("Salary of contract employee : " + getNoOfDays() * getRatePerDay());
		return 0;
	}
}
