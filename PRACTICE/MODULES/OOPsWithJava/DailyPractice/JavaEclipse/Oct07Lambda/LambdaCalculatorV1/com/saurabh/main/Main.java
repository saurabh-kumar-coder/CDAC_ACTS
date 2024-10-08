package com.saurabh.main;

import com.saurabh.interfaces.Calculatable;
import com.saurabh.pojo.Student;

public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		int value = student.calculate(5, 6);
		System.out.println(value);
		
	}
	
}
//int value = calSum(student);
//System.out.println(value);
//
//public static int calSum(Calculatable calculatable) {
//	return calculatable.calculate(5, 6);
//}