package com.utility;

import com.impl.BinarySearchTreeImpl;
import com.node.Node;

public class BinarySearchTreeUtility {
	Node root = null;

	public BinarySearchTreeUtility() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BinarySearchTreeUtility(Node root) {
		super();
		this.root = root;
	}

	public void createTree(Node node) {
		// TODO Auto-generated method stub
		root = BinarySearchTreeImpl.createTree(root, node);
	}

	public void inOrderTraverse() {
		// TODO Auto-generated method stub
		BinarySearchTreeImpl.inOrderTraverse(root);
	}

	public void searchInBST() {
		// TODO Auto-generated method stub
		boolean isAvailable = BinarySearchTreeImpl.searchInBST(root, new Node(0));
		System.out.println(isAvailable);
		isAvailable = BinarySearchTreeImpl.searchInBST(root, new Node(1));
		System.out.println("1 is : " + isAvailable);
		isAvailable = BinarySearchTreeImpl.searchInBST(root, new Node(9));
		System.out.println("9 is : " + isAvailable);
		isAvailable = BinarySearchTreeImpl.searchInBST(root, new Node(3));
		System.out.println("3 is : " + isAvailable);
		isAvailable = BinarySearchTreeImpl.searchInBST(root, new Node(7));
		System.out.println("7 is : " + isAvailable);
		isAvailable = BinarySearchTreeImpl.searchInBST(root, new Node(0));
		System.out.println("0 is : " + isAvailable);
	}

	public void findMaximumNode() {
		// TODO Auto-generated method stub
		Node node = BinarySearchTreeImpl.findMaximumNode(root);
		System.out.println("Maximum element is : " + node.data);
	}

	public void findMinimumNode() {
		// TODO Auto-generated method stub
		Node node = BinarySearchTreeImpl.findMinimumNode(root);
		System.out.println("Minimum element is : " + node.data);
	}

	public void getAllLeafNodes() {
		// TODO Auto-generated method stub
		BinarySearchTreeImpl.getAllLeafNodes(root);
	}

	public void getAllNonLeafNodes() {
		// TODO Auto-generated method stub
		BinarySearchTreeImpl.getAllNonLeafNodes(root);
	}

	public void getHeightOfBST() {
		// TODO Auto-generated method stub
		int height = BinarySearchTreeImpl.getHeightOfBST(root);
		System.out.println("height is : " + height);
	}

	public void getSumOfAllNodes() {
		// TODO Auto-generated method stub
		int sum = BinarySearchTreeImpl.getSumOfAllNodes(root, 0);
		System.out.println("Sum of all the nodes is : " + sum);
	}
	
}
