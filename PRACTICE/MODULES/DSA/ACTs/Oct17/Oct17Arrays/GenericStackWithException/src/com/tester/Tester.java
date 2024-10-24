package com.tester;

import com.utility.Stacks;

public class Tester {
	public static void main(String[] args) {
		Stacks<Integer> stack = new Stacks<Integer>(5);
		stack.isEmpty();
		stack.push(10);
		stack.push(30);
		stack.push(0);
		stack.push(20);
		stack.push(50);
		stack.push(23);
		Integer val;
		val = stack.pop();
		System.out.println("Poped value is : " + val);val = stack.peek();
		System.out.println("Peek value is : " + val);
		val = stack.pop();
		System.out.println("Poped value is : " + val);
		val = stack.peek();
		System.out.println("Peek value is : " + val);
		val = stack.pop();
		System.out.println("Poped value is : " + val);
		val = stack.pop();
		System.out.println("Poped value is : " + val);
		val = stack.pop();
		System.out.println("Poped value is : " + val);
		val = stack.pop();
		System.out.println("Poped value is : " + val);
		val = stack.pop();
		System.out.println("Poped value is : " + val);
	}
}