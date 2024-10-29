package com.utility;

import com.impl.BSTImpl;
import com.node.Node;

public class BSTUtility {
	Node root;
	
	public BSTUtility() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BSTUtility(Node root) {
		super();
		this.root = root;
	}

	public void insertNode(Node node) {
		// TODO Auto-generated method stub
		root = BSTImpl.insertNode(root, node);
	}

	public void printInOrder() {
		// TODO Auto-generated method stub
		BSTImpl.printInOrder(root);
	}
}
