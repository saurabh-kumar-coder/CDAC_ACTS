package com.abstractModal;

import com.constant.EnumDept;
import com.service.Employee;

public abstract class SalariedEmployee extends EmployeeDetails implements Employee {
	private double salaryPay;
	
	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int id, String name, EnumDept dept, double salaryPay) {
		super(id, name, dept);
		this.salaryPay = salaryPay;
	}

	public double getSalaryPay() {
		return salaryPay;
	}

	public void setSalaryPay(double salaryPay) {
		this.salaryPay = salaryPay;
	}

	@Override
	public String toString() {
		return super.toString() + "SalariedEmployee [salaryPay=" + salaryPay + "]";
	}

	@Override
	public abstract double calculateSalary();

	@Override
	public abstract void displayDetails();
}