package com.pair;

public class Pair {
	public int key;
	public String value;
	public Pair() {
		super();
		// TODO Auto-generated constructor stub
		key = 0;
		value = "";
	}
	public Pair(int key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Pair [key=" + key + ", value=" + value + "]";
	}
}
