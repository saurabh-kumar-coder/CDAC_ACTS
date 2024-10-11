package com.emp.interfaces;

@FunctionalInterface
public interface Payable {
	void calcSalary();
	default double bonus() {
		return 5000;
	}
}
