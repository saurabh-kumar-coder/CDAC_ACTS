package com.dynamic_binary_tree;

public class Node {
	public int data;
	public Node left;
	public Node right;
	public Node(int data) {
		super();
		this.data = data;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}
