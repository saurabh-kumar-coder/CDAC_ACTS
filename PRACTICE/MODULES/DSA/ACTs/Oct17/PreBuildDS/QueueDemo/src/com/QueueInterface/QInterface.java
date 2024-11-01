package com.QueueInterface;

public interface QInterface<T> {
	void enQueue(T value);
	T deQueue();
	T peek();
	boolean isEmpty();
	boolean isFull();
	int size();
}
