package com.saurabh.sort.comparator;

import com.saurabh.pojo.Employee;
import java.util.Comparator;
public class IdComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmpId().compareTo(o2.getEmpId());
	}
}
