package com.saurabh.data;
import com.saurabh.pojo.Student;
import java.util.Map;
import java.util.HashMap;
public class StudentData {
	public static Map<Student, Student> getStudentData() {
		Map<Student, Student> studentData = new HashMap<>();
		studentData.put(new Student(1, 10, "A"), new Student(1, 10, "A", "Alice"));
		studentData.put(new Student(2, 10, "B"), new Student(2, 10, "B", "Bob"));
		studentData.put(new Student(3, 11, "A"), new Student(3, 11, "A", "Charlie"));
		studentData.put(new Student(4, 11, "B"), new Student(4, 11, "B", "David"));
		studentData.put(new Student(3, 11, "B"), new Student(3, 11, "B", "Charlie"));
		studentData.put(new Student(1, 10, "A"), new Student(1, 10, "A", "Alice"));
		studentData.put(new Student(2, 10, "B"), new Student(2, 10, "B", "Bob"));
		return studentData;
	}
}