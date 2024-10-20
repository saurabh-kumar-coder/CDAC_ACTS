package com.tester;

import com.impl.Queues;

public class Tester {
	public static void main(String[] args) {
		Queues<Integer> queue = new Queues<Integer>(0, 0, 5);
		queue.enQueue(50);
		queue.enQueue(50);
		queue.enQueue(50);
	}
}
