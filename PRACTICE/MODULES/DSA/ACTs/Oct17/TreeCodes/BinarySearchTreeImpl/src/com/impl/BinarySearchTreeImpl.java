package com.impl;

import com.node.Node;

public class BinarySearchTreeImpl {

	public static Node createTree(Node root, Node node) {
		// TODO Auto-generated method stub
		if (root == null) {
			root = node;
			return root;
		}
		Node current = root;
		while (root != null) {
			if (node.data < current.data) {
				if (current.left == null) {
					current.left = node;
					return root;
				} else {
					current = current.left;
				}
			} else if (node.data > current.data){
				if (current.right == null) {
					current.right = node;
					return root;
				} else {
					current = current.right;
				}
			}
		}
		return root;
	}

	public static void inOrderTraverse(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		inOrderTraverse(root.left);
		System.out.print(root.data + " ");
		inOrderTraverse(root.right);
	}

	public static boolean searchInBST(Node root, Node node) {
		// TODO Auto-generated method stub
		if(root == null) {
			return false;
		}
		if(root.data == node.data) {
			return true;
		}
		if(node.data < root.data) {
			return 	searchInBST(root.left, node);
		} else {
			return searchInBST(root.right, node);
		}
	}
}
