package com.saurabh.main;

import com.saurabh.interfaces.Calculatable;

public class Main {
	public static void main(String[] args) {
		Calculatable value = (T, R) -> T + R;
		System.out.println(value);
		int res = calSum(4, 6, new Calculatable() {
			@Override
			public int calculate(int a, int b){
				return a + b;
			}
		});
		int res1 = calSum(4,7, value);
		int res2 = calSum(5,7, (T, R)-> T + R);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
	}
	
	public static int calSum(int a, int b, Calculatable calculatable) {
		return calculatable.calculate(a, b);
	}
}