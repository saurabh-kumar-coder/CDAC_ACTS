package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapping.entities.Categories;

public interface CategoryRepository extends JpaRepository<Categories, String> {

}
