package com.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.service.serviceimpl", "com.service.controllers"})
@EntityScan(basePackages = {"com.service.pojos"})
@EnableJpaRepositories(basePackages = {"com.service.repository"})
public class SpringSootServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSootServiceApplication.class, args);
	}

}
