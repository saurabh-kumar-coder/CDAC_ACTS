package com.saurabh.utility;

public enum EnumBookType {
	FANTASY("FANTASY"),
	MYSTERY("MYSTERY"),
	HORROR("HORROR"),
	THRILLER("THRILLER"),
	FICTION("FICTION");
	
	String bookType;
	
	private EnumBookType(String bookType) {
		this.bookType = bookType;
	}
	public String getBookType() {
		return this.bookType;
	}
}