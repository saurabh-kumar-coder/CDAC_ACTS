package com.cp.impl;

import com.cp.services.ProducerConsumer;

public class Impl {
	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer producerConsumer = new ProducerConsumer();
		
		Thread consume = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					producerConsumer.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread produce = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					producerConsumer.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		produce.start();
		consume.start();
		
		produce.join();
		consume.join();
		
	}
}
