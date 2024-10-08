package com.saurabh.pojo;

import com.saurabh.interfaces.Printable;

public class Person implements Printable {
	int id;
	String name;
	@Override
	public void printable() {
		// TODO Auto-generated method stub
		System.out.println("printing data");
	}
}
