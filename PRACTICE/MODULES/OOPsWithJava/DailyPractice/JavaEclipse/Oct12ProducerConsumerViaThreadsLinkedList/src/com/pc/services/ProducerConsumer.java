package com.pc.services;

import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
	LinkedList<Integer> list = new LinkedList<>();
	int capacity = 3;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (this) {
				while (list.size() == capacity) 
					wait();
				System.out.println("Producer produced :- " + value);
				list.add(value++);
				notify();
				Thread.sleep(500);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (list.size() == 0) 
					wait();
				int val = list.removeFirst();
				System.out.println("consumer consumed :- " + val);
				notify();
				Thread.sleep(500);
			}
		}
	}
}
