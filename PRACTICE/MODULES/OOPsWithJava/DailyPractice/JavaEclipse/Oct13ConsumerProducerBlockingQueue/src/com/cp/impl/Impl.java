package com.cp.impl;

import com.cp.services.ProducerConsumer;

public class Impl {
	public static void main(String[] args) throws InterruptedException {
		ProducerConsumer producerConsumer = new ProducerConsumer();
		
		Thread consume = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				producerConsumer.consume();
			}
		});
		
		Thread produce = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				producerConsumer.produce();
			}
		});
		
		produce.start();
		consume.start();
		
		produce.join();
		consume.join();
		
	}
}
