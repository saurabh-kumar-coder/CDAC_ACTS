package com.tester;

import com.hashtableimpl.HashTable;

public class Tester {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.put(14, "Lakshman");
		ht.put(44, "c");
		ht.put(34, "B");
		ht.put(24, "A");
		ht.put(23, "Govind");
		ht.put(57, "Pappi Bhai");
		ht.put(78, "Vasuli Bhai");
		ht.put(97, "Pari");
		ht.put(48, "Kajol");
		System.out.println(ht.get(48));
		System.out.println(ht.get(78));
		System.out.println(ht.get(24));
		System.out.println(ht.get(14));

//		if the key is same it is replaced,
//		but if the key is different it will add into LinkedList
	}
}
