package com.QueueTester;

import com.QueueImpl.QueueImpl;

public class Tester {
	public static void main(String[] args) {
		QueueImpl<Integer> queue = new QueueImpl<Integer>(5);
		queue.enQueue(5);
		queue.enQueue(8);
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.enQueue(4);
//		queue.enQueue(6);
		System.out.println("Peek value is : " + queue.peek());
		System.out.println("Deleted value is : " + queue.deQueue());
		
		System.out.println("Peek value is : " + queue.peek());
		System.out.println("Deleted value is : " + queue.deQueue());

		System.out.println("Peek value is : " + queue.peek());
		System.out.println("Deleted value is : " + queue.deQueue());

		System.out.println("Peek value is : " + queue.peek());
		System.out.println("Deleted value is : " + queue.deQueue());

		System.out.println("Peek value is : " + queue.peek());
		System.out.println("Deleted value is : " + queue.deQueue());

		System.out.println("Peek value is : " + queue.peek());
		System.out.println("Deleted value is : " + queue.deQueue());
		
		System.out.println(queue.size());
	}
}
