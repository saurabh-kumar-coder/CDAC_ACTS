package com.shallow.tester;

import com.shallow.entity.Address;
import com.shallow.entity.Student;

public class Tester {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad1 = new Address("Delhi");
		Student st1 = new Student();
		st1.setRollNo(1);
		st1.setAddress(ad1);
		
		Student st2 = (Student)st1.clone();
		st2.setRollNo(2);
		st2.getAddress().setPlace("Kolkata");
		
		System.out.println(st1);
		System.out.println(st2);
		
	}
}
