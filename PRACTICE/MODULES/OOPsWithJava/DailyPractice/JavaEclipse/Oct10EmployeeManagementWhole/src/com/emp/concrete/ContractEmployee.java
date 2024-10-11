package com.emp.concrete;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.emp.abstractcls.Employee;
import com.emp.empEnum.EmployeeEnum;
import com.emp.interfaces.Payable;
import com.emp.pojos.Skills;

public class ContractEmployee extends Employee implements Serializable, Payable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4295876973667840520L;
	private Double ratePerHour;
	private Double hours;

	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(Integer employeeId, String firstName, String lastName, LocalDate dateOfJoining,
			String phoneNo, List<Skills> skills, Double salary, EmployeeEnum empType) {
		super(employeeId, firstName, lastName, dateOfJoining, phoneNo, skills, salary, empType);
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(Double ratePerHour, Double hours) {
		super();
		this.ratePerHour = ratePerHour;
		this.hours = hours;
	}

	public Double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(Double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public Double getHours() {
		return hours;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}
	
	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [ratePerHour=" + ratePerHour + ", hours=" + hours + "]";
	}

	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		setSalary(getHours() * getRatePerHour());
	}
}
