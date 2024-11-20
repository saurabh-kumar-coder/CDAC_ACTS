package com.generic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.generic.entity.BaseEntity;

public interface GenericRepository<T extends BaseEntity> extends JpaRepository<T, Long> {

	@Query("SELECT e FROM #{entityName} e WHERE e.name = :name")
	List<T> findByName(@Param("name") String name);
	
}
