package com.treedata;

import com.node.TreeNode;

public class DataUtility {
	public TreeNode<Integer> root;
	public TreeNode<Integer> getTreeData(){
		root = new TreeNode<Integer>(5);
		root.left = new TreeNode<Integer>(6);
		root.right = new TreeNode<Integer>(7);
		root.left.left = new TreeNode<Integer>(8);
		root.left.right = new TreeNode<Integer>(9);
		root.right.left = new TreeNode<Integer>(10);
		root.right.right = new TreeNode<Integer>(11);
		return root;
	}
}
