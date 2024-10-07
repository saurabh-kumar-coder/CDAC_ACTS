package com.saurabh.first;

public class GenericType<T> {
	private T num;

	public GenericType(T num) {
		super();
		this.num = num;
	}

	public T getNum() {
		return num;
	}

	public void setNum(T num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "GenericType [num=" + num + "]";
	}
}
