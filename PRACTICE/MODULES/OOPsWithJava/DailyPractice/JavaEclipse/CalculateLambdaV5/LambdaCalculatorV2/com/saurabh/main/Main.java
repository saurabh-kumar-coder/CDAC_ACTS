package com.saurabh.main;

 interface Calculatable {
	public int calculate(int a, int b);
}

public class Main {
	public static void main(String[] args) {
		
		Calculatable obj = (m,n) -> m+n;
		System.out.println(obj.calculate(2, 5));
	}
}