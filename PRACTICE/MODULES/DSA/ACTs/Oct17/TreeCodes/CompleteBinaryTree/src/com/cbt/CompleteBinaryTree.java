package com.cbt;

import java.util.LinkedList;
import java.util.Queue;

import com.node.Node;

public class CompleteBinaryTree {
	private Node root;
	
	public void createCompleteBinaryTree(Node node) { 
		Queue<Node> nodeQueue = new LinkedList<Node>();
		if(root == null) {
			root = node;
			return;
		}
		nodeQueue.add(root);
		while(!nodeQueue.isEmpty()) {
			Node current = nodeQueue.poll();
			if(current.left == null) {
				current.left = node;
				return;
			} else {
				nodeQueue.add(current.left);
			}
			if(current.right == null) {
				current.right = node;
				return;
			} else {
				nodeQueue.add(current.right);
			}
		}
	}
	
	public void inOrderTraversal(Node root) {
		if(root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
	}
	
	public static Node deleteInCBT(Node root){
		return null;
	}

	public static boolean searchInCBT(Node root, int element) {
		Queue<Node> nodeQueue = new LinkedList<Node>();
		
		if(root == null) {
			return false;
		}
		if(root != null) {
			nodeQueue.add(root);
		}
		while(!nodeQueue.isEmpty()) {
			Node current = nodeQueue.poll();
			if(current == null) {
				return false;
			}
			if(current.data == element) {
				return true;
			} else {
				nodeQueue.add(current.left);
			}
			if(current.data == element) {
				return true;
			} else {
				nodeQueue.add(current.right);
			}
		}
		return false;
	}
	
	public void inOrderTraversal() {
		// TODO Auto-generated method stub
		inOrderTraversal(root);
	}

	public void searchInCBT(int i) {
		// TODO Auto-generated method stub
		System.out.println(searchInCBT(root, i));
	}

	public int findMaximumInCBT() {
		// TODO Auto-generated method stub
		return findMaximumInCBT(root);
	}

	private int findMaximumInCBT(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return 0;
		}
		int max = root.data;
		int left = findMaximumInCBT(root.left);
		int right = findMaximumInCBT(root.right);
		return Math.max(max, Math.max(left, right));
	}
	
	private int findMinimumInCBT(Node root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int min = root.data;
		int left = findMinimumInCBT(root.left);
		int right = findMinimumInCBT(root.right);
		return Math.min(min, Math.min(left, right));
	}
	
	public int findMinimumInCBT() {
		return findMinimumInCBT(root);
	}
}
