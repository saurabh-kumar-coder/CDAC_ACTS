package com.basic.this_keyword;

public class Parent {
	int a;
	public Parent() {
		// TODO Auto-generated constructor stub
		System.out.println("default ctor parent");
	}
	public Parent(int a) {
		System.out.println("parameterized ctot parent");
	}
	public void fun() {
		System.out.println("fun called with no args");
	}
	public void fun(int a) {
		System.out.println("fun called with one args");
	}
}
