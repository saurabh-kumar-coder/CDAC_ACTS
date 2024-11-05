package com.impl;

import com.node.Node;

public class DLLImpl {

	public static Node head = null;

	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head == null) {
			return true;
		}
		return false;
	}

	public static void addAtFirst(Node node) {
		if (isEmpty()) {
			head = node;
			return;
		}
	}

	public static void insert(Node node) {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			addAtFirst(node);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = node;

	}

	public static void printDLL() {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("List is null");
			return;
		}
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println();
	}

	public static void insertAtPosition(Node node, int pos) {
		// TODO Auto-generated method stub
		Node current = head;
		for (int i = 1; i < pos - 1; i++) {
			if (current == null) {
				return;
			}
			current = current.next;
		}
		node.next = current.next;
		current.next.prev = node;
		current.next = node;
		node.prev = current;
	}

	public static int deleteAtPosition(int pos) {
		// TODO Auto-generated method stub
		if(pos == 1) {
			int value = deleteAtFirst();
			return value;
		}
		Node current = head;
		for(int i = 1; i < pos - 1; i++) {
			current = current.next;
		}
		int value  = current.next.data;
		current.next = current.next.next;
		return value;
	}

	private static int deleteAtFirst() {
		// TODO Auto-generated method stub
		if(head.next == null) {
			head = null;
			return -1;
		}
		int value = head.data;
		head = head.next;
		return value;
	}

}
