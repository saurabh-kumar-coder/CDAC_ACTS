package com.node;

public class Node {
	public Node left;
	public Node right;
	public int data;
	public Node(int i) {
		this.data = i;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}
