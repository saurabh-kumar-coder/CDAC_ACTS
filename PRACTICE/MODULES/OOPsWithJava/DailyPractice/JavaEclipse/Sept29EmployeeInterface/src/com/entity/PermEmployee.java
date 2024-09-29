package com.entity;

import com.abstractEntity.Employee;
import com.service.Payable;

public class PermEmployee extends Employee implements Payable {
	private double basic;
	private double incentive;

//	public PermEmployee(double basic, double incentive) {
//		super();
//		this.basic = basic;
//		this.incentive = incentive;
//	}

	public PermEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermEmployee(int empId, String name, String number, double basic, double incentive) {
		super(empId, name, number);
		// TODO Auto-generated constructor stub
		this.basic = basic;
		this.incentive = incentive;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getIncentive() {
		return incentive;
	}

	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return super.toString() + "PermEmployee [basic=" + basic + ", incentive=" + incentive + "]";
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		System.out.println("bonus given");
		return Payable.super.getBonus();
	}
	
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		System.out.println("Perm Employee : calc salary");
		return 0;
	}
}
