package com.entity;

public class Address {
	private String houseNo;
	private String area;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String houseNo, String area) {
		super();
		this.houseNo = houseNo;
		this.area = area;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", area=" + area + "]";
	}
}
