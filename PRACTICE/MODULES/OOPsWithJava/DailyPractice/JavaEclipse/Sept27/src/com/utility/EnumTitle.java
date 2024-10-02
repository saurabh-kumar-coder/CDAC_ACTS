package com.utility;

public enum EnumTitle {
	HR("HUMAN RESOURCE"),
	SW("SOFTWARE DEVELOPER"),
	MN("MANAGER"),
	PN("PEON");
	private String etitle;
	
	private EnumTitle(String string) {
		this.etitle = string;
	}
	
	
	public String getValue() {
		return this.etitle;
	}
	
}