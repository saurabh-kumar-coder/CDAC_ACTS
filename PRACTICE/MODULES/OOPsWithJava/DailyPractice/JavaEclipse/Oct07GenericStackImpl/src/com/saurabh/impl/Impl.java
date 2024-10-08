package com.saurabh.impl;

import java.util.ArrayList;
import java.util.List;

public class Impl<T> {
	List <T> stack;
	
	Impl() {
		stack = new ArrayList<T>();
	}
	
	public void push(T item) {
		stack.add(item);
	}
	
	public T pop() {
		if(stack.size() < 0) {
			throw new RuntimeException("No element in the stack");
		}
		return stack.remove(stack.size() - 1);
	}
	
	public T peek() {
		if(stack.size() < 0) {
			throw new RuntimeException("No element in the stack");
		}
		return stack.get(stack.size() - 1);
	}
	
	boolean isEmpty() {
		if(stack.size() < 0 ) {
			return true;
		}
		return false;
	}
	
	int size() {
		return stack.size();
	}
	
	public static void main(String[] args) {
		Impl<String> stack = new Impl<String>();
		stack.push("saurabh");
		stack.push("Kumar");
		System.out.println(stack.size());
		stack.pop();
		System.out.println("Check if stack empty : " + stack.isEmpty());
		System.out.println("Stack peek : " + stack.peek());
	}
}
