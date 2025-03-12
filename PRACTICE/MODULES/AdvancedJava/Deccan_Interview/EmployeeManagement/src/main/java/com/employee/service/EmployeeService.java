package com.employee.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.DTO.EmployeeDto;
import com.employee.mapper.EmployeeMapper;
import com.employee.pojos.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void addEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee = EmployeeMapper.mapEmployeeDtoToEmployee(employeeDto);
//		BeanUtils.copyProperties(employeeDto, employee);
		employeeRepository.save(employee);
	}

	public void deleteEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeId);
	}

	public String updateEmployee(Long employeeId, EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		boolean existsById = employeeRepository.existsById(employeeId);
		if(existsById == false) {
			return "No employee Found with Id : " + employeeId;
		} else {
			Employee employee = new Employee();
			BeanUtils.copyProperties(employeeDto, employee);
			employeeRepository.save(employee);
			return "Employee Updated";
		}
	}

}
