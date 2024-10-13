package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entities.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer>{

}
