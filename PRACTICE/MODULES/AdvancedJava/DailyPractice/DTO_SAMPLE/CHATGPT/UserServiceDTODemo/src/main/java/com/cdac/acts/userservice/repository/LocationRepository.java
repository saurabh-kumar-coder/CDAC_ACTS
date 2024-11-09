package com.cdac.acts.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdac.acts.userservice.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Long>{

}
