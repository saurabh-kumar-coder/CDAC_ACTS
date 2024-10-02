package com.entity;

import java.util.Scanner;

public class Address {
	private String houseNo;
	private String appartment;
	private String area;
	public Address() {
	
	}
	public Address(String houseNo, String appartment, String area) {
		this.houseNo = houseNo;
		this.appartment = appartment;
		this.area = area;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getAppartment() {
		return appartment;
	}
	public void setAppartment(String appartment) {
		this.appartment = appartment;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public void AAccept(Scanner sc) {
		System.out.println("enter House Number");
		setHouseNo(sc.nextLine());
		System.out.println("enter Appartment Name");
		setAppartment(sc.nextLine());
		System.out.println("enter Area");
		setArea(sc.nextLine());
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", appartment=" + appartment + ", area=" + area + "]";
	}
	
}
