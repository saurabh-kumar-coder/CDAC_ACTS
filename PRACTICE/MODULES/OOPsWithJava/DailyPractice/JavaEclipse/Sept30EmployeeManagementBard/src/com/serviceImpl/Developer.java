package com.serviceImpl;

import com.abstractModal.SalariedEmployee;
import com.constant.EnumDept;
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
	public double calculateSalary() {
		// TODO Auto-generated method stub
//		System.out.println("printing Developer salary");
		double salary = (getSalaryPay() + tip() + giveBonus());
		//System.out.println("Salary of Developer is : " + salary);
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
		return super.toString() + "Developer [calculateSalary()=" + calculateSalary() + ", tip()=" + tip() + "]";
	}
	
}
