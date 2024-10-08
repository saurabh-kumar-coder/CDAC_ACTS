package com.saurabh.main;

import com.saurabh.interfaces.Calculatable;
import com.saurabh.pojo.Student;

public class Main {
	public static void main(String[] args) {
		Calculatable value = (T, R) -> T + R;
		System.out.println(value);
		int res = calSum(value);
		System.out.println(res);
	}
	
	public static int calSum(Calculatable calculatable) {
		return calculatable.calculate(5, 6);
	}
}