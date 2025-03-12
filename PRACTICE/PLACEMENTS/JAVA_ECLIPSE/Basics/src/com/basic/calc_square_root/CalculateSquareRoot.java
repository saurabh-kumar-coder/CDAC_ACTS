package com.basic.calc_square_root;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.basic.dummy_data.Data;
import com.basic.dummy_data.DummyData;

public class CalculateSquareRoot {
	public static void main(String[] args) {
//		System.out.println(calculateSquareRoot(25));
//		replaceString("banana", "bana");
//		getList();
		getRCount("Saurabh is Developer");
	}
	private static void getRCount(String string) {
		// TODO Auto-generated method stub
		Map<Character, Integer> map = new HashMap<>();
		for(Character ch : string.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		map.entrySet().stream()
			.forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
	}
	/*
	private static void replaceString(String string, String nstr) {
//		// TODO Auto-generated method stub
		String str = "x";
//		StringBuilder sb = new StringBuilder(string);
//		sb.replace(0, 3, "x");
//		System.out.println(sb);
		int i = 0;
		if(string.contains(nstr)) {
			i = nstr.length();
//			System.out.println(indexOf);
			for(; i < string.length(); i++) {
				str += string.charAt(i);
			}
		}
		System.out.println(str);
	}

	private static int calculateSquareRoot(int number) {
		// TODO Auto-generated method stub
		for(int i = 1; i*i <= number; i++) {
			if(i*i == number) {
				return i;
			}
		}	
		return 0;
	}
	*/
	private static void getList() {
		List<Data> list = DummyData.getDummyData();
		Map<String, Data> map = new LinkedHashMap<>();
		for(Data data : list) {
			System.out.println(map.put(data.getStatus(), data));
		}

		map.entrySet().stream()
			.forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
	}
	
}

//			if(data.getStatus().equals("Active")) {
//				currentData.add(data);
//			}