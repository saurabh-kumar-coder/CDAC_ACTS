package com.tester;

import com.utility.DLLUtility;

public class Tester {
	public static void main(String[] args) {
		boolean isEmpty = DLLUtility.isEmpty();
		System.out.println("DLL is Empty ? " + isEmpty);
		
		int[] array = {1,2,5};
		for (int i = 0; i < array.length; i++) {
			DLLUtility.insert(array[i]);
			DLLUtility.printDLL();
		}
		DLLUtility.insertAtPosition(4, 3);
		DLLUtility.printDLL();
	}
}
