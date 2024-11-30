package com.impl;

import com.exception.IsEmptyException;
import com.exception.IsFullException;
import com.stackinterface.Stackable;

public class StackImpl implements Stackable {
	int [] stack;
	int capacity;
	int size;
	int top;
	
	public StackImpl(int capacity) {
		super();
		this.stack = new int[capacity];
		this.capacity = capacity;
		this.size = 0;
		this.top = -1;
	}
	
	public boolean isFull() {
		try {
			if(size == capacity) {
				throw new IsFullException("the stack is full");
			}
			return true;
		} catch(IsFullException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}
	
	public boolean isEmpty() {
		try {
			if(top == -1) {
				throw new IsEmptyException("stack is underflow");
			}
			return true;
		} catch(IsEmptyException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	}

	@Override
	public void push(int element) {
		// TODO Auto-generated method stub
		if(!isFull()) {
			return;
		}
		stack[++top] = element;
		size++;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(top == -1) {
			System.out.println("stack is empty");
			return -1;
		}
		int topValue = stack[top--];
		size--;
		return topValue;
	}

	@Override
	public int top() {
		// TODO Auto-generated method stub
		int topValue = stack[top];
		return topValue;
	}

	@Override
	public int[] reverse() {
		// TODO Auto-generated method stub
		int[] reverseStack = new int[capacity];
		int revTop = top;
		int revSize = size;
		int i = 0;
		while(revTop != -1) {
			reverseStack[i] = stack[revTop];
//			System.out.println("value at " + i + " is: " + reverseStack[i]);
			revTop--;
			revSize--;
			i++;
		}
		stack = reverseStack;
		return stack;
	}
}
