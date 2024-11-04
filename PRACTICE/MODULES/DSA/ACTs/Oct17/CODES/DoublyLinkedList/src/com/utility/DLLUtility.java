package com.utility;

import com.impl.DLLImpl;
import com.node.Node;

public class DLLUtility {

	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean isEmpty = DLLImpl.isEmpty();
		return isEmpty;
	}

	public static void insert(int i) {
		// TODO Auto-generated method stub
		DLLImpl.insert(new Node(i));
	}

	public static void printDLL() {
		// TODO Auto-generated method stub
		DLLImpl.printDLL();
	}

	public static void insertAtPosition(int i, int pos) {
		// TODO Auto-generated method stub
		DLLImpl.insertAtPosition(new Node(i), pos);
	}

}
