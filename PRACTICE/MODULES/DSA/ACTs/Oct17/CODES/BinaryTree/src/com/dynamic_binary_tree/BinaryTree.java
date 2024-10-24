package com.dynamic_binary_tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = null;
	}
	
	public void createBinaryTree(Node node){
		Queue<Node> list = new LinkedList<Node>();
		if(root == null) {
			root = node;
			return;
		}
		
		list.add(root);
		while(!list.isEmpty()) {
			Node value = list.poll();
			
			if(value.left == null) {
				value.left = node;
				return;
			} else {
				list.add(value.left);
			}
			
			if(value.right == null) {
				value.right = node;
				return;
			} else {
				list.add(value.right);
			}
		}
	}
	
//	running for 3 nodes
//	public void createBinaryTree(Node node){
//		if(root == null) {
//			root = node;
//			list.add(root);
//			return;
//		}
//		
//		Node current = root;
//		
//		if(current.left == null && current.right == null) {
//			current.left = node;
//			list.add(node);
//			return;
//		}
//		
//		if(current.right == null) {
//			current.right = node;
//			list.add(node);
//			return;
//		}
//	}
	
//	private Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void inOrderPrint(Node root) {
		if(root == null) {
			return ;
		}
		
		inOrderPrint(root.left);
		System.out.println(root.data );
		inOrderPrint(root.right);
	}
	
	public static void preOrderPrint(Node root) {
		if(root == null) {
			return ;
		}
		
		System.out.println(root.data );
		preOrderPrint(root.left);
		preOrderPrint(root.right);
	}
	
	public static void postOrderPrint(Node root) {
		if(root == null) {
			return ;
		}
		
		postOrderPrint(root.left);
		postOrderPrint(root.right);
		System.out.println(root.data );
	}
	
	public void inOrderPrint() {
		inOrderPrint(root);
//		System.out.println("List is : " + );
	}
}
