package com.basics.datatypes.primitives;

public class ShortDatatype {
	public static void main(String a[]) {
		short s = 5;
		System.out.println(s);
		s = 200;
		System.out.println(s);
		s = 5000;
		System.out.println(s);
		s = 32767;
		System.out.println(s);
		s = -32768;
		System.out.println(s);
		s = (short) 50000;
		System.out.println(s);
		s = (byte)300;
		System.out.println(s);
		short aa = 10, bb = 20;
		s = (short)(aa + bb);
		System.out.println(s);
		s += 32767;			// implicit cast
		System.out.println(s);
//		s = s + 10; type mismatch	// potential data loss
//		s = s + aa; type mismatch
//		s = aa + s; type mismatch
	}
}
