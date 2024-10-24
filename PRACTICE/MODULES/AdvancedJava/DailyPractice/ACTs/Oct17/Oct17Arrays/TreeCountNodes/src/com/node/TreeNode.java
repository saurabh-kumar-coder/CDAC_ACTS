package com.node;

public class TreeNode<T> {
	public TreeNode<T> left;
	public T data;
	public TreeNode<T> right;
	
	public TreeNode(T data){
		this.data = data;
	}
}
