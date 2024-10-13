package com.pc.impl;

import com.pc.services.ProducerConsumer;

public class Impl {
	public static void main(String[] args) throws InterruptedException {
		final ProducerConsumer pc = new ProducerConsumer();
		Thread producer = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread consumer = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		producer.start();
		consumer.start();

		producer.join();
		consumer.join();
	}
}
