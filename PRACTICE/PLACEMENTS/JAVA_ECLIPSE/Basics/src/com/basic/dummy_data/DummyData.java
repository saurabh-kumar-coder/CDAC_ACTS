package com.basic.dummy_data;

import java.util.ArrayList;
import java.util.List;

public class DummyData {
	public static List<Data> getDummyData(){
		List<Data> list = new ArrayList<>();
		list.add(new Data(1, "Active"));
		list.add(new Data(2, "InActive"));
		list.add(new Data(3, "Active"));
		list.add(new Data(4, "InActive"));
		list.add(new Data(5, "Active"));
		list.add(new Data(6, "InActive"));
		return list;
	}
}
