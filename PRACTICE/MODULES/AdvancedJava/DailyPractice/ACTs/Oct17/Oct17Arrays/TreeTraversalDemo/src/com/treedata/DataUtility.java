package com.treedata;

import com.treedemo.TreeNode;

public class DataUtility {
	public static TreeNode root;
	
	public static TreeNode getTree() {
		root = new TreeNode(3);
		root.next = new TreeNode(5);
		root.next.next = new TreeNode(6);
		root.prev = new TreeNode(4);
		return root;
	}
}
