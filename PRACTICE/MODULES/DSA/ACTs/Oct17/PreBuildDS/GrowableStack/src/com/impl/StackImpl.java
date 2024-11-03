package com.impl;

import com.stackInterface.GrowableStack;

public class StackImpl<T> implements GrowableStack<T> {
	T [] stack;
	int top;
	int size;
	int capacity;
	
	public StackImpl(int capacity) {
		super();
		this.capacity = capacity;
		stack = (T[]) new Object[capacity];
		top = -1;
		size = 0;
	}

	@Override
	public void push(T value) {
		// TODO Auto-generated method stub
		if(isFull()) {
			stack = growableStack(size);
		}
		stack[++top] = value;
		System.out.println(stack[top]);
		size++;
		return;
	}

	private T[] growableStack(int size) {
		// TODO Auto-generated method stub
		int i = top;
		int ctr = 0;
		T[] growableStack = (T[]) new Object[capacity * 2];
		capacity = capacity * 2;
		while(i > -1) {
			growableStack[ctr] = stack[ctr];
//			System.out.println(growableStack[ctr]);
			ctr++;
			i--;
		}
		return growableStack;
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(top != -1) {
			T value = stack[top--];
			return value;
		}
		return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return null;
		}
		return stack[top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top == -1) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(size == capacity) {
			System.out.println("capacity full");
			return true;
		}
		return false;
	}

}
