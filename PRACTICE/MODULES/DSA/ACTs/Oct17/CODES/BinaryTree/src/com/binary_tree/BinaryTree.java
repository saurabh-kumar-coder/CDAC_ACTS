package com.binary_tree;

public class BinaryTree {
	private Node root;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		this.root = null;
	}
	
	public Node createBinaryTree(){
		Node n1 = new Node(4);
		Node n2 = new Node(6);
		Node n3 = new Node(2);
		Node n4 = new Node(1);
		Node n5 = new Node(3);
		Node n6 = new Node(5);
		
		
		n1.left = n2;
		n1.right = n3;
		root = n1;
		
		n2.left = n4;
		n2.right = n5;
		
		n4.left = null;
		n4.right = null;
		
		n5.left = null;
		n5.right = null;
		
		n3.left = null;
		n3.right = n6;
		
		n6.left = null;
		n6.right = null;
		
		return root;
	}
	
//	private Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void inOrderPrint(Node root) {
		if(root == null) {
			return ;
		}
		
		inOrderPrint(root.left);
		System.out.println(root.data );
		inOrderPrint(root.right);
	}
	
	public static void preOrderPrint(Node root) {
		if(root == null) {
			return ;
		}
		
		System.out.println(root.data );
		preOrderPrint(root.left);
		preOrderPrint(root.right);
	}
	
	public static void postOrderPrint(Node root) {
		if(root == null) {
			return ;
		}
		
		postOrderPrint(root.left);
		postOrderPrint(root.right);
		System.out.println(root.data );
	}
	
	public void inOrderPrint() {
		inOrderPrint(root);
	}
}
