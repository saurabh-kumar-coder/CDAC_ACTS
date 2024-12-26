package com.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.service.dto.CategoryDTO;
import com.service.pojos.Category;
import com.service.repository.CategoryRepository;
import com.service.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<CategoryDTO> findAllCategories(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Pageable page = PageRequest.of(pageNo, pageSize);
		Page<Category> currentCategoryPageData = categoryRepository.findAll(page);
		ArrayList<CategoryDTO> currentCategoryDTOPageData = new ArrayList<CategoryDTO>();
		for(Category eCategory : currentCategoryPageData) {
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(eCategory, dto);
			currentCategoryDTOPageData.add(dto);
		}
		return currentCategoryDTOPageData;
	}

	@Override
	public CategoryDTO findCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		Optional<Category> categoryById = categoryRepository.findById(categoryId);
		if(categoryById.isPresent()) {
			Category categoryEntity = categoryById.get();
			CategoryDTO dto = new CategoryDTO();
			BeanUtils.copyProperties(categoryEntity, dto);
			return dto;
		}
		return null;
	}

}
