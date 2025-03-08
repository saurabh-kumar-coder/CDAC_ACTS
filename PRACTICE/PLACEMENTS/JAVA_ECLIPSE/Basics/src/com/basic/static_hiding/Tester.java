package com.basic.static_hiding;

public class Tester {
	public static void main(String[] args) {
		Parent p = new Child();
		p.fun();
	}
}
