package com.tester;

import com.node.Node;
import com.utility.BinarySearchTreeUtility;

public class Tester {
	public static void main(String[] args) {
		int [] nodes = {1,2,3,4,5,6,7,8,9};
		BinarySearchTreeUtility bstu = new BinarySearchTreeUtility();
		for(int i = 0; i < nodes.length; i++)
		bstu.createTree(new Node(nodes[i]));
		bstu.inOrderTraverse();
		bstu.searchInBST();
	}
}
