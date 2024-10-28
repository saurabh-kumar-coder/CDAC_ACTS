package com.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.node.Node;

public class BinarySearchTreeImpl {

	public static Node createTree(Node root, Node node) {
		// TODO Auto-generated method stub
		if (root == null) {
			root = node;
			return root;
		}
		Node current = root;
		while (root != null) {
			if (node.data < current.data) {
				if (current.left == null) {
					current.left = node;
					return root;
				} else {
					current = current.left;
				}
			} else if (node.data > current.data) {
				if (current.right == null) {
					current.right = node;
					return root;
				} else {
					current = current.right;
				}
			}
		}
		return root;
	}

	public static void inOrderTraverse(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		inOrderTraverse(root.left);
		System.out.print(root.data + " ");
		inOrderTraverse(root.right);
	}

	public static boolean searchInBST(Node root, Node node) {
		// TODO Auto-generated method stub
		if (root == null) {
			return false;
		}
		if (root.data == node.data) {
			return true;
		}
		if (node.data < root.data) {
			return searchInBST(root.left, node);
		} else {
			return searchInBST(root.right, node);
		}
	}

	public static Node findMaximumNode(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return null;
		}
		if (root.right == null) {
			return root;
		}
		if (root.right != null)
			return findMaximumNode(root.right);
		return null;
	}

	public static Node findMinimumNode(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return null;
		}
		if (root.left == null) {
			return root;
		}
		if (root.left != null) {
			return findMinimumNode(root.left);
		}
		return null;
	}

	public static void getAllLeafNodes(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			System.out.println(root.data);
		}
		if (root.left != null)
			getAllLeafNodes(root.left);
		if (root.right != null)
			getAllLeafNodes(root.right);
	}

	public static void getAllNonLeafNodes(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		if (root.left != null && root.right != null) {
			System.out.println(root.data);
		}
		if (root.left != null) {
			getAllNonLeafNodes(root.left);
		}
		if (root.right != null) {
			getAllNonLeafNodes(root.right);
		}
	}

	public static int getHeightOfBST(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
			return 0;
		int left = 1 + getHeightOfBST(root.left);
		int right = 1 + getHeightOfBST(root.right);
		return Math.max(left, right);
	}

	public static int getSumOfAllNodes(Node root, int i) {
		// TODO Auto-generated method stub
		if (root == null) {
			return 0;
		}
		int leftSum = getSumOfAllNodes(root.left, i + root.data);
		int rightSum = getSumOfAllNodes(root.right, i + root.data);
		return root.data + leftSum + rightSum;
	}

	public static void levelOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return;
		}
		Queue<Node> nodeQueue = new LinkedList<Node>();
		nodeQueue.add(root);
		while (!nodeQueue.isEmpty()) {
			Node current = nodeQueue.poll();
			System.out.print(current.data + " ");
			if (current.left != null) {
				nodeQueue.add(current.left);
			}
			if (current.right != null) {
				nodeQueue.add(current.right);
			}
		}
	}

	public static List<List<Integer>> levelOrderTraversalViaArrayList(Node root) {
		// TODO Auto-generated method stub
		if (root == null) {
			return null;
		}
		Queue<Node> nodeQueue = new LinkedList<Node>();
		nodeQueue.add(root);
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		while (!nodeQueue.isEmpty()) {
			int level = nodeQueue.size();
			List<Integer> l = new ArrayList<Integer>();
			for (int i = 0; i < level; i++) {
				Node current = nodeQueue.poll();
				l.add(current.data);
				if (current.left != null) {
					nodeQueue.add(current.left);
				}
				if (current.right != null) {
					nodeQueue.add(current.right);
				}
			}
			ll.add(l);
		}
		return ll;
	}

	public static List<List<Integer>> levelOrderTraversalZigZag(Node root) {
		// TODO Auto-generated method stub
		List<List<Integer>> ll = new ArrayList<List<Integer>>();
		if (root == null) {
			return ll;
		}
		boolean leftToRight = true;
		Queue<Node> nodeQueue = new LinkedList<Node>();
		nodeQueue.add(root);
		while (!nodeQueue.isEmpty()) {
			List<Integer> l = new ArrayList<Integer>();
			int level = nodeQueue.size();
			leftToRight = !leftToRight;
			for (int i = 0; i < level; i++) {
				Node current = nodeQueue.poll();
				l.add(current.data);
				if (current.left != null) {
					nodeQueue.add(current.left);
				}
				if (current.right != null) {
					nodeQueue.add(current.right);
				}
			}
			if(leftToRight) {
				Collections.reverse(l);
			}
			ll.add(l);
		}
		return ll;
	}
}
