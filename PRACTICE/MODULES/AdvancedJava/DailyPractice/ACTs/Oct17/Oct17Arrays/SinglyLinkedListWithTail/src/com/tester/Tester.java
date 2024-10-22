package com.tester;

import com.singlyList.SinglyList;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyList<Integer> sl = new SinglyList<Integer>();
		sl.insertAtFrontIntoList(5);
		sl.insertAtFrontIntoList(6);
		sl.insertAtFrontIntoList(7);
		
		sl.insertAtTailIntoList(1);
		System.out.println(sl.countNode());
		
		sl.insertAtMiddleIntoList(2, 3);
		sl.insertAtMiddleIntoList(10, 4);
		sl.insertAtMiddleIntoList(20, 2);
		
		sl.printList();
		System.out.println("Deleted item is : " + sl.deleteAtFrontFromAList());
		sl.printList();
		
		System.out.println(sl.deleteAtTailFromAList());
		sl.printList();
		
		System.out.println(sl.searchInAList(20));
		System.out.println(sl.searchInAList(0));
		System.out.println(sl.searchInAList(5));
		
		System.out.println(sl.deleteAtMiddleFromAList(3));
		sl.printList();
		
	}
}
