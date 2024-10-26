package com.utility;

import com.node.Node;
import com.utilityImpl.CompleteBinaryTreeImpl;

public class CompleteBinaryTreeUtility {
	Node root = null;
	
	public CompleteBinaryTreeUtility() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompleteBinaryTreeUtility(Node root) {
		// TODO Auto-generated constructor stub
		this.root = root;
	}

	public void createNodes(Node node) {
		// TODO Auto-generated method stub
		root = CompleteBinaryTreeImpl.createNodes(root, node);
	}

	public void inOrderPrint() {
		// TODO Auto-generated method stub
		CompleteBinaryTreeImpl.inOrderPrint(root);
		System.out.println();
	}

	public void searchInCBT() {
		// TODO Auto-generated method stub
		boolean isAvailable = CompleteBinaryTreeImpl.searchInCBT(root, new Node(1));
		System.out.println("1 is : " + isAvailable);
		isAvailable = CompleteBinaryTreeImpl.searchInCBT(root, new Node(0));
		System.out.println("0 is : " + isAvailable);
		isAvailable = CompleteBinaryTreeImpl.searchInCBT(root, new Node(6));
		System.out.println("6 is : " + isAvailable);
		isAvailable = CompleteBinaryTreeImpl.searchInCBT(root, new Node(4));
		System.out.println("4 is : " + isAvailable);
		isAvailable = CompleteBinaryTreeImpl.searchInCBT(root, new Node(9));
		System.out.println("9 is : " + isAvailable);
	}

	public void getAllLeafNodes() {
		// TODO Auto-generated method stub
		CompleteBinaryTreeImpl.getAllLeafNodes(root);
	}

	public void getAllNonLeafNodes() {
		// TODO Auto-generated method stub
		CompleteBinaryTreeImpl.getAllNonLeafNodes(root);
	}
}
