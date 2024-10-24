package com.utility;
// operations :
//	isEmpty();
//	isFull();
//	push();
//	pop();
//	peek();
	

public class Stacks<T> {
	private int top = -1;
	private T [] stack;
	
	@SuppressWarnings("unchecked")
	public Stacks(int size) {
		this.stack = (T[]) new Object[size];
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			System.out.println("Stack is empty");
			return true;
		} return false;
	}
	
	public boolean isFull() {
		if(top == stack.length - 1) {
			System.out.println("Stack is full");
			return true;
		} return false;
	}
	
	public T push(T item) {
		if(!isFull()) {
			stack[++top] = item;
			return item;
		} return null;
	}
	
	public T pop() {
		if(!isEmpty()) {
			T val = stack[top];
			top--;
			return val;
		} return null;
	}
	
	public T peek() {
		if(!isEmpty()) {
			return stack[top];
		} return null;
	}
}
