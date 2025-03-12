package com.employee.mapper;

import com.employee.DTO.EmployeeDto;
import com.employee.pojos.Employee;

public class EmployeeMapper {

	public static Employee mapEmployeeDtoToEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmpName(employeeDto.getEmpName());
//		employee.setFirstName(employeeDto.getFirstName());
		employee.setAge(employeeDto.getAge());
		employee.setCreatedAt(employeeDto.getCreatedAt());
		employee.setUpdatedAt(employeeDto.getUpdatedAt());
		employee.setManagerId(employeeDto.getManagerId());
		employee.setSalary(employeeDto.getSalary());
		return employee;
	}

}
