package com.utility;

import com.impl.ListImpl;
import com.node.Node;

public class ListUtility {

	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		boolean isEmpty = ListImpl.isEmpty();
		return isEmpty;
	}

	public static void insert(int i) {
		// TODO Auto-generated method stub
		ListImpl.insert(new Node(i));
	}

	public static void printList() {
		// TODO Auto-generated method stub
		ListImpl.printList();
	}

}
