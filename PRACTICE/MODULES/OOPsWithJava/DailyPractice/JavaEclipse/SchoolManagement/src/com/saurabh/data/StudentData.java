package com.saurabh.data;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.saurabh.pojo.Student;
import com.saurabh.pojo.StudentKey;

public class StudentData {
	public static Map<StudentKey, Student> getStudentData() {
		Map<StudentKey, Student> studentData = new HashMap<>();
		studentData.put(new StudentKey(1, "A", "1"), new Student(1, "A", "1", "AA", LocalDate.now()));
		studentData.put(new StudentKey(6, "H", "5"), new Student(6, "H", "5", "VA", LocalDate.now()));
		studentData.put(new StudentKey(2, "S", "7"), new Student(2, "S", "7", "DA", LocalDate.now()));
		studentData.put(new StudentKey(4, "C", "9"), new Student(4, "C", "9", "MA", LocalDate.now()));
		return studentData;
	}
}
