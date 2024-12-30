package com.ticket.enums;

public enum StatusEnum {
	OPEN("OPEN"),
	IN_PROGRESS("IN_PROGRESS"),
	RESOLVED("RESOLVED");
	
	String statusEnum;
	
	private StatusEnum(String statusEum) {
		// TODO Auto-generated constructor stub
		this.statusEnum = statusEum;
	}
	
	public String getvalue() {
		return this.statusEnum;
	}
	
}
