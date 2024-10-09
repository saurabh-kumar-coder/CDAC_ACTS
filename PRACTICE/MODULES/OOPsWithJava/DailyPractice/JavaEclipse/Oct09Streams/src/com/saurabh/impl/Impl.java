package com.saurabh.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

import com.saurabh.data.StudentData;
import com.saurabh.pojo.Student;

public class Impl {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList = StudentData.getStudent();
//		System.out.println(studentList);
		
////		to find student whose address line2 is "PAODSA"
//		System.out.println("to find student whose address line2 is \"PAODSA\"");
//		studentList.stream()
//			.distinct()
//			.filter(t -> t.getAddress().getLine2().equals("PAODSA"))
//			.forEach(System.out::println);
//		
////		to find student who scored more than 75%
//		System.out.println("to find student who scored more than 75%");
//		studentList.stream()
//			.filter(t -> t.getMarks() > 75.0)
//			.forEach(System.out::println);
//		
////		to find student whose id is more than 5 and marks is more than 60
//		System.out.println("to find student whose id is more than 5 and marks is more than 60");
//		studentList.stream()
//			.filter(t -> t.getId() > 5)
//			.filter(t -> t.getMarks() > 60)
//			.forEach(System.out::println);
//		
////		Find the student with the highest percentage:
//		System.out.println("Find the student with the highest percentage:");
//		Student orElse = studentList.stream()
//			.max(Comparator.comparing(Student::getMarks))
//			.orElse(null);
//		System.out.println(orElse);
//		
////		 Find the average percentage of all students:
//		System.out.println(" Find the average percentage of all students:");
//		double average = studentList.stream()
//			.mapToDouble(t -> t.getMarks())
//			.average()
//			.orElse(0.0);
//		System.out.println(average);
//		
////		Find the student with the lowest roll number:
//		System.out.println("Find the student with the lowest roll number:");
//		Student orElse2 = studentList.stream()
//			.min(Comparator.comparing(Student::getId))
//			.orElse(null);
//		System.out.println(orElse2);
//		
////		Sort the students by name in descending order:
//		System.out.println("Sort the students by name in descending order:");
//		studentList.stream()
//			.sorted((o1, o2) -> o2.getName().compareTo(o1.getName()))
//			.sorted((o1, o2) -> o2.getMarks().compareTo(o1.getMarks()))
//			.collect(Collectors.toList())
//			.forEach(System.out::println);

//		sorting using student name and address line1
		studentList.stream()
			.sorted(Comparator.comparing(Student::getName)
					.thenComparing(st -> st.getAddress().getLine1(), String::compareTo))
			.collect(Collectors.toList())
			.forEach(System.out::println);;
				
	}
}
