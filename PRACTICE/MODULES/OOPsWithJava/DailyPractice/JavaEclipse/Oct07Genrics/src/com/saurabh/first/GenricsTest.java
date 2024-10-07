package com.saurabh.first;

public class GenricsTest {
	public static void main(String[] args) {
		GenericType<Integer> inum = new GenericType<Integer>(10);
		inum.setNum(20);
		System.out.println(inum);
		
		GenericType<Double> dnum = new GenericType<Double>(10.1);
		dnum.setNum(20.2);
		System.out.println(dnum);
		
		GenericType<String> snum = new GenericType<String>("saurabh");
		snum.setNum("Kumar");
		System.out.println(snum);
	}
}
