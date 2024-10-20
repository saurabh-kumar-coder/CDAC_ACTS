package com.services;

public interface QueuesService<T> {
	public T deQueue();
	public T enQueue(T item);
	public T front();
	public boolean isEmpty();
	public boolean isFull();
}
