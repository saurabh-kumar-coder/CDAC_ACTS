package com.singly;

import com.list.List;
import com.node.Node;

public class SinglyList<T> implements List<T> {

	Node head = null;

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (head == null) {
			System.out.println("List is empty");
			return true;
		}
		return false;
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public int getNumberOfElementsInList() {
		// TODO Auto-generated method stub
		Node current = head;
		int ctr = 0;
		while (current != null) {
			ctr++;
			current = current.next;
		}
		return ctr;
	}
	
	@Override
	public Node getNodeAtAPosition(int pos) {
		Node current = head;
		if(pos == 0 || pos >= getNumberOfElementsInList()) {
			return null;
		} else {
			int ctr = 0;
			while(ctr < pos) {
				current = current.next;
				ctr++;
			}
		}
		return current;
	}
	
	@Override
	public Node getLastNode() {
		// TODO Auto-generated method stub
		Node current = head;
		if(isEmpty()) {
			return null;
		} else {
			while(current.next != null) {
				current= current.next;
			}
			return current;
		}
	}

	@Override
	public void addAtFirst(int element) {
		// TODO Auto-generated method stub
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	@Override
	public void addAtLast(int element) {
		// TODO Auto-generated method stub
		Node current = head;
		Node newNode = new Node();
		newNode.data = element;
		newNode.next = null;
		if (isEmpty()) {
			addAtFirst(element);
		} else {
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	@Override
	public int deleteAtFirst() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			return 0;
		} else {
			int val = head.data;
			head = head.next;
			return val;
		}
	}

	@Override
	public int getFirstElement() {
		// TODO Auto-generated method stub
		int val = deleteAtFirst();
		addAtFirst(val);
		return val;
	}

	@Override
	public int findSecondLargestElement() {
		// TODO Auto-generated method stub
		Node current = head;
		int sndLarge = 0;
		int large = 0;
		if (isEmpty()) {
			System.out.println("List is empty");
			return -1;
		} else if (current.next != null) {
			return current.data;
		} else if (current.next.next != null) {
			if (current.data > current.next.data) {
				return current.next.data;
			} else {
				return current.data;
			}
		}
		while (current.next != null) {
//			large = 
		}
		return 0;
	}

	@Override
	public int findKthLastElement(int position) {
		// TODO Auto-generated method stub
		Node rabbit = head;
		Node turtoise = head;
		int ctr = 0;
		while (ctr < position && rabbit != null) {
			rabbit = rabbit.next;
			ctr++;
		}
		while (rabbit != null) {
			rabbit = rabbit.next;
			turtoise = turtoise.next;
		}
		return turtoise.data;
	}

	public void createLoop(int position) {
		if(position < 0 || position >= getNumberOfElementsInList()) {
			return;
		}
		Node node1 = getNodeAtAPosition(position);
		Node node2 = getLastNode();
		node2.next = node1;
	}
	
	@Override
	public boolean detectALoopInALinkedList() {
		// TODO Auto-generated method stub
		Node rabbit = head;
		Node turtoise = head;
		if(isEmpty()) {
			return false;
		} else {
			while(rabbit.next.next != null) {
				rabbit = rabbit.next.next;
				turtoise = turtoise.next;
				if(rabbit == turtoise) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Node reverseALinkedList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAtASpecificPosition(int position) {
		// TODO Auto-generated method stub
		Node current = head;
		if(isEmpty()) {
			return 0;
		} else {
			int ctr = 1;
			while(ctr < position-1) {
				ctr++;
				current = current.next;
			}
			int deletedItem = current.next.data;
			current.next = current.next.next;
			return deletedItem;
		}
	}

	@Override
	public void addAtASpecificPosition(int element, int position) {
		// TODO Auto-generated method stub
		Node current = head;
		if(isEmpty() && getNumberOfElementsInList() < position) {
			return;
		} else {
			Node newNode = new Node();
			newNode.data = element;
			newNode.next = null;
//			int ctr = 1;
			if(position == 1) {
				addAtFirst(element);
				return;
			}
			for(int i = 1; i < position -1; i++) {
				current = current.next;
			}
//			while(ctr < position - 1 && current != null) {
//				current = current.next;
//				++ctr;
//			}
			newNode.next = current.next;
			current.next = newNode;
			return;
		}
	}

	@Override
	public void addElementAfterASpecificPosition(int position) {
		// TODO Auto-generated method stub

	}

}
