package com.saurabh.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.saurabh.data.FruitData;
import com.saurabh.pojo.Fruit;

public class Impl {
	public static void main(String[] args) {
		List<Fruit> fruitList = FruitData.getFruit();
		
		Scanner sc = new Scanner(System.in);
//		Filter by weight
		System.out.println("Filter by weight");
		List<Fruit> filterbyWeight = fruitList.stream()
			.filter(t -> t.getWeight() > 100)
			.collect(Collectors.toList());
		System.out.println(filterbyWeight);
		
//		filter by color
		System.out.println("filter by color");
		List<Fruit> collect = fruitList.stream()
			.filter(f -> f.getColor().equalsIgnoreCase("Green"))
			.collect(Collectors.toList());
		System.out.println(collect);

//		filter by color and weight
		System.out.println("filter by color and weight");
//		System.out.println("Enter color name");
//		String color = "Red"; //sc.nextLine();
//		System.out.println("Enter Weight");
//		double weight = 100; // sc.nextDouble();
		List<Fruit> collect2 = fruitList.stream()
			.filter(t -> t.getColor().equalsIgnoreCase("Red"))
			.filter(t -> t.getWeight() > 60)
			.collect(Collectors.toList());
		System.out.println(collect2);
		
//		filter by color, weight and taste
		System.out.println("filter by color, weight and taste");
		List<Fruit> collect3 = fruitList.stream()
			.filter(t -> t.getColor().equalsIgnoreCase("red"))
			.filter(t -> t.getWeight() > 75 && t.getWeight() < 115)
			.filter(t -> t.getTaste().equals("Sweet"))
			.collect(Collectors.toList());
		System.out.println(collect3);
		
//		Sort by weight
		System.out.println("Sort by weight");
		fruitList.stream()
			.sorted(Comparator.comparing(Fruit::getWeight))
			.forEach(System.out::println);
		
		
//		fruitList.stream()
//			.sorted((a,s) -> a.getWeight().compareTo(s.getWeight()))
//			.forEach(System.out::println);
//			.sorted((a,s) -> a.getWeight().compareTo(s.getWeight()))
//			.forEach(System.out::println);
	}
}
