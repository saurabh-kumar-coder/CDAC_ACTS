package com.service;

import com.exception.InvalidSalaryException;

public interface Employee {
	double calculateSalary() throws InvalidSalaryException;
	void displayDetails() throws InvalidSalaryException;
}
