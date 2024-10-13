package com.cp.services;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
	BlockingQueue<Integer> bq = new ArrayBlockingQueue<Integer>(2);
	Integer value = 0;

	public void consume() throws InterruptedException {
		while (true) {
			Thread.sleep(500);
			bq.put(value);
			System.out.println("producer produced : " + value++);

		}
	}

	public void produce() throws InterruptedException {
		while(true) {
			Thread.sleep(500);
			Integer value = bq.take();
			System.out.println("Consumer consuming : " + value);
		}
	}
}
