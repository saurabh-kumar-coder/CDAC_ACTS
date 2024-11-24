package com.canteen.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.canteen.server.entity.BaseEntity;
import com.canteen.server.exception.ResourceNotFoundException;
import com.canteen.server.repository.BaseRepository;
import com.canteen.server.service.BaseService;

public class BaseServiceImpl<T extends BaseEntity<ID>, ID> implements BaseService<T, ID> {

	@Autowired
	private BaseRepository<T, ID> baseRepository;

	@Override
	public T save(T entity) {
		// TODO Auto-generated method stub
		return baseRepository.save(entity);
	}

	@Override
	public T findById(ID id) {
		// TODO Auto-generated method stub
		return baseRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Resource not found at id : " + id));
	}

	@Override
	public Iterable<T> findAll() {
		// TODO Auto-generated method stub
		return baseRepository.findAll();
	}

	@Override
	public void delete(ID id) {
		// TODO Auto-generated method stub
		baseRepository.deleteById(id);
	}
}
