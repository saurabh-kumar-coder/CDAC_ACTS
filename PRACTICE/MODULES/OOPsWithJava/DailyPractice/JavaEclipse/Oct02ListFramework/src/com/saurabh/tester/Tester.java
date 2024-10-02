package com.saurabh.tester;

import java.util.ArrayList;
import java.util.List;

import com.saurabh.stringdata.StringList;

public class Tester {
	public static void main(String[] args) {
		List<String> stringList = StringList.getStringList();
		System.out.println(stringList);
		stringList.add("ZZZ");
		System.out.println(stringList);
		System.out.println(stringList.contains("ABC"));
		List<Double> doubleList = new ArrayList<>();
		doubleList.add(10.0);
		doubleList.add((double)20);
		
	}
}
