package com.entity;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.utility.DateUtility;
import com.utility.EnumTitle;

public class Employee {
	private int empId;
	private String empName;
	private EnumTitle title;
//	private String doj;
	private Date doj;
	private Address address;
	public Employee() {
		
	}
	public Employee(int empId, String empName, EnumTitle title, Date doj, Address address) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.title = title;
		this.doj = doj;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public EnumTitle getTitle() {
		return title;
	}
	public void setTitle(EnumTitle title) {
		this.title = title;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void EAccept(Scanner sc) throws ParseException {
		System.out.println("enter Employee id");
		setEmpId(sc.nextInt());
		sc.nextLine();
		System.out.println("enter Employee Name");
		setEmpName(sc.nextLine());
		System.out.println("enter Employee Title");
		String strTitle = sc.nextLine();
		setTitle(EnumTitle.valueOf(strTitle.toUpperCase()));
//		System.out.println(getTitle().getValue());
		System.out.println("enter Employee Date of Joining");
		String stringDate = sc.nextLine();
		Date dd = DateUtility.getDate(stringDate);
		setDoj(dd);
		System.out.println("enter Employee Address");
		Address s = new Address();
		s.AAccept(sc);
		setAddress(s);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", title=" + title + ", doj=" + doj + ", address="
				+ getAddress() + "]";
	}
	
}
