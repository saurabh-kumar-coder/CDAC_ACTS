package com.basic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.basic.dto.CategoryDTO;
import com.basic.services.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@PostMapping
	public boolean addCategory(@RequestBody CategoryDTO category) {
		return categoryService.addCategory(category);
	}

	@GetMapping
	public List<CategoryDTO> findAllCategory() {
		return categoryService.findAllCategory();
	}
	
	@GetMapping("/{categoryId}")
	public CategoryDTO findCategoryById(@PathVariable("categoryId") int categoryId) {
		return categoryService.findCategoryById(categoryId);
	}

	@GetMapping("/search")
	public List<CategoryDTO> findCategoryNameLike(@RequestParam String inputValue){
		return categoryService.findCategoryNameLike(inputValue);
	}
	
	@GetMapping("/name/{categoryName}")
	public CategoryDTO findCategoryByCategoryName(@PathVariable("categoryName") String categoryName) {
		return categoryService.findByCategoryName(categoryName);
	}
	
}
