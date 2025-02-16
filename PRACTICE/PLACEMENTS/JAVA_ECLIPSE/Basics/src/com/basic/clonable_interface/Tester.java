package com.basic.clonable_interface;

public class Tester implements Cloneable{
	int t;
	public void fun() {
		System.out.println("fun called");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Tester t = new Tester();
		Tester t1 = (Tester)t.clone();
		t.t = 5;
		System.out.println(t.t);
		t.fun();
		System.out.println(t1.t);
		t1.fun();
	}
}
