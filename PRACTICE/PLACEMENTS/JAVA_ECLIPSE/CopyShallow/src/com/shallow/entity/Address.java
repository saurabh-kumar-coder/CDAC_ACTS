package com.shallow.entity;

public class Address {
	private String place;

	public Address(String place) {
		super();
		this.place = place;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Address [place=" + place + "]";
	}
	
}
