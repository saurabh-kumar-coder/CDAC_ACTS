package com.tester;

import com.node.Node;
import com.utility.BinarySearchTreeUtility;

public class Tester {
	public static void main(String[] args) {
		int[] nodes = { 4, 2, 6, 1, 3, 5, 7 };
		BinarySearchTreeUtility bstu = new BinarySearchTreeUtility();
		for (int i = 0; i < nodes.length; i++)
			bstu.createTree(new Node(nodes[i]));
		bstu.inOrderTraverse();
		bstu.searchInBST();
		bstu.findMaximumNode();
		bstu.findMinimumNode();
		System.out.println("printing all leaf nodes");
		bstu.getAllLeafNodes();
		System.out.println("printing all non leaf nodes");
		bstu.getAllNonLeafNodes();
		bstu.getHeightOfBST();
		bstu.getSumOfAllNodes();
	}
}
