package com.bst;

import java.util.LinkedList;
import java.util.Queue;

import com.node.Node;

public class BinarySearchTree {
	Node root;

	public void inOrderTraversal(Node root) {
		if (root == null) {
			return;
		}
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}

	public void createBinaryTree(Node node) {
		Queue<Node> nodeQueue = new LinkedList<Node>();

		if (root == null) {
			root = node;
			return;
		}

		nodeQueue.add(root);

		while (!nodeQueue.isEmpty()) {
			Node current = nodeQueue.poll();
			if (node.data < current.data) {
				if (current.left == null) {
					current.left = node;
					return;
				} else {
					nodeQueue.add(current.left);
				}
			} else {
				if (current.right == null) {
					current.right = node;
					return;
				} else {
					nodeQueue.add(current.right);
				}
			}
		}
	}

	public void createBinaryTreeWithoutQueue(Node node) {
		if (root == null) {
			root = node;
			return;
		}
		Node current = root;
		while (node != null) {
			if (node.data < current.data) {
				if (current.left == null) {
					current.left = node;
					return;
				}
				current = current.left;
			} else {
				if (current.right == null) {
					current.right = node;
					return;
				}
				current = current.right;
			}
		}
	}

	public boolean searchInABinarySearchTree(Node node) {
		if (root == null) {
			return false;
		}
		Node current = root;
		while (current != null) {
			if (current.data == node.data) {
				return true;
			}
			if (node.data < current.data) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return false;
	}

	public boolean searchInABinarySearchTreeViaRecursion(Node node) {
		return searchInABinarySearchTreeViaRecursion(node, root);
	}

	private boolean searchInABinarySearchTreeViaRecursion(Node node, Node root) {
		if (root == null) {
			return false;
		}

		if (root.data == node.data) {
			return true;
		}
		if (node.data < root.data) {
			return searchInABinarySearchTreeViaRecursion(node, root.left);
		} else {
			return searchInABinarySearchTreeViaRecursion(node, root.right);
		}
	}

	public void inOrderTraversal() {
		inOrderTraversal(root);
	}

	public int getHeightOfBinarySearchTree() {
		int height = getHeightOfBinarySearchTree(root);
		return height;
	}

	private int getHeightOfBinarySearchTree(Node root) {
		if (root == null) {
			return 0;
		}

		int left = 1 + getHeightOfBinarySearchTree(root.left);

		int right = 1 + getHeightOfBinarySearchTree(root.right);

		return Math.max(left, right);
	}

	public int findMaximumInBST() {

		return findMaximumInBST(root);
	}

	private int findMaximumInBST(Node root) {
		if (root.right == null) {
			return root.data;
		}

		int max = findMaximumInBST(root.right);

		return max;
	}

	public int findMinimumInBST() {

		return findMinimumInBST(root);
	}

	private int findMinimumInBST(Node root) {
		if (root.left == null) {
			return root.data;
		}
		
		int min = findMinimumInBST(root.left);
		
		return min;
	}
}
