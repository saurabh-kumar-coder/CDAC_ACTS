package com.impl;

import com.services.QueuesService;

public class Queues<T> implements QueuesService<T> {
	private int front;
	private int rear;
	private T [] queue;
	
	public Queues(Integer front, Integer rear, Integer size) {
		this.front = front;
		this.rear = rear;
		this.queue = (T[])new Object[size];
	}
	
//	delete from the queue
	@Override
	public T deQueue() {
		if(!isEmpty()) {
			T val = queue[front++];
//			System.out.println("val removed is : " + val);
			return val;
		}
		return null;
	}

//	insert into queue
	@Override
	public T enQueue(T item) {
		if(!isFull()) {
			queue[rear++] = item;
			return item;
		}
		return null;
	}

	@Override
	public T front() {
		if(!isEmpty()) {
			return queue[front];
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(front == rear) { 
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(rear == queue.length) {
			return true;
		}
		return false;
	}

	public void printElements() {
		for(int i = front; i <= rear; i++)
			System.out.println(queue[i]);
	}

}
