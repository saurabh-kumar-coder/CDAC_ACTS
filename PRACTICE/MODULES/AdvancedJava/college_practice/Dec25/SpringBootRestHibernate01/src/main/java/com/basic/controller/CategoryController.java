package com.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.dto.CategoryDTO;
import com.basic.services.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@PostMapping()
	public boolean addCategory(@RequestBody CategoryDTO category) {
		return categoryService.addCategory(category);
	}
	
	@GetMapping()
	public List<CategoryDTO> findAllCategory(){
		return categoryService.findAllCategories();
	}
	
	@GetMapping("/{categoryId}")
	public CategoryDTO findCategoryById(@PathVariable("categoryId") int categoryId) {
		return categoryService.findByCategoryId(categoryId);
	}
	
}
