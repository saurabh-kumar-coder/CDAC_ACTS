package com.basic.servicesimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic.dto.CategoryDTO;
import com.basic.pojos.Category;
import com.basic.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	SessionFactory hibernateFactory;
	
	@Override
	public boolean addCategory(CategoryDTO category) {
		// TODO Auto-generated method stub
		Category entityCategory = new Category();
		BeanUtils.copyProperties(category, entityCategory);
		try(Session hibernateSession = hibernateFactory.openSession()){
			hibernateSession.beginTransaction();
			hibernateSession.persist(entityCategory);
			hibernateSession.getTransaction().commit();
		}
		return true;
	}

	@Override
	public CategoryDTO findByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		CategoryDTO categoryDto = new CategoryDTO();
		try(Session hibernateSession = hibernateFactory.openSession()){
			Category entityCategory = hibernateSession.get(Category.class, categoryId);
			BeanUtils.copyProperties(entityCategory, categoryDto);
		}
		return categoryDto;
	}

	@Override
	public List<CategoryDTO> findAllCategories() {
		// TODO Auto-generated method stub
		List<CategoryDTO> categoryDtoList = new ArrayList<CategoryDTO>();
		try(Session hibernateSession = hibernateFactory.openSession()){
			List<Category> categoryList = hibernateSession.createQuery("from Category", Category.class).list();
			categoryList.forEach(category -> {
				CategoryDTO categoryDto = new CategoryDTO();
				BeanUtils.copyProperties(category, categoryDto);
				categoryDtoList.add(categoryDto);
			});
		}
		return categoryDtoList;
	}

}
