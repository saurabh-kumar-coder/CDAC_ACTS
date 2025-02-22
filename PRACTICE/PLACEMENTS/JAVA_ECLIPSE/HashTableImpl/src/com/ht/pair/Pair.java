package com.ht.pair;

public class Pair {
	private int key;
	private String value;
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Pair() {
		this.key = 0;
		this.value = "";
	}
	public Pair(int key, String value){
		this.key = key;
		this.value = value;
	}
}
