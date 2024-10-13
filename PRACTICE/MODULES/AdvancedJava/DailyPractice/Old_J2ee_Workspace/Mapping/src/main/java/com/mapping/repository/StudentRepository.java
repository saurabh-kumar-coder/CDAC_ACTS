package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
