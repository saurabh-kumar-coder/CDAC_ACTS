package com.service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.dto.CategoryDTO;
import com.service.service.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
//	http://localhost:8080/category/2
	@GetMapping("/{categoryId}")
	public CategoryDTO findCategoryById(@PathVariable(name = "categoryId") int categoryId) {
		return categoryService.findCategoryById(categoryId);
	}
	
//	http://localhost:8080/category?pageNo=3&pageSize=5
	@GetMapping
	public List<CategoryDTO> findAllCategory(@RequestParam(name = "pageNo") int pageNo, @RequestParam(name = "pageSize")int pageSize){
		return categoryService.findAllCategories(pageNo, pageSize);
	}
	
}
