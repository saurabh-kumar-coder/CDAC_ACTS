package com.service;

@FunctionalInterface
public interface Payable {
	double calcSalary();
	default double getBonus() {
		return 0.0;
	}
}
