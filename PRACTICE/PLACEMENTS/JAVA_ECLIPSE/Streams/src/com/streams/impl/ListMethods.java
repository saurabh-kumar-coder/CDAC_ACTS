package com.streams.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
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

	public static void listOfStudentsWithAttendanceMoreThan85Percent(List<Student> students) {
		// TODO Auto-generated method stub
		List<Student> studentsWithAttendanceMoreThan85Percent = students.stream()
			.filter(stu -> stu.getAttendancePercentage() > 85)
			.collect(Collectors.toList());
		for(Student student : studentsWithAttendanceMoreThan85Percent) {
			System.out.println(student);
		}
	}

	public static void studentsNameToUpperCase(List<Student> students) {
		// TODO Auto-generated method stub
		List<String> studentsNameToUpperCase = students.stream()
			.map(student -> student.getName().toUpperCase())
			.collect(Collectors.toList());
		for(String student : studentsNameToUpperCase) {
			System.out.println(student);
		}
	}

	public static void getAllUniqueCoursesTakenByStudents(List<Student> students) {
		// TODO Auto-generated method stub
		List<String> getAllUniqueCoursesTakenByStudents = students.stream()
			.flatMap(st -> st.getCourses().stream())
			.distinct()
			.collect(Collectors.toList());
		for (String courses : getAllUniqueCoursesTakenByStudents) {
			System.out.println(courses);
		}
	}

	public static void studentWithHighestMarks(List<Student> students) {
		// TODO Auto-generated method stub
		Optional<Student> hightestMarksOfStudent = students.stream()
			.max(Comparator.comparing(Student::getMarks));
		System.out.println(hightestMarksOfStudent);
	}

	public static void getAvgMarksOfStudents(List<Student> students) {
		// TODO Auto-generated method stub
		double avgMarksOfAllStudents = students.stream()
			.mapToDouble(Student::getMarks)
			.average()
			.orElse(0);
		System.out.println(avgMarksOfAllStudents);
	}

	public static void gettingPassAndFailStudents(List<Student> students) {
		// TODO Auto-generated method stub
		Map<Boolean, List<Student>> gettingPassAndFailStudents = students.stream()
			.collect(Collectors.partitioningBy(s -> s.getMarks() >= 50));
		System.out.println("Passing students");
		gettingPassAndFailStudents.get(true).forEach(System.out::println);
		System.out.println("Failing students");
		gettingPassAndFailStudents.get(false).forEach(System.out::println);
	}

	public static void getTop3Students(List<Student> students) {
		// TODO Auto-generated method stub
		List<Student> getTop3Students = students.stream()
			.sorted(Comparator.comparingDouble(Student::getMarks).reversed())
			.limit(3)
			.collect(Collectors.toList());
		for (Student student : getTop3Students) {
			System.out.println(student);
		}
	}

	public static void getSecondHeightByMarks(List<Student> students) {
		// TODO Auto-generated method stub
		Optional<Student> getSecondHeightest = students.stream()
			.sorted(Comparator.comparingDouble(Student::getMarks).reversed())
			.skip(1)
			.findFirst();
		System.out.println(getSecondHeightest);
	}

}
