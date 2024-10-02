package com.serviceImpl;

import com.abstractModal.SalariedEmployee;
import com.constant.EnumDept;
import com.exception.InvalidSalaryException;
import com.service.PayableBonus;

public class Manager extends SalariedEmployee implements PayableBonus {
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int id, String name, EnumDept dept, double salaryPay) {
		super(id, name, dept, salaryPay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() throws InvalidSalaryException {
		// TODO Auto-generated method stub
//		System.out.println("printing Manager salary");
		double salary = (getSalaryPay() + tip()+ giveBonus());
		//System.out.println("Salary of Manager is : " + salary);
		if(salary <= 0) {
			throw new InvalidSalaryException("Salary should not be less than or equal to 0");
		} 
		return salary;
	}

	@Override
	public void displayDetails() throws InvalidSalaryException {
		// TODO Auto-generated method stub
		System.out.println("id : "+this.getId() + " "
				+ " name : " + this.getName() + " "
				+ " dept : " + this.getDept() + " "
				+ " salary-pay : " + this.getSalaryPay() + " "
				+ " calcSalary : " + this.calculateSalary() + " "
				+ " tip : " + this.tip() + " "
				+ " bonus : " + this.giveBonus());
	}
	
	@Override
	public double giveBonus() {
		// TODO Auto-generated method stub
		return 000;
	}

	@Override
	public double tip() {
		// TODO Auto-generated method stub
//		System.out.println("giving tip to Manager : ");
		return 000;
	}
	
	
	@Override
	public String toString() {
		try {
			return super.toString() + "Manager [calculateSalary()=" + calculateSalary() + ", tip()=" + tip() + "]";
		} catch (InvalidSalaryException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return super.toString();
	}
}
