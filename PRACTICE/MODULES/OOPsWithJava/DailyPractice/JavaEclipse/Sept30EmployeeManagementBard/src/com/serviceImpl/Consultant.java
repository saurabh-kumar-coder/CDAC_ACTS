package com.serviceImpl;

import com.abstractModal.HourlyEmployee;
import com.constant.EnumDept;
import com.exception.InvalidHourException;
import com.exception.InvalidSalaryException;
import com.service.PayableBonus;

public class Consultant extends HourlyEmployee implements PayableBonus {
	
	public Consultant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consultant(int id, String name, EnumDept dept, double hourlyPay, double noOfHours) throws InvalidHourException {
		super(id, name, dept, hourlyPay, noOfHours);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() throws InvalidSalaryException {
		// TODO Auto-generated method stub
		double salary = (getHourlyPay() * getNoOfHours() + tip());
		if(salary <= 0) {
			throw new InvalidSalaryException("Salary should not be less than or equal to 0");
			
		} 
			return salary;
	}

	@Override
	public void displayDetails()  {
		// TODO Auto-generated method stub
		try {
			System.out.println("id : "+this.getId() + " "
					+ " name : " + this.getName() + " "
					+ " dept : " + this.getDept() + " "
					+ " hourly-pay : " + this.getHourlyPay() + " "
					+ " calcSalary : " + this.calculateSalary() + " "
					+ " tip : " + this.tip() + " "
					+ " bonus : " + this.giveBonus());
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	@Override
	public double tip() {
		// TODO Auto-generated method stub
//		System.out.println("giving bonus to Consultant");
		return 0.0;
	}

	@Override
	public String toString() {
		try {
			return super.toString() + "Consultant [calculateSalary()=" + calculateSalary() + ", tip()=" + tip() + "]";
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return super.toString();
	}
	
}
