package com.ht.hashtable;

import java.util.LinkedList;

import com.ht.pair.Pair;

public class MyHashTable {
	private static int SLOTS = 10;
	private LinkedList<Pair> table[];
//	@SuppressWarnings("unchecked")
	public MyHashTable() {
		super();
//		this.table = new LinkedList[SLOTS];
		this.table = (LinkedList<Pair>[]) new LinkedList[SLOTS];
		for (int i = 0; i < SLOTS; i++) {
			this.table[i] = new LinkedList<>();
		}
	}

	public int hash(int key) {
		return key % 10;
	}

	public void put(int key, String value) {
		int slot = hash(key);
		LinkedList<Pair> bucket = table[slot];
		for (Pair pair : bucket) {
			if(key == pair.getKey()) {
				pair.setValue(value);
				return;
			}
		}
		bucket.add(new Pair(key, value));
		return;
	}
	public String get(int key) {
		int slot = hash(key);
		LinkedList<Pair> bucket = table[slot];
		for (Pair pair : bucket) {
			if(key == pair.getKey()) {
				return pair.getValue();
			}
		}
		return null;
	}
}
