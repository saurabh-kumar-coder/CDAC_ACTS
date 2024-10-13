package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@RestController
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@PostMapping("/employee")
	public String createNewEmployee(Employee employee) {
		employeeRepository.save(employee);
		return "employee saved";
	}
}
