package com.dynamic_binary_tree;

public class Impl {
	
	public static void printing() {
		BinaryTree bt = new BinaryTree();
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		
		bt.createBinaryTree(n1);
		bt.createBinaryTree(n2);
		bt.createBinaryTree(n3);
		bt.createBinaryTree(n4);
		bt.createBinaryTree(n5);
		bt.createBinaryTree(n6);
		bt.createBinaryTree(n7);
		bt.createBinaryTree(n8);
		
		bt.inOrderPrint();
	}
	
	public static void main(String[] args) {
		printing();
	}
}
