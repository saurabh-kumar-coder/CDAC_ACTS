package com.tester;

import com.utility.ListUtility;

public class Tester {
	public static void main(String[] args) {
		boolean isEmpty = ListUtility.isEmpty();
		System.out.println("List is Empty : " + isEmpty);
		
		int [] array = {9,3,3,2,2,2,5,4};
		for(int i = 0; i < array.length; i++) {
			ListUtility.insert(array[i]);
			ListUtility.printList();
			System.out.println();	
		}
	}
}