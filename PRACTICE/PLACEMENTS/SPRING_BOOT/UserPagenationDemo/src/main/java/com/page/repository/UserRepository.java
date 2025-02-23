package com.page.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.page.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
