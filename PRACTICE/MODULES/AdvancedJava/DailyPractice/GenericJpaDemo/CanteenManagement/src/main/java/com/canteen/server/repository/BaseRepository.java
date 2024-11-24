package com.canteen.server.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.canteen.server.entity.BaseEntity;

public interface BaseRepository<T extends BaseEntity<ID>, ID> extends JpaRepository<T, ID> {

	@Query("SELECT e FROM #{entityName} WHERE e.username :username AND e.password :password")
	T findByUsernameAndPassword(@Param("username")T username, @Param("password")T password);
	
	@Query("SELECT e FROM #{entityName} WHERE (e.username :username OR e.mobileno) AND e.password")
	T findByUsernameORMobilenoAndPassword(@Param("username")T username, @Param("mobile")T mobileno, @Param("password")T password);
	
	@Query("SELECT e FROM #{entityName} WHERE e.userId BETWEEN :start AND :end")
	Page<T> pagination(@Param("start")ID start, @Param("end")ID end, Pageable pageable);
}
