package com.emp.interfaces;

@FunctionalInterface
public interface Payable {
	double calcSalary();
	default double bonus() {
		return 5000;
	}
}
