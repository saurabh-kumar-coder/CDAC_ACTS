package com.saurabh.impl;

import com.saurabh.interfaces.Printable;
import com.saurabh.pojo.Person;

public class Impl {
	public static void main(String[] args) {
		Person person = new Person();
//		person.printable();
//		---------------
		printSomething(person);
	}
	public static void printSomething(Printable printable) {
		printable.printable();
	}
}
