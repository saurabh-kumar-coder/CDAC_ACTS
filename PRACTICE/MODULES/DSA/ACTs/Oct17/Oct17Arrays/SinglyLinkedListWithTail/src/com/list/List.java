package com.list;

public interface List<T> {
	void insertAtFrontIntoList(T val);
	void insertAtTailIntoList(T val);
	void insertAtMiddleIntoList(T val, int pos);
	T deleteAtFrontFromAList();
	T deleteAtTailFromAList();
	T deleteAtMiddleFromAList(int pos);
	int searchInAList(T val);
	boolean checkPalindrome();
}
