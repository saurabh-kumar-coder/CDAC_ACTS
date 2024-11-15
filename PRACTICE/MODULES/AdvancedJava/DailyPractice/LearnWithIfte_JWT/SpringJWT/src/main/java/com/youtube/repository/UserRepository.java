package com.youtube.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findByUsername(String username);
}
