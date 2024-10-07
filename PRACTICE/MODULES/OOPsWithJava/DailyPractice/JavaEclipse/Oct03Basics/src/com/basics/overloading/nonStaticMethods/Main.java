package com.basics.overloading.nonStaticMethods;

public class Main {
	public static void sum(int a, int b) {
		System.out.println("int int :" + (a + b));
	}

	public void sum(double a, double b) {
		System.out.println("double double : " + (a + b));
	}

	public void sum(int a, double b) {
		System.out.println("int double : " + (a + b));
	}

	public double sum(float a, double b) {
		System.out.println("float double : " + (a + b));
		return a+b;
	}
	
	public void m1(String str) {
		System.out.println("String : " + str);
	}
	
	public void m1(StringBuilder str) {
		System.out.println("String Builder : " + str);
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.sum(5, 10);
		main.sum(5.0, 10);
		main.sum(5, 10.0);
		main.sum(5f, 10f);
		main.sum('a', 10);
		main.sum('a', 10.5);
		main.sum(5.5, 'b');
		main.m1("rahul");
		main.m1(new StringBuilder("Kiran"));
//		main.m1(null);
	}
}
