package com.demo.main;

import com.demo.sync.Thread02;

public class Main {
	public static void main(String[] args) {
		Thread02 t1 = new Thread02();
		Thread02 t2 = new Thread02();
		t1.start();
		t2.start();
	}
}
