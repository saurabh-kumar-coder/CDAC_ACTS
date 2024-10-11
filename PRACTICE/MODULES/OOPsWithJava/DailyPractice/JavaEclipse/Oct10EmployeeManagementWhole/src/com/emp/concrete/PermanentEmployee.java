package com.emp.concrete;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.emp.abstractcls.Employee;
import com.emp.empEnum.EmployeeEnum;
import com.emp.interfaces.Payable;
import com.emp.pojos.Skills;

public class PermanentEmployee extends Employee implements Serializable, Payable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 83020166443717916L;
	private Double monthlySalary;

	public PermanentEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(Integer employeeId, String firstName, String lastName, LocalDate dateOfJoining,
			String phoneNo, List<Skills> skills, Double salary, EmployeeEnum empType) {
		super(employeeId, firstName, lastName, dateOfJoining, phoneNo, skills, salary, empType);
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(Double monthlySalary) {
		super();
		this.monthlySalary = monthlySalary;
	}

	public Double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(Double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public String toString() {
		return super.toString() + "PermanentEmployee [monthlySalary=" + monthlySalary + "]";
	}

	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		setSalary(getMonthlySalary());
	}
}
