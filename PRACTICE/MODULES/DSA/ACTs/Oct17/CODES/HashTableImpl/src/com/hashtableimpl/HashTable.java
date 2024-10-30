package com.hashtableimpl;

import java.util.LinkedList;

import com.pair.Pair;

public class HashTable {
	private static final int SLOTS = 10;
	private LinkedList<Pair> table[];
	public HashTable() {
		super();
		// TODO Auto-generated constructor stub
		table = new LinkedList[SLOTS];
		for(int i = 0; i < SLOTS; i++) {
			table[i] = new LinkedList<Pair>();
		}
	}
	
	public int hash(int key) {
		return key % SLOTS;
	}
	
	public void put(int key, String value) {
//		find slot for given key for hash function
		int slot = hash(key);
//		access the bucket in the slot
		LinkedList<Pair> bucket = table[slot];
//		get the key value pair in the given bucket
		for(Pair pair : bucket) {
			if(key == pair.key) {
				pair.value = value;
				return;
			}
		}
//		if key not found create a new pair and add into bucket
		Pair pair = new Pair(key, value);
		bucket.add(pair);
		return;
	}
	
	public String get(int key) {
//		find slot for given key for hash function
		int slot = hash(key);
//		access the bucket in the slot
		LinkedList<Pair> bucket = table[slot];
//		get the key value pair in the given bucket
		for(Pair pair : bucket) {
			if(key == pair.key) {
				return pair.value;
			}
		}
//		if key not found return null
		return null;
	}
	
}
