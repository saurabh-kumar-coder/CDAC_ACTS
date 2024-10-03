package com.basics.overriding.nonstaticMethod;

public class Tester {
	public static void main(String args[]) {
//		testing non-static to non-static method
		Parent parent = new Parent();
		parent.house();
		Child child = new Child();
		child.house();
		parent = new Child();
		parent.house();
	}
}
