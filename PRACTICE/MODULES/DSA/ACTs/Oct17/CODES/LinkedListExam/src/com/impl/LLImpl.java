package com.impl;

import com.entity.Node;
import com.entity.User;

public class LLImpl {

	public static Node head = null;
	
	public static boolean isEmpty() {
		// TODO Auto-generated method stub
		if(head == null) {
			return true;
		}
		return false;
	}
	
	public static void insert(User user) {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			head = new Node(user);
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;	
		}
		current.next = new Node(user);
		return;
	}

	public static void printList() {
		// TODO Auto-generated method stub
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		while(current != null) {
			System.out.print(current.user);
			current = current.next;
		}
		System.out.println();
	}

	public static void insert(User user, int pos) {
		// TODO Auto-generated method stub
		if(head == null) {
			return;
		}
		Node newNode = new Node(user);
		Node current = head;
		for(int i = 1; i < pos - 1; i++) {
			if(current == null) {
				System.out.println("cannot reach till position");
				return;
			}
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode;
	}

	public static void sort(int count) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < count - 1; i++) {
	        Node current = head;
	        Node previous = null;

	        // Inner loop: Perform bubble sort comparisons and swaps
	        for (int j = 0; j < count - i - 1; j++) {
	            if (current != null && current.next != null && current.user.getUserId() > current.next.user.getUserId()) {
	                // Swap the nodes by adjusting their links
	                Node nextNode = current.next;
	                current.next = nextNode.next;
	                nextNode.next = current;

	                // Fix previous node's next pointer if not at the head
	                if (previous == null) {
	                    head = nextNode; // Head node change
	                } else {
	                    previous.next = nextNode;
	                }

	                // Move to the next node in the list
	                current = nextNode;
	            }
	            previous = current;
	            current = current.next;
	        }
	    }
	}

	public static int countInList() {
		// TODO Auto-generated method stub
		int ctr = 0;
		Node current = head;
		while(current != null) {
			ctr++;
			current = current.next;
		}
		System.out.println();
		return ctr;
	}

}
