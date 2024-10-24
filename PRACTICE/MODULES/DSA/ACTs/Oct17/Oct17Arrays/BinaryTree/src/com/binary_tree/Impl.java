package com.binary_tree;

public class Impl {
	
	public static void printing() {
		BinaryTree bt = new BinaryTree();
		bt.createBinaryTree();
		bt.inOrderPrint();
	}
	
	public static void main(String[] args) {
		printing();
	}
}
