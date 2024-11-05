package com.utility;

import com.entity.User;
import com.impl.LLImpl;

public class LLUtility {

	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean isEmpty = LLImpl.isEmpty();
		return isEmpty;
	}

	public static void insert(User user) {
		// TODO Auto-generated method stub
		LLImpl.insert(user);
	}

	public static void printList() {
		// TODO Auto-generated method stub
		LLImpl.printList();
	}

	public static void insert(User user, int pos) {
		// TODO Auto-generated method stub
		LLImpl.insert(user, pos);
	}

	public static void sort(int count) {
		// TODO Auto-generated method stub
		LLImpl.sort(count);
	}

	public static int countInList() {
		// TODO Auto-generated method stub
		int count = LLImpl.countInList();
		return count;
	}
}