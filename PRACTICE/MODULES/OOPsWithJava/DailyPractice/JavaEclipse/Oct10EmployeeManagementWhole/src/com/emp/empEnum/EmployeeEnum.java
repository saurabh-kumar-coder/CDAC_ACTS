package com.emp.empEnum;

public enum EmployeeEnum {
	DEVELOPER("Is in a developer team"),
	HR("Is in a HR team"),
	MANAGER("Is in a Manager team");
	
	String empType;
	
	EmployeeEnum(String empType) {
		this.empType = empType;
	}
	
	public String getEmployeeType() {
		return this.empType;
	}
}
