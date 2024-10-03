package com.basics.overloading.staticMethod;

public class Tester {
	Tester() {
		System.out.println("Tester default ctor");
	}
//	a ctor cannot be static or final
	private Tester(int a) {
		this();
		System.out.println("Tester 1 Args ctor");
	}
	Tester(int a, int b) {
		this(3);
		System.out.println("Tester 2 Args ctor");
	}
	public void house() {
		System.out.println("Tester's House is RED");
	}
	
	public static void house(int a) {
		System.out.println("Tester's House is BLUE");
	}
	
	public void house(int a, int b) {
		System.out.println("Tester's House is GREEN");
	}
	
	public static void main(String[] args) {
		Tester t = new Tester();
		t.house();
		house(3);
		t.house(3, 6);
	}
}
