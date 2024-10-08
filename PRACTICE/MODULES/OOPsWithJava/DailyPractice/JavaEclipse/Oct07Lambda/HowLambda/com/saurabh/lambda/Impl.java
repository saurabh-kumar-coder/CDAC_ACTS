package com.saurabh.lambda;

import com.saurabh.interfaces.Printable;

public class Impl {
	public static void main(String[] args) {
		printThings(() -> System.out.println("Hello"));
	}
	public static void printThings(Printable printable) {
		printable.printable();
	}
}