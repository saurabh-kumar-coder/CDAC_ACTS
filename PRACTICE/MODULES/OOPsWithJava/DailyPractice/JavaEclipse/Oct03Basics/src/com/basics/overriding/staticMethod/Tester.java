package com.basics.overriding.staticMethod;

public class Tester {
	public static void main(String args[]) {
		// static to static overriding
		Parent parent = new Parent();
		parent.house();
		Child child = new Child();
		child.house();
		parent = new Child();
		parent.house();
		/*
		 	parent house is of RED color.
			child house is of BLUE color.
			parent house is of RED color.
		 */
		
		//non-static to static
		Parent parent1 = new Parent();
		parent1.home();
		Child child1 = new Child();
		child1.home();
		parent1 = new Child();
		parent1.home();
		/*
		 Parents home
		 childs home
		 childs home
		 */
	}
}
// once the static methods are created they cannot be overriden
// If calling the static method, If compile finds the methods first that will only be executed.