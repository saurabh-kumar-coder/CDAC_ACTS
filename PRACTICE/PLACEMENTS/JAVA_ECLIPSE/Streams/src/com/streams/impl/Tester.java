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
//		ListMethods.sortMarksInDescending(students);

//		03. Get a list of student names who have an attendance percentage greater than 85%.
//		ListMethods.listOfStudentsWithAttendanceMoreThan85Percent(students);
		
//		04. Convert all student names to uppercase and collect them into a List<String>.
//		ListMethods.studentsNameToUpperCase(students);
		
//		05. Extract a list of unique courses taken by all students (flatMap).
//		ListMethods.getAllUniqueCoursesTakenByStudents(students);
		
//		06. Find the student with the highest marks using max() and return an Optional<Student>.
//		ListMethods.studentWithHighestMarks(students);
		
//		07. Find the average marks of all students.
//		ListMethods.getAvgMarksOfStudents(students);
		
//		08. Partition students into two lists: pass (marks ≥ 50) and 
//		fail (marks < 50) using partitioningBy().
//		ListMethods.gettingPassAndFailStudents(students);
		
//		09. Find the first 3 students in the sorted list (top 3 students by marks).
//		ListMethods.getTop3Students(students);
		
//		10. Get the second-highest scoring student (skip the first one, then take the next).
//		ListMethods.getSecondHeightByMarks(students);
		
//		--------------------------------------------------------------------------------------
		
//		11. Convert the student list into a HashMap with ID as key and Student object as value.
//		MapMethods.convertListToMap(students);
		
//		12. Convert the student list into a HashMap with name as key and marks as value.
//		MapMethods.convertListToMapNameMarks(students);
		
//		13. Group students by their grade and store them in a HashMap<Character, List<Student>>.
//		MapMethods.groupByGradeAndStore(students);
		
//		14. Group students by their city using Collectors.groupingBy().
//		MapMethods.groupByCity(students);
		
//		15. Create a Map where the key is the enrollment year and the value is the count of students who enrolled that year.
//		MapMethods.mapYearAndCountOfStudents(students);
		
//		16. Convert the student list into a HashMap where the key is the student ID and the value is their total courses enrolled.
//		MapMethods.mapIdAndCourseCount(students);
		
//		17. Find the student with the highest marks in each city and store it in a HashMap<String, Student>.
//		MapMethods.mapStudentsWithHightestMarksInEachCity(students);
		
//		18. Convert the student list into a Map with student names as keys and their courses as values (using Collectors.toMap()).
//		MapMethods.mapStudentToMap(students);
		
//		19. Find the city with the most students.
//		MapMethods.mapCityWithMostStudents(students);
		
//		20. Find the average marks per city and store them in a Map<String, Double>.
//		MapMethods.mapStudentWithScore(students);
//		--------------------------------------------------------------------------------------
	}
}
