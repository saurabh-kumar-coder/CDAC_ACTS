package com.impl;

import com.node.TreeNode;
import com.treedata.DataUtility;

public class Impl {
	public static void main(String[] args) {
		DataUtility du = new DataUtility();
		System.out.println("ctr is : " + inOrderTraversal(du.getTreeData()));
	}

	private static int inOrderTraversal(TreeNode<Integer> root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return 0;
		}
		
		int l = inOrderTraversal(root.left);
//		System.out.println("root data : " + root.data + " ");
		int r = inOrderTraversal(root.right);
		return 1 + l + r;
	}
}
