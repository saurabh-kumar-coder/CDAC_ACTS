package com.mapping.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.entities.Address;
import com.mapping.entities.Student;
import com.mapping.repository.StudentRepository;

@RestController
@RequestMapping("/oneToMany")
public class OneToMany {
	
	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/data")
	public String addData() {
		Student student = new Student();
		student.setStudentId(4);
		student.setStudentClass("12th");
		student.setStudentName("DEF");
		
		Address address1= new Address();
		address1.setAddressId(121);
		address1.setStreet("QU-101");
		address1.setCity("New Delhi");
		address1.setCountry("India");
		address1.setStudent(student);
		
		Address address2= new Address();
		address2.setAddressId(122);
		address2.setStreet("QU-102");
		address2.setCity("Jaipur");
		address2.setCountry("India");
		address2.setStudent(student);
		
		ArrayList<Address> al = new ArrayList<>();
		al.add(address1);
		al.add(address2);
		student.setAddressList(al);
		
		studentRepository.save(student); 
		return "one to many data is set";
	}
	
	@GetMapping("/data")
	public String getStudent(){
		Student student = studentRepository.findById(1).get();
		return student.getStudentName();
	}
}
