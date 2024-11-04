package com.impl;

import com.node.Node;

public class ListImpl {
	public static Node head = null;

	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		return head == null;
	}

	public static void insert(Node node) {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			head = node;
			return;
		}
		if (head.data > node.data) {
			node.next = head;
			head = node;
			return;
		}
		Node current = head;
		while (current.next != null && node.data > current.next.data) {
				current = current.next;
		}
		node.next = current.next;
		current.next = node;
	}

	public static void printList() {
		// TODO Auto-generated method stub
		if (head == null)
			return;
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
	}

}
