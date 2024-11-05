package com.tester;

import com.entity.User;
import com.utility.LLUtility;

public class Tester {
	public static void main(String[] args) {
		boolean isEmpty = LLUtility.isEmpty();
		System.out.println(isEmpty);
		LLUtility.insert(new User(5, "John"));
		LLUtility.printList();
		LLUtility.insert(new User(2, "Ramu"));
		LLUtility.printList();
		LLUtility.insert(new User(6, "Pappu"));
		LLUtility.printList();
		LLUtility.insert(new User(1, "Rahul"), 2);
		LLUtility.printList();
		LLUtility.insert(new User(1, "Rahul"), 7);
		LLUtility.printList();
		int count = LLUtility.countInList();
		System.out.println("no of nodes are : " + count);
		LLUtility.sort(count);
		LLUtility.printList();
	}
}
