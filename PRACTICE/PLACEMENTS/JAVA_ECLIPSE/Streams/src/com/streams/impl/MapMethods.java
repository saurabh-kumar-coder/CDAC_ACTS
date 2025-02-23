package com.streams.impl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.streams.entity.Student;

public class MapMethods {

	public static void convertListToMap(List<Student> students) {
		// TODO Auto-generated method stub
		Map<Integer, Student> listToMap = students.stream()
			.collect(Collectors.toMap(s -> s.getId(), s -> s));
		listToMap.entrySet().stream()
			.forEach(e -> System.out.println(e));
	}

	public static void convertListToMapNameMarks(List<Student> students) {
		// TODO Auto-generated method stub
		Map<String, Double> mapNameMarks = students.stream()
			.collect((Collectors.toMap(s -> s.getName(), s -> s.getMarks())));
		mapNameMarks.entrySet().stream()
			.forEach(s -> System.out.println(s));
	}

	public static void groupByGradeAndStore(List<Student> students) {
		// TODO Auto-generated method stub
		Map<Character, List<Student>> groupByGrade = students.stream()
			.collect(Collectors.groupingBy(Student::getGrade));
		groupByGrade.entrySet().stream()
			.forEach(System.out::println);
	}

	public static void groupByCity(List<Student> students) {
		// TODO Auto-generated method stub
		Map<String, List<Student>> groupByCity = students.stream()
			.collect(Collectors.groupingBy(Student::getCity));
		groupByCity.entrySet().stream()
			.forEach(System.out::println);
	}

	public static void mapYearAndCountOfStudents(List<Student> students) {
		// TODO Auto-generated method stub
		Map<Integer, Long> mapYearAndStudentCount = students.stream()
			.collect(Collectors.groupingBy(Student::getEnrollmentYear, Collectors.counting()));
		mapYearAndStudentCount.entrySet().stream()
			.forEach(System.out::println);
	}
}
