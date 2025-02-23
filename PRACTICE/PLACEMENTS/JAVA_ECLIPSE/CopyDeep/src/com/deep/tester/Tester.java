package com.deep.tester;

import com.deep.entity.Address;
import com.deep.entity.Student;

public class Tester {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad1 = new Address("Pune");
		Student st1 = new Student();
		st1.setRollNo(1);
		st1.setAddress(ad1);
		
		Student st2 = (Student)st1.clone();
		st2.getAddress().setPlace("Manali");
		
		System.out.println(st1);
		System.out.println(st2);
	}
}
