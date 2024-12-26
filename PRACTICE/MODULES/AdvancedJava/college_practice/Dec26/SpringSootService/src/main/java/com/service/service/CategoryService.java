package com.service.service;

import java.util.List;

import com.service.dto.CategoryDTO;

public interface CategoryService {

	public List<CategoryDTO> findAllCategories(int pageNo, int pageSize);
	
	public CategoryDTO findCategoryById(int categoryId);
	
}
