package com.entity;

public class Node {
	public Node next;
	public User user;
	public Node(User user) {
		super();
		this.user = user;
		this.next = null;
	}	
}
