package com.tester;

import com.impl.MyThread;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		for(int i = 0; i < 5; i++) {
			System.out.println("Main class : " + i);
		}
	}
}
