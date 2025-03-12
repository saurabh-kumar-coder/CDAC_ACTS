package com.employee.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.DTO.EmployeeDto;
import com.employee.service.EmployeeService;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping
	public ResponseEntity<String> addEmployee(@RequestBody EmployeeDto employeeDto) {
		employeeService.addEmployee(employeeDto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Employee Created");
	}
	
	@PutMapping("{employeeId}")
	public ResponseEntity<String> updateEmployee(@PathVariable(name = "employeeId") Long employeeId, EmployeeDto employeeDto) {
		String result = employeeService.updateEmployee(employeeId, employeeDto);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@DeleteMapping("{employeeId}")
	public ResponseEntity<String> deleteEmployee(@PathVariable(name = "employeeId") Long employeeId) {
		employeeService.deleteEmployee(employeeId);
		return ResponseEntity.status(HttpStatus.OK).body("EMPLOYEE DELETED");
	}
	
}
