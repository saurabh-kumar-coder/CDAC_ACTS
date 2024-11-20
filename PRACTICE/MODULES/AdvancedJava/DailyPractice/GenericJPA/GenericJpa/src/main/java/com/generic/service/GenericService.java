package com.generic.service;

import org.springframework.stereotype.Service;

import com.generic.entity.BaseEntity;

@Service
public interface GenericService<T extends BaseEntity> {

	T save(T entity);
	
	T findById(Long id);
	
	Iterable<T> findAll();
	
	void delete(Long id);

	T findByName(String name);
	
}
