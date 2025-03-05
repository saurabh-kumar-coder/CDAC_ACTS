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

	public static void mapIdAndCourseCount(List<Student> students) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> mapIdAndCourseCount = students.stream()
			.collect(Collectors.toMap(Student::getId, s -> s.getCourses().size()));
		mapIdAndCourseCount.entrySet().stream()
			.forEach(System.out::println);
	}

	public static void mapStudentsWithHightestMarksInEachCity(List<Student> students) {
		// TODO Auto-generated method stub
		Map<String, Student> mapStudentsWithHightestMarksInEachCity = students.stream()
			.collect(Collectors.toMap(Student::getCity, 
										student -> student, 
										(existing, replacement) -> existing.getMarks() > replacement.getMarks() ? existing : replacement));
		mapStudentsWithHightestMarksInEachCity.entrySet().stream()
			.forEach(entry -> System.out.println(entry.getKey() + entry.getValue()));
	}

	public static void mapStudentToMap(List<Student> students) {
		// TODO Auto-generated method stub
		Map<String, List<String>> mapStudents = students.stream()
			.collect(Collectors.toMap(Student::getName, Student::getCourses));
		mapStudents.entrySet().stream()
			.forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
	}

	public static void mapCityWithMostStudents(List<Student> students) {
		// TODO Auto-generated method stub
		String mostPopulatedCity = students.stream()
			.collect(Collectors.groupingBy(Student::getCity, Collectors.counting()))
			.entrySet()
			.stream()
			.max(Map.Entry.comparingByValue())
			.map(Map.Entry::getKey)
			.orElse("No String Available");
		System.out.println(mostPopulatedCity);
	}

	public static void mapStudentWithScore(List<Student> students) {
		// TODO Auto-generated method stub
		Map<String, Double> mapStudentWithScore = students.stream()
			.collect(Collectors.groupingBy(Student::getCity, Collectors.averagingDouble(Student::getMarks)));
		mapStudentWithScore.forEach((a,b) -> System.out.println(a + " -> " + b));
	}
}
