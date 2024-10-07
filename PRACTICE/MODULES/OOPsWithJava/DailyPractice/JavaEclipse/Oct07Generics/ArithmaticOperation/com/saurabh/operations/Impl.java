package com.saurabh.operations;

public class Impl {
	public static void main(String[] args) {
		Operations<Integer> iOperations = new Operations<Integer>(20, 30);
		iOperations.addition();
		
		Operations<Float> fOperations = new Operations<Float>(20.6F, 45.2F);
		fOperations.subtraction();
	}
}
