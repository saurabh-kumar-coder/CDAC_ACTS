package com.serviceImpl;

import com.abstractModal.HourlyEmployee;
import com.constant.EnumDept;
import com.service.PayableBonus;

public class Intern extends HourlyEmployee implements PayableBonus {
	
	public Intern() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Intern(int id, String name, EnumDept dept, double hourlyPay, double noOfHours) {
		super(id, name, dept, hourlyPay, noOfHours);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
//		System.out.println("printing Intern salary");
		double salary = (super.getHourlyPay() * super.getNoOfHours() + tip());
		//System.out.println("Salary of Intern is : " + salary);
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
//		System.out.println("giving tip to Intern : ");
		return 300;
	}

	@Override
	public String toString() {
		return super.toString() + "Intern [calculateSalary()=" + calculateSalary() + ", tip()=" + tip() + "]";
	}
	
}