package com.saurabh.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.saurabh.data.StudentData;
import com.saurabh.pojo.Student;

public class Impl {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList = StudentData.getStudent();
//		System.out.println(studentList);
//		to find student whose address line2 is "PAODSA"
		studentList.stream()
			.distinct()
			.filter(t -> t.getAddress().getLine2().equals("PAODSA"))
			.forEach(System.out::println);
	}
}
