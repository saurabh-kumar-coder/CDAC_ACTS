package com.threads.runImpl;

public class MyThread01 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println("getting name :-- "+Thread.currentThread().getName());
			try {
				System.out.println("calling join");
				this.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
