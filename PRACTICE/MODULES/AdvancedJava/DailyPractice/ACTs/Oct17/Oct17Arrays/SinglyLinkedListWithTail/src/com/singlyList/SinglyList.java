package com.singlyList;

import com.list.List;
import com.node.ListNode;

public class SinglyList<T> implements List<T> {
	ListNode head;
	ListNode tail;
	
	public int countNode() {
		ListNode current = head;
		int ctr = 0;
		while(current != null) {
			++ctr;
			current = current.next;
		}
		return ctr;
	}
	
	public void printList() {
		if(isEmpty()) {
			return;
		} else {
			ListNode current = head;
			while(current != null) {
				System.out.print(current.val + " ");
				current = current.next;
			}
			System.out.println();
			System.out.println("Tail node is : " + tail.val);
		}
	}
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
	
	@Override
	public void insertAtFrontIntoList(int val) {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			ListNode newNode = new ListNode();
			newNode.val = val;
			newNode.next = null;
			head = newNode;
			tail = newNode;
		} else {
			ListNode newNode = new ListNode();
			newNode.val = val;
			newNode.next = head;
			head = newNode;
		}
		printList();
	}

	@Override
	public void insertAtTailIntoList(int val) {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			ListNode newNode = new ListNode();
			newNode.val = val;
			newNode.next = null;
			head = newNode;
			tail = newNode;
		} else {
			ListNode newNode = new ListNode();
			newNode.val = val;
			newNode.next = null;
			ListNode current = head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			tail = newNode;
		}
		printList();
	}

	@Override
	public void insertAtMiddleIntoList(int val, int pos) {
		// TODO Auto-generated method stub
		if(pos < 0 || pos > countNode()) {
			return;
		}
		if(pos <= countNode()) {
			ListNode newNode = new ListNode();
			newNode.val = val;
			newNode.next = null;
			ListNode current = head;
			for(int i = 2; i < pos; i++) {
				current = current.next;
			}
			System.out.println(current.val);
			newNode.next = current.next;
			current.next = newNode;
		}
		printList();
	}

	@Override
	public int deleteAtFrontFromAList() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return -1;
		}
		if(head.next == null) {
			int val = head.val;
			head = head.next;
			tail = null;
			return val;
		} 
		if(head.next != null) {
			int val = head.val;
			head = head.next;
			return val;
		}
		return 0;
	}

	@Override
	public int deleteAtTailFromAList() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return -1;
		}
		if(head.next == null) {
			int val = head.val;
			head = null;
			tail = null;
			return val;
		}
		if(!isEmpty()) {
			ListNode current = head;
			while(current.next.next != null) {
				current = current.next;
			}
			int val = current.val;
			current.next = null;
			tail = current;
			return val;
		}
		return 0;
	}

	@Override
	public int deleteAtMiddleFromAList(int pos) {
		// TODO Auto-generated method stub
		ListNode current = head;
		if(isEmpty()) {
			return -1;
		}
		if(countNode() < 3) {
			return -1;
		}
		if(countNode() >= 3 && pos > 1 && pos < countNode()) {
//			printList();
			System.out.println(current.val);
			for(int i = 1; i < pos - 1; i++) {
				System.out.println(current.val);
				current = current.next;
			}
			System.out.println(current.val);
			if(current.next.next == null) {
				System.out.println("tail element : " + current.next.val);
				tail = current.next;
			}
			int val = current.next.val;
			current.next = current.next.next;
			printList();
			return val;
		}
		return -1;
	}

	@Override
	public int searchInAList(int val) {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			return -1;
		}
		if(!isEmpty()) {
			ListNode current = head;
			int ctr = 1;
			boolean flag = false;
			while(current != null) {
				if(current.val == val) {
					flag = true;
					break;
				}
				ctr++;
				current = current.next;
			}
			System.out.println("value found at : " + ctr);
			if(flag == false) {
				return -1;
			}
			return ctr;
		}
		return -1;
	}
}
