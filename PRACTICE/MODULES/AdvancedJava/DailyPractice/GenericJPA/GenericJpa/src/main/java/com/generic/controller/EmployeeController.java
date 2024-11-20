package com.generic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generic.entity.Employee;
import com.generic.service.GenericService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private GenericService<Employee> employeeService;
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
	@GetMapping("/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeService.findById(id);
	}
	
	@GetMapping
	public Iterable<Employee> getAllEmployees() {
		return employeeService.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		employeeService.delete(id);
	}
	
	@GetMapping("/{name}")
	public Employee getByName(@PathVariable String name) {
		return employeeService.findByName(name);
	}
	
}
