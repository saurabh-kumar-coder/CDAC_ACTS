package com.basic.this_keyword;

public class Child extends Parent {
	int a;
	public Child() {
		super();
		System.out.println("default Child");
	}
	public Child(int a) {
		super(a);
		System.out.println("parameterized ctor called");
	}
}
