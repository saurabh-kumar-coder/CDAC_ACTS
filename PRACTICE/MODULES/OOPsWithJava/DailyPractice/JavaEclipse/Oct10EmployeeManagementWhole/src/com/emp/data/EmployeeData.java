package com.emp.data;

import static com.emp.empEnum.EmployeeEnum.DEVELOPER;
import static com.emp.empEnum.EmployeeEnum.HR;
import static com.emp.empEnum.EmployeeEnum.MANAGER;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.emp.abstractcls.Employee;
import com.emp.pojos.EmployeeKey;
public class EmployeeData {
	public static Map<EmployeeKey, Employee> getEmployeeData() {
		Map<EmployeeKey, Employee> employeeData = new HashMap<>();
		employeeData.put(new EmployeeKey("ABC", "2032564897"), new Employee(1, "ABC", "DEF", LocalDate.now(), "2032564897", new ArrayList<>(SkillsData.getSkillsData().subList(0, 1)), 20000.0, HR));
		employeeData.put(new EmployeeKey("ZET", "2032564809"), new Employee(9, "ZET", "DEF", parse("2022-02-06"), "2032564809", new ArrayList<>(SkillsData.getSkillsData().subList(0, 2)), 30000.0, MANAGER));
		employeeData.put(new EmployeeKey("POQ", "2032564866"), new Employee(2, "POQ", "DEF", parse("2021-12-16"), "2032564866", new ArrayList<>(SkillsData.getSkillsData().subList(2, 3)), 40000.0, DEVELOPER));
		employeeData.put(new EmployeeKey("POQ", "2032564865"), new Employee(2, "POQ", "DEF", parse("2021-12-16"), "2032564865", new ArrayList<>(SkillsData.getSkillsData().subList(2, 3)), 40000.0, DEVELOPER));
		return employeeData;
	}
}
