package com.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("/add")
	public boolean addCategory(@RequestBody CategoryDTO category) {
		return categoryService.addCategory(category);
	}
	
}
