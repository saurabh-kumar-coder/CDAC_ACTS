package com.streams.data;

import java.util.Arrays;
import java.util.List;

import com.streams.entity.Student;

public class StudentData {
	public static List<Student> getStudents() {
		return Arrays.asList(
				new Student(1, "Alice", 20, "Female", 'A', 92.5, "New York", Arrays.asList("Math", "Physics"), 85.0, 2022),

				new Student(2, "Bob", 21, "Male", 'B', 78.0, "Los Angeles", Arrays.asList("Biology", "Chemistry"), 90.5, 2021),

				new Student(3, "Charlie", 19, "Male", 'A', 88.5, "Chicago", Arrays.asList("Math", "Computer Science"), 75.3, 2023),

				new Student(4, "David", 22, "Male", 'C', 45.0, "Houston", Arrays.asList("History", "Political Science"), 82.1, 2020),

				new Student(5, "Eva", 20, "Female", 'A', 95.2, "San Francisco", Arrays.asList("Math", "Physics", "Chemistry"), 95.0, 2022),

				new Student(6, "Frank", 23, "Male", 'B', 80.3, "Boston", Arrays.asList("Business", "Finance"), 78.8, 2019),

				new Student(7, "Grace", 21, "Female", 'A', 89.4, "Seattle", Arrays.asList("Computer Science", "Math"), 88.6, 2021));
	}
}
