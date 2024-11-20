package com.generic.serviceimpl;

import com.generic.entity.BaseEntity;
import com.generic.repository.GenericRepository;
import com.generic.service.GenericService;

public class GenericServiceImpl <T extends BaseEntity> implements GenericService<T> {

	private GenericRepository<T> genericRepository;
	
	@Override
	public T save(T entity) {
		// TODO Auto-generated method stub
		return genericRepository.save(entity);
	}

	@Override
	public T findById(Long id) {
		// TODO Auto-generated method stub
		return genericRepository.findById(id).orElse(null);
	}

	@Override
	public Iterable<T> findAll() {
		// TODO Auto-generated method stub
		return genericRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		genericRepository.deleteById(id);
	}

	@Override
	public T findByName(String name) {
		// TODO Auto-generated method stub
		return (T) genericRepository.findByName(name);
	}

}
