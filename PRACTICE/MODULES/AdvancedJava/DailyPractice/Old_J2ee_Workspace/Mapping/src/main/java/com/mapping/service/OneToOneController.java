package com.mapping.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.entities.Laptop;
import com.mapping.entities.Student;
import com.mapping.repository.StudentRepository;

@RestController
@RequestMapping("/oneToOne")
public class OneToOneController {

	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/data")
	public String addData() {
		Student student = new Student();
		student.setStudentId(2);
		student.setStudentClass("12th");
		student.setStudentName("ABC");
		
		Laptop laptop = new Laptop();
		laptop.setBrand("HP");
		laptop.setLaptopId(13);
		laptop.setModelNumber("1456SB");
		laptop.setStudent(student);
		
		student.setLaptop(laptop);
		studentRepository.save(student); 
		return "data is set";
	}
	
	@GetMapping("/data")
	public String getStudent(){
		Student student = studentRepository.findById(1).get();
		return student.getStudentName();
	}
}
