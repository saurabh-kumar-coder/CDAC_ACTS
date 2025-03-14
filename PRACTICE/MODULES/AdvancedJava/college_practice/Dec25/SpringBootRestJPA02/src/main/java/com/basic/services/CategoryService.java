package com.basic.services;

import java.util.List;

import com.basic.dto.CategoryDTO;

public interface CategoryService {
	public boolean addCategory(CategoryDTO category);
	
	public List<CategoryDTO> findAllCategory();
	
	public CategoryDTO findCategoryById(int categoryId);
	
	public List<CategoryDTO> findCategoryNameLike(String inputValue);
	
	public CategoryDTO findByCategoryName(String categoryName);
}
