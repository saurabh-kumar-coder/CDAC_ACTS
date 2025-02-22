package com.basic.default_size;

import java.util.ArrayList;
import java.util.List;

public class DefaultSize {
	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();
		System.out.println(integerList.size());
		integerList.add(1);
		System.out.println(integerList.size());
		System.out.println(integerList);
	}
}
