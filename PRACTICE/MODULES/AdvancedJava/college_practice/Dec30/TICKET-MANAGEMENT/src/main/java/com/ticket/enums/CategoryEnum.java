package com.ticket.enums;

public enum CategoryEnum {
	SIM("SIM"),
	CALLING("CALLING"),
	BROADBAND("BROADBAND");
	
	String categoryEnum;
	
	private CategoryEnum(String categoryEnum) {
		// TODO Auto-generated constructor stub
		this.categoryEnum = categoryEnum;
	}
	
	public String getValue() {
		return this.categoryEnum;
	}
	
}
