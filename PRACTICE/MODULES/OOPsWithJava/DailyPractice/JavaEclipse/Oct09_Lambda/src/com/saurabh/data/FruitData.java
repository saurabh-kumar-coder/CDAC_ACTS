package com.saurabh.data;

import java.util.ArrayList;
import java.util.List;

import com.saurabh.pojo.Fruit;

public class FruitData {
	public static List<Fruit> getFruit(){
		List<Fruit> fruitList = new ArrayList<Fruit>();
		fruitList.add(new Fruit("Red", "Sweet", 50));
		fruitList.add(new Fruit("Green", "Sour", 90));
		fruitList.add(new Fruit("Red", "Sweet", 150));
		fruitList.add(new Fruit("Green", "Sour", 50));
		fruitList.add(new Fruit("Red", "Sweet", 100));
		fruitList.add(new Fruit("Red", "Sweet", 135));
		fruitList.add(new Fruit("Green", "Sweet", 75));
		return fruitList;
	}
}
