package com.tester;

import com.impl.MyThread;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		Thread t = new Thread(t1);
		t.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("Main class : " + i);
		}
	}
}
