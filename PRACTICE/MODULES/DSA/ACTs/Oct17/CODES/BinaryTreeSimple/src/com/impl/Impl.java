package com.impl;

import com.binarytree.BinaryTree;
import com.node.Node;

public class Impl {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();		
		createNodes(bt);
		bt.inOrderTraversal();
	}

	private static void createNodes(BinaryTree bt) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,3,5,6,7,8,0};
		for(Integer i : arr) {
			bt.createBinaryTree(new Node(i));
		}
	}
}
