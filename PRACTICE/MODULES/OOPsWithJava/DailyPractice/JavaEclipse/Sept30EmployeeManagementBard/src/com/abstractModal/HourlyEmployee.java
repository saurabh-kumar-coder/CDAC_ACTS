package com.abstractModal;

import com.constant.EnumDept;
import com.service.Employee;

public abstract class HourlyEmployee extends EmployeeDetails implements Employee {
	private double hourlyPay;
	private double noOfHours;
	
	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(int id, String name, EnumDept dept, double hourlyPay, double noOfHours) {
		super(id, name, dept);
		this.hourlyPay = hourlyPay;
		this.noOfHours = noOfHours;
	}

	public double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	public double getNoOfHours() {
		return noOfHours;
	}

	public void setNoOfHours(double noOfHours) {
		this.noOfHours = noOfHours;
	}

	@Override
	public String toString() {
		return super.toString() + "HourlyEmployee [hourlyPay=" + hourlyPay + ", noOfHours=" + noOfHours + "]";
	}

	@Override
	public abstract double calculateSalary();

	@Override
	public abstract void displayDetails();
}