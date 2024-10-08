package com.saurabh.pojo;

import com.saurabh.interfaces.Calculatable;

public class Student implements Calculatable {
	public int calculate(int a, int b) {
		return a + b;
	}
}
