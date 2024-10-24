package com.list;

import com.node.Node;

public interface List<T> {
	public boolean isEmpty();
	public void printList();
	public int getNumberOfElementsInList();
	public Node getNodeAtAPosition(int pos);
	public Node getLastNode();
	public void addAtFirst(int element);
	public void addAtLast(int element);
	public int deleteAtFirst();
	public int getFirstElement();
	
	public int findSecondLargestElement();
	public int findKthLastElement(int position);
	
	public void createLoop(int position);
	public boolean detectALoopInALinkedList();
	
	public Node reverseALinkedList();
	
	public int deleteAtASpecificPosition(int position);
	public void addAtASpecificPosition(int element, int position);
	public void addElementAfterASpecificPosition(int element, int position);
//	delete dublicates from list
	public Node deleteDublicateFromSortedList();
}