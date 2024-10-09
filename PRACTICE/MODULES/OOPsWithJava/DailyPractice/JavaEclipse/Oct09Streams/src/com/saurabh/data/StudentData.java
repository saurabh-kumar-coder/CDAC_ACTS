package com.saurabh.data;

import java.util.ArrayList;
import java.util.List;

import com.saurabh.pojo.Address;
import com.saurabh.pojo.Student;

public class StudentData {
	public static List<Student> getStudent(){
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "ABC", 45.5, new Address("DCF", "HUF", "233445")));
		studentList.add(new Student(5, "BHAI", 90.6, new Address("ZXEEL", "LOC", "563482")));
		studentList.add(new Student(6, "PLATA", 67.0, new Address("PEEL", "SDCVSNJ", "289472")));
		studentList.add(new Student(3, "XSD", 23.5, new Address("BIRD", "PAODSA", "847645")));
		studentList.add(new Student(2, "YATS", 78.05, new Address("LOCAL", "PAODSA", "128473")));
		studentList.add(new Student(7, "LPSS", 75.0, new Address("MCISD", "CSDBU", "093473")));		studentList.add(new Student(1, "ABC", 45.5, new Address("DCF", "HUF", "233445")));
		studentList.add(new Student(9, "KPM", 87.5, new Address("DPDIZ", "PAODSA", "984736")));
		studentList.add(new Student(4, "BHD", 55.5, new Address("LAOCN", "PDOS", "635272")));
		return studentList;
	}
}
