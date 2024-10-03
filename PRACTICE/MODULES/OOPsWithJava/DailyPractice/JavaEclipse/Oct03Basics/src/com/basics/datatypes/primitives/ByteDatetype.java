package com.basics.datatypes.primitives;

public class ByteDatetype {
	public static void main(String[] args) {
		byte b = 10;
		b = 20;
		System.out.println(b);
//		b = b + 10;		// potential loss
		b += 10;
		System.out.println(b);
		b = (byte)300;
		System.out.println(b);
	}
}
