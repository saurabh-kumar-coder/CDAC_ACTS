package com.stackInterface;

public interface GrowableStack<T> {
	void push(T value);
	T pop();
	T peek();
	boolean isEmpty();
	boolean isFull();
}
