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
		// TODO Auto-generated method stub
		if(front != queue.length - 1 && front <= rear) {
			T val = queue[front];
			front++;
			System.out.println("item removed");
			return val;
		}
		return null;
	}

//	insert into queue
	@Override
	public T enQueue(T item) {
		// TODO Auto-generated method stub
		if(rear != queue.length - 1) {
			queue[rear] = item;
			rear++;
			System.out.println("item added");
			return item;
		}
		return null;
	}

	@Override
	public T front() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}
