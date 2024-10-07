package com.saurabh.operations;

public class Operations<T extends Number> {
	T num1;
	T num2;
	Operations(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	void addition() {
		double sum = num1.doubleValue() + num2.doubleValue();
		System.out.println(sum);
	}
	
	void subtraction() {
		double diff = num1.doubleValue() - num2.doubleValue();
		System.out.println(diff);
	}
}
