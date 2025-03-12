package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.pojos.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
