package com.ht.tester;

import com.ht.hashtable.MyHashTable;

public class Tester {
	public static void main(String[] args) {
		
		MyHashTable ht = new MyHashTable();
		ht.put(102, "saurabh");
		System.out.println(ht.get(102));
		ht.put(102, "parents");
		System.out.println(ht.get(102));
	}
}
