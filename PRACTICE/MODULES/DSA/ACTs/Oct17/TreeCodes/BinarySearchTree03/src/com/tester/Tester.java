package com.tester;

import com.node.Node;
import com.utility.BSTUtility;

public class Tester {
	public static void main(String[] args) {
		int [] nodes = {4,3,5,2,6,1,7};
		BSTUtility bstu = new BSTUtility();
		for(int i = 0; i < nodes.length; i++) {
			bstu.insertNode(new Node(nodes[i]));
		}
		bstu.printInOrder();
	}
}
