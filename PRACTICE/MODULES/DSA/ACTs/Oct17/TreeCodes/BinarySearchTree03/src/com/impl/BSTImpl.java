package com.impl;

import com.node.Node;

public class BSTImpl {

	public static Node insertNode(Node root, Node node) {
		// TODO Auto-generated method stub
		if(root == null) {
			root = node;
			return root;
		}
		Node current = root;
//		{4,3,5,2,6,1,7}
		while(root != null) {
			if(node.data < current.data) {
				if(current.left == null) {
					current.left = node;
					return root;
				} else {
					current = current.left;
				}
			} else {
				if(current.right == null) {
					current.right = node;
					return root;
				} else {
					current = current.right;
				}
			}
		}
		return root;
	}

	public static void printInOrder(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		printInOrder(root.left);
		System.out.println(root.data + " ");
		printInOrder(root.right);
	}

}
