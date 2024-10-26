package com.tester;

import com.node.Node;
import com.utility.CompleteBinaryTreeUtility;

public class CBTTester {
	public static void main(String[] args) {
		CompleteBinaryTreeUtility btu = new CompleteBinaryTreeUtility();
		System.out.println("enter the nodes");
		int [] nodes = {1,2,3,4,5,6,7,8,9};
		for(int i = 0; i < nodes.length; i++) {
			btu.createNodes(new Node(nodes[i]));
		}
		System.out.println("printing In Order Traversal");
		btu.inOrderPrint();
		btu.searchInCBT();
		System.out.println("printing all Leaf nodes");
		btu.getAllLeafNodes();
		System.out.println("\nprinting all Non Leaf nodes");
		btu.getAllNonLeafNodes();
	}
}
