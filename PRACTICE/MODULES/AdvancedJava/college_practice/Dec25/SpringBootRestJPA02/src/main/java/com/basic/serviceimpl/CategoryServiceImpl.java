package com.basic.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.dto.CategoryDTO;
import com.basic.pojos.Category;
import com.basic.repository.CategoryRepository;
import com.basic.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public boolean addCategory(CategoryDTO category) {
		// TODO Auto-generated method stub
		Category categoryEntity = new Category();
		BeanUtils.copyProperties(category, categoryEntity);
		categoryRepository.save(categoryEntity);
		return true;
	}

	@Override
	public List<CategoryDTO> findAllCategory() {
		// TODO Auto-generated method stub
		Iterator<Category> categoryList = categoryRepository.findAll().iterator();
		List<CategoryDTO> categoryDTOList = new ArrayList<CategoryDTO>();
		while(categoryList.hasNext()) {
			Category dCategory = categoryList.next();
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(dCategory, dto);
			categoryDTOList.add(dto);
		}
		return categoryDTOList;
	}

	@Override
	public CategoryDTO findCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		Optional<Category> category = categoryRepository.findById(categoryId);
		if(category.isPresent())
		{
			Category entityCategory = category.get();
			CategoryDTO cat = new CategoryDTO();
			BeanUtils.copyProperties(entityCategory, cat);
			return cat;
		}
		return null;
	}

	@Override
	public List<CategoryDTO> findCategoryNameLike(String inputValue) {
		// TODO Auto-generated method stub
		List<Category> categoryNameLike = categoryRepository.findCategoryNameLike(inputValue);
		ArrayList<CategoryDTO> categoryDTOList = new ArrayList<CategoryDTO>();
		for(Category eCategory : categoryNameLike) {
			CategoryDTO cDTO = new CategoryDTO();
			BeanUtils.copyProperties(eCategory, cDTO);
			categoryDTOList.add(cDTO);
		}
		return categoryDTOList;
	}
	
	

}
