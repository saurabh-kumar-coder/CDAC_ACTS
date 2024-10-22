package com.list;

public interface List<T> {
	void insertAtFrontIntoList(int val);
	void insertAtTailIntoList(int val);
	void insertAtMiddleIntoList(int val, int pos);
	int deleteAtFrontFromAList();
	int deleteAtTailFromAList();
	int deleteAtMiddleFromAList(int pos);
	int searchInAList(int val);
}
