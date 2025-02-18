package com.streams.impl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.streams.entity.Student;

public class ListMethods {

	public static void listOfAllStudentsWithGradeA(List<Student> students) {
		// TODO Auto-generated method stub
		List<Student> studentsWithGradeA = students.stream()
			.filter(stud -> stud.getGrade() == 'A')
			.collect(Collectors.toList());
		System.out.println(studentsWithGradeA);
	}

	public static void sortMarksInDescending(List<Student> students) {
		// TODO Auto-generated method stub
		List<Student> sortMarksInDescending = students.stream()
			.sorted(Comparator.comparingDouble(Student::getMarks).reversed())
			.collect(Collectors.toList());
		for(Student student : sortMarksInDescending) {
			System.out.println(student);
		}
	}

}
