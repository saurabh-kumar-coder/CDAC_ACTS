package com.saurabh.tester;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		List<Integer> ll = new CopyOnWriteArrayList<>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		int i = 500;
		for (Integer li : ll) {
			System.out.println(li);
			i = i + 10;
			ll.add(i);
		}
		System.out.println(ll);
	}
}
