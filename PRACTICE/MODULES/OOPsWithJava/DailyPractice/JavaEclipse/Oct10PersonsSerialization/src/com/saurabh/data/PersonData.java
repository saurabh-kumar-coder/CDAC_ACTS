package com.saurabh.data;

import java.util.ArrayList;
import java.util.List;

import com.saurabh.pojo.Address;
import com.saurabh.pojo.Person;

public class PersonData {
	public static List<Person> getPersonData(){
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person(10, "Rahul", new Address("Pune", "Pashan")));
		personList.add(new Person(20, "Nitin", new Address("Mumabi", "Borewali")));
		return personList;
	}
}
