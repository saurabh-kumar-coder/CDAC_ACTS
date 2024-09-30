package com.constant;

public enum EnumDept {
	Manager("Dept is Manager"),
	Developer("Dept is Developer"),
	Intern("Dept is Intern"),
	Consultant("Dept is Consultant");
	
	private String str;
	
	private EnumDept(String str) {
		this.str = str;
	}
}
