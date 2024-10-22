package com.tester;

import com.singlyList.SinglyList;

public class PalindromeTester {
	public static void main(String[] args) {
		SinglyList<String> sl = new SinglyList<String>();
		sl.insertAtFrontIntoList("d");
		sl.insertAtFrontIntoList("u");
		sl.insertAtFrontIntoList("c");
		sl.insertAtFrontIntoList("a");
		sl.insertAtFrontIntoList("c");
		sl.insertAtFrontIntoList("c");
		sl.insertAtFrontIntoList("a");
		sl.insertAtFrontIntoList("c");
		sl.insertAtFrontIntoList("u");
		sl.insertAtFrontIntoList("d");
		sl.printList();
		System.out.println(sl.checkPalindrome());
	}
}
