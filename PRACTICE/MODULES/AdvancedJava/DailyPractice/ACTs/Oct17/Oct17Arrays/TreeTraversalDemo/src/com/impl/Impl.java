package com.impl;

import com.treedata.DataUtility;
import com.treedemo.TreeNode;

public class Impl {
	public static void main(String[] args) {
		inOrderTrav(DataUtility.getTree());
		System.out.println();
		preOrderTrav(DataUtility.getTree());
		System.out.println();
		postOrderTrav(DataUtility.getTree());
	}

	private static void inOrderTrav(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		inOrderTrav(root.prev);
		System.out.println( root.data + " ");
		inOrderTrav(root.next);
	}
	
	private static void preOrderTrav(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.println(root.data + "");
		preOrderTrav(root.prev);
		preOrderTrav(root.next);
	}
	
	private static void postOrderTrav(TreeNode root) {
		if(root == null) {
			return;
		}
		postOrderTrav(root.prev);
		postOrderTrav(root.next);
		System.out.println(root.data + " ");
	}
}
