package com.printer.enums;

public enum PrinterType {
	LAZER("lazer"),
	INKJET("inkjet"),
	DOTMATRIX("dotmatrix");
	
	public String printerType;

	private PrinterType(String printerType) {
		this.printerType = printerType;
	}
	public String getValue() {
		return printerType;
	}
}
