package com.utility;

import com.exceptions.StackIsEmptyException;
import com.exceptions.StackIsFullException;

// operations :
//	isEmpty();
//	isFull();
//	push();
//	pop();
//	peek();

public class Stacks<T> {
	private int top = -1;
	private T[] stack;

	@SuppressWarnings("unchecked")
	public Stacks(int size) {
		this.stack = (T[]) new Object[size];
	}

	public boolean isEmpty() {
		try {
			if (top == -1) {
				throw new StackIsEmptyException("Stack is Empty Exception");
			}
			return false;
		} catch (StackIsEmptyException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	public boolean isFull() {
		try {
			if (top == stack.length - 1) {
				throw new StackIsFullException("Stack is full Exception");
			}
			return false;
		} catch (StackIsFullException e) {
			System.out.println(e.getMessage());
		}
		return true;
	}

	public T push(T item) {
		if (!isFull()) {
			stack[++top] = item;
			return item;
		}
		return null;
	}

	public T pop() {
		if (!isEmpty()) {
			T val = stack[top];
			top--;
			return val;
		}
		return null;
	}

	public T peek() {
		if (!isEmpty()) {
			return stack[top];
		}
		return null;
	}
}
