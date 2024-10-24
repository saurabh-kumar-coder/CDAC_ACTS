package com.lcwd.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.user.service.entity.User;

// 	to perform database related operation are available on JpaRepository
//	in JpaRepository we have to share entity type and primary key of the entity
public interface UserRepository extends JpaRepository<User, String> {
//	we can implement any custom query
}
