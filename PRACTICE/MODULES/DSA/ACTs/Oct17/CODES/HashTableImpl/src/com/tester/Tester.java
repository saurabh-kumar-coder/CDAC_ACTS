package com.tester;

import com.hashtableimpl.HashTable;

public class Tester {
	public static void main(String[] args) {
		HashTable ht = new HashTable();
		ht.put(14, "Lakshman");
		ht.put(23, "Govind");
		ht.put(57, "Pappi Bhai");
		ht.put(78, "Vasuli Bhai");
		ht.put(97, "Pari");
		ht.put(48, "Kajol");
		System.out.println(ht.get(48));
	}
}
