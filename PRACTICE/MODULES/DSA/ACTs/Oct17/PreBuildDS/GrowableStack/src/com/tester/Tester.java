package com.tester;

import com.impl.StackImpl;

public class Tester {
	public static void main(String[] args) {
		StackImpl<Integer> stack = new StackImpl<Integer>(5);
		stack.push(5);
		stack.push(9);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(6);
		stack.push(7);
		stack.push(10);
		stack.push(24);
		stack.push(45);
		stack.push(13);
		stack.push(19);
		stack.push(87);
		System.out.println("Peek value is : " + stack.peek());
		
//		System.out.println("Pop value is : " + stack.pop());
//		System.out.println("Peek value is : " + stack.peek());
//		
//		System.out.println("Pop value is : " + stack.pop());
//		System.out.println("Peek value is : " + stack.peek());
//		
//		System.out.println("Pop value is : " + stack.pop());
//		System.out.println("Peek value is : " + stack.peek());
//		
//		System.out.println("Pop value is : " + stack.pop());
//		System.out.println("Peek value is : " + stack.peek());
//		
//		System.out.println("Pop value is : " + stack.pop());
//		System.out.println("Peek value is : " + stack.peek());
		
	}
}
