package com.tester;

import com.node.Node;
import com.utility.BinarySearchTreeUtility;

public class Tester {
	public static void main(String[] args) {
		int[] nodes = { 50, 25, 75, 12, 35, 65, 85, 10, 20, 30, 40, 60, 70, 80, 90 };
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
		System.out.println("printing level order traversal");
		bstu.levelOrderTraversal();
		bstu.levelOrderTraversalViaArrayList();
		bstu.levelOrderTraversalZigZag();
	}
}
