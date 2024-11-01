package com.QueueImpl;

import com.QueueInterface.QInterface;

public class QueueImpl<T> implements QInterface<T> {
	T [] queue;
	int capacity;
	int front;
	int rear;
	int size;
	
	public QueueImpl(int capacity) {
		super();
		this.capacity = capacity;
		queue = (T[])new Object[capacity];
		front = 0;
		rear = -1;
		size = 0;
	}

	@Override
	public void enQueue(T value) {
		// TODO Auto-generated method stub
		if(isEmpty() && size != capacity) {
			queue[++rear] = value;
			size++;
			System.out.println("added value is : " + value);
		} else {
			System.out.println("cannot add value : " + value);
		}
	}

	@Override
	public T deQueue() {
		// TODO Auto-generated method stub
		if(front > rear) {
			return null;
		} else if(front < size) {
			T value = queue[front];
			front++;
			return value;
		}
		return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(rear >= front) {
			return queue[front];			
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(rear < size) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(size == capacity) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		int size = rear - front + 1;
		return size;
	}
	
}
