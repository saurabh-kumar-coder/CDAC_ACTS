package com.basic.local_variable;

public class LocalVariable {
	static int a;
	int aa;
	public LocalVariable(int aa) {
		// TODO Auto-generated constructor stub
		this.aa = aa;
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(args instanceof String[]);
		char c = 'm';
		System.out.println((int)c);
		byte b = 90;
		System.out.println((char)b);
		LocalVariable lv = new LocalVariable(b);
	}
}
