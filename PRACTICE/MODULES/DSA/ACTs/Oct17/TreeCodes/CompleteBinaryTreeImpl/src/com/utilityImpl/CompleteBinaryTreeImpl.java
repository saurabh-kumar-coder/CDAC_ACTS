package com.utilityImpl;

import java.util.LinkedList;
import java.util.Queue;

import com.node.Node;

public class CompleteBinaryTreeImpl {

	public static Node createNodes(Node root, Node node) {
		// TODO Auto-generated method stub
		if (root == null) {
			root = node;
			return root;
		}
		Queue<Node> nodeQueue = new LinkedList<Node>();
		nodeQueue.add(root);
		while (!nodeQueue.isEmpty()) {
			Node currentNode = nodeQueue.poll();
			if (currentNode.left == null) {
				currentNode.left = node;
				return root;
			} else {
				nodeQueue.add(currentNode.left);
			}
			if (currentNode.right == null) {
				currentNode.right = node;
				return root;
			} else {
				nodeQueue.add(currentNode.right);
			}
		}
		return root;
	}

	public static void inOrderPrint(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		inOrderPrint(root.left);
		System.out.print(root.data);
		inOrderPrint(root.right);
	}

	public static boolean searchInCBT(Node root, Node node) {
		// TODO Auto-generated method stub
		if (root == null) {
			return false;
		}
		if (root.data == node.data) {
			return true;
		}
		return searchInCBT(root.left, node) || searchInCBT(root.right, node);
	}

	public static void getAllLeafNodes(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		if(root.left == null && root.right == null)
			System.out.print(root.data);
		getAllLeafNodes(root.left);
		getAllLeafNodes(root.right);
	}

	public static void getAllNonLeafNodes(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		if(root.left != null || root.right != null) {
			System.out.print(root.data);
		}
		getAllNonLeafNodes(root.left);
		getAllNonLeafNodes(root.right);
	}

}
