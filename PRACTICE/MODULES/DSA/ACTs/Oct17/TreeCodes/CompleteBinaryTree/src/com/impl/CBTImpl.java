package com.impl;

import com.cbt.CompleteBinaryTree;
import com.node.Node;

public class CBTImpl {
	public static void main(String[] args) {
		CompleteBinaryTree cbt = new CompleteBinaryTree();
		cbt.createCompleteBinaryTree(new Node(1));
		cbt.createCompleteBinaryTree(new Node(2));
		cbt.createCompleteBinaryTree(new Node(3));
		cbt.createCompleteBinaryTree(new Node(4));
		cbt.createCompleteBinaryTree(new Node(6));
		cbt.createCompleteBinaryTree(new Node(7));
		cbt.createCompleteBinaryTree(new Node(5));
		cbt.createCompleteBinaryTree(new Node(8));
		cbt.inOrderTraversal();
		cbt.searchInCBT(8);
		int max = cbt.findMaximumInCBT();
		System.out.println("Maximum node is : " + max);
		int min = cbt.findMinimumInCBT();
		System.out.println("Minimum element is : " + min);
		System.out.println("printing all leaf nodes : ");
		cbt.printAllLeafNodes();
		System.out.println("printing all non leaf nodes : ");
		cbt.printAllNonLeafNodes();
		int height = cbt.maximumHeightOfCBT();
		System.out.println("HEIGHT IS : " + height);
	}
}
