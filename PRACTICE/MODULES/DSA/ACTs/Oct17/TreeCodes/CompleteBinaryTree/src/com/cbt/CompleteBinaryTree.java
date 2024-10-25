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
}
