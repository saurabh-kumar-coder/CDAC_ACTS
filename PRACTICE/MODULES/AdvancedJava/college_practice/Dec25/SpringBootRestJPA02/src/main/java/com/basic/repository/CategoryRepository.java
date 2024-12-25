package com.basic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.basic.pojos.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
