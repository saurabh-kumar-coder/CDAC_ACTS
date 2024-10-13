package com.demo.sync;

public class Thread02 extends Thread {

	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			System.out.println("thread name : "+ this.currentThread().getName() + " " + i);
			try {
				this.sleep(90);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
