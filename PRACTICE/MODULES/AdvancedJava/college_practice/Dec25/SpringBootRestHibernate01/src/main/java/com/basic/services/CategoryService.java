package com.basic.services;

import java.util.List;

import com.basic.dto.CategoryDTO;

public interface CategoryService {
	
//	add category
	public boolean addCategory(CategoryDTO category);
	
//	find category by id
	public CategoryDTO findByCategoryId(int categoryId);
	
//	get all categories
	public List<CategoryDTO> findAllCategories();
	
}
