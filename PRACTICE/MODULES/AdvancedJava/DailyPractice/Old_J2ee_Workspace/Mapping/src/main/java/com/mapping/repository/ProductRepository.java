package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entities.Products;

public interface ProductRepository extends JpaRepository<Products, String>{

}
