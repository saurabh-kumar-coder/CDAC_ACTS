package com.canteen.server.service;

import org.springframework.stereotype.Service;

import com.canteen.server.entity.BaseEntity;

@Service
public interface BaseService<T extends BaseEntity<ID>, ID> {
	
	T save(T entity);
	
	T findById(ID id);
	
	Iterable<T> findAll();
	
	void delete(ID id);
	
}
