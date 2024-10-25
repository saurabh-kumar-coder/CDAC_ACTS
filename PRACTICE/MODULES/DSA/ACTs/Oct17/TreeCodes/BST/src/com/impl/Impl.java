package com.impl;

import com.bst.BinarySearchTree;
import com.node.Node;

public class Impl {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.createBinaryTreeWithoutQueue(new Node(4));
		bst.createBinaryTreeWithoutQueue(new Node(5));
		bst.createBinaryTreeWithoutQueue(new Node(3));
		bst.createBinaryTreeWithoutQueue(new Node(2));
		bst.inOrderTraversal();
		System.out.println(bst.searchInABinarySearchTree(new Node(3)));
		System.out.println(bst.searchInABinarySearchTreeViaRecursion(new Node(4)));
		int height = bst.getHeightOfBinarySearchTree();
		System.out.println(height);
		int max = bst.findMaximumInBST();
		System.out.println(max);
		int min = bst.findMinimumInBST();
		System.out.println(min);
	}
}
