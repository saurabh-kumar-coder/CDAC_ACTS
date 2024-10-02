package com.serviceImpl;

import com.abstractModal.SalariedEmployee;
import com.constant.EnumDept;
import com.exception.InvalidSalaryException;
import com.service.PayableBonus;

public class Developer extends SalariedEmployee implements PayableBonus {
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(int id, String name, EnumDept dept,double salaryPay) {
		super(id, name, dept, salaryPay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateSalary() throws RuntimeException {
		// TODO Auto-generated method stub
//		System.out.println("printing Developer salary");
		double salary = (getSalaryPay() + tip() + giveBonus());
		//System.out.println("Salary of Developer is : " + salary);
		if(salary <= 0) {
			throw new RuntimeException("Salary should not be less than or equal to 0");
		} 
		return salary;
	}

	@Override
	public void displayDetails() {
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
		return 500;
	}

	@Override
	public double tip() {
		// TODO Auto-generated method stub
//		System.out.println("giving tip to Developer : ");
		return 3000;
	}

	@Override
	public String toString() {
		try {
			return super.toString() + "Developer [calculateSalary()=" + calculateSalary() + ", tip()=" + tip() + "]";
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
		}
		return super.toString();
	}
	
}
