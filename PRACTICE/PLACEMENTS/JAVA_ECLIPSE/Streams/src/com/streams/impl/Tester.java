package com.streams.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.streams.data.StudentData;
import com.streams.entity.Student;

public class Tester {
	public static void main(String[] args) {
		List<Student> students = StudentData.getStudents();

		// Creating a HashMap with ID as key and Student object as value
		Map<Integer, Student> studentMap = new HashMap<>();
		for (Student student : students) {
			studentMap.put(student.getId(), student);
		}
//		studentMap.forEach((id, stud) -> System.out.println(id + " -> " + stud));
		
//		01. Filter all students who have a grade 'A' and collect them into a List<Student>.
//		ListMethods.listOfAllStudentsWithGradeA(students);
		
//		02. Sort students by marks in descending order and collect them into a List<Student>.
		ListMethods.sortMarksInDescending(students);

	}
}
