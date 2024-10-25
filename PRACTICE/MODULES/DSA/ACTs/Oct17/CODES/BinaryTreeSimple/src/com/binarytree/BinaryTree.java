package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

import com.node.Node;

public class BinaryTree {
	public Node root;

	public BinaryTree() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BinaryTree(Node root) {
		super();
		this.root = root;
	}
	public void inOrderTraversal() {
		inOrderTraversal(root);
	}
	public static void inOrderTraversal(Node root) {
		if(root == null) {
			return;
		} 
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}
	
	public void createBinaryTree(Node node){
		Queue<Node> list = new LinkedList<Node>();
		if(root == null) {
			root = node;
			return;
		}
		list.add(root);
		
		while(!list.isEmpty()) {
			Node current = list.poll();
			
			if(current.left == null) {
				current.left = node;
				return;
			} else {
				list.add(current.left);
			}
			if(current.right == null) {
				current.right = node;
				return;
			} else {
				list.add(current.right);
			}
		}
		
	}
}
