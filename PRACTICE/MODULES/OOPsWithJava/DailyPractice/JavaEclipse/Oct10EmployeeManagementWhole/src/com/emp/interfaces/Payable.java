package com.emp.interfaces;

@FunctionalInterface
public interface Payable {
	Double calcSalary();
	default double bonus() {
		return 5000;
	}
}
