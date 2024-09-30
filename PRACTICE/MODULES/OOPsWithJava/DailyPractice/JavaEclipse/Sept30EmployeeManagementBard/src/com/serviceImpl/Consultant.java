package com.serviceImpl;

import com.abstractModal.HourlyEmployee;
import com.constant.EnumDept;
import com.service.PayableBonus;

public class Consultant extends HourlyEmployee implements PayableBonus {
	
	public Consultant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consultant(int id, String name, EnumDept dept, double hourlyPay, double noOfHours) {
		super(id, name, dept, hourlyPay, noOfHours);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
//		System.out.println("printing Consultant salary");
		double salary = (getHourlyPay() * getNoOfHours() + tip());
		//System.out.println("Salary of Consultant is : " + salary);
		return salary;
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("id : "+this.getId() + " "
				+ " name : " + this.getName() + " "
				+ " dept : " + this.getDept() + " "
				+ " hourly-pay : " + this.getHourlyPay() + " "
				+ " calcSalary : " + this.calculateSalary() + " "
				+ " tip : " + this.tip() + " "
				+ " bonus : " + this.giveBonus());
	}
	@Override
	public double tip() {
		// TODO Auto-generated method stub
//		System.out.println("giving bonus to Consultant");
		return 1000.0;
	}

	@Override
	public String toString() {
		return super.toString() + "Consultant [calculateSalary()=" + calculateSalary() + ", tip()=" + tip() + "]";
	}
	
}
