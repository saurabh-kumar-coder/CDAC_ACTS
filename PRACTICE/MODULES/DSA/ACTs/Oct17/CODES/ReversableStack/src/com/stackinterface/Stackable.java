package com.stackinterface;

public interface Stackable {
	void push(int element);
	int pop();
	int top();
	int[] reverse();
}
