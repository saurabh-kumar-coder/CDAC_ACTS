package com.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.pojos.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
