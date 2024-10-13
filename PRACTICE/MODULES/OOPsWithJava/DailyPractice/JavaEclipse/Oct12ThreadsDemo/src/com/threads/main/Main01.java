package com.threads.main;

import com.threads.runImpl.MyThread01;

public class Main01 {
	public static void main(String[] args) {
		MyThread01 thread01 = new MyThread01();
		thread01.setName("Rahul");
		thread01.start();
//		MyThread01 thread02 = new MyThread01();
//		thread02.start();
		Thread t = new Thread(thread01);
		t.setName("Kiran");
		
		System.out.println("getting name of thread : " + t.getName());
		t.run();
	}
}
