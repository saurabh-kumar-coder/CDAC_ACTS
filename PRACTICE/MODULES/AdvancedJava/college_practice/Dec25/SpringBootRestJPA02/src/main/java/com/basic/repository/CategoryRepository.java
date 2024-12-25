package com.basic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.basic.pojos.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
	@Query("SELECT objCategory FROM Category objCategory WHERE objCategory.categoryName LIKE :inputValue%")
	public List<Category> findCategoryNameLike(@Param("inputValue") String inputValue);
	
}
