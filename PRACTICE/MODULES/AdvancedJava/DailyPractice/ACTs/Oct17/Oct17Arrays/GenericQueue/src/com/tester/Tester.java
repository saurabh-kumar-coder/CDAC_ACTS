package com.tester;

import java.util.Arrays;

import com.impl.Queues;

public class Tester {
	public static void main(String[] args) {
		Queues<Integer> queue = new Queues<Integer>(0, 0, 5);
		queue.isEmpty();
		System.out.println(queue.enQueue(50));
		System.out.println(queue.enQueue(20));
		System.out.println(queue.enQueue(40));
		System.out.println(queue.enQueue(70));
		System.out.println(queue.enQueue(30));
		
		System.out.println(queue.isEmpty());
		System.out.println("removing elements");
		System.out.println("front -> " + queue.front());
		System.out.println(queue.deQueue());
		System.out.println("front -> " + queue.front());
		System.out.println(queue.deQueue());
		System.out.println("front -> " + queue.front());
		System.out.println(queue.deQueue());
		System.out.println("front -> " + queue.front());
		System.out.println(queue.deQueue());
		System.out.println("front -> " + queue.front());
		System.out.println(queue.deQueue());
		System.out.println("front -> " + queue.front());
		System.out.println(queue.isEmpty());
	}
}



