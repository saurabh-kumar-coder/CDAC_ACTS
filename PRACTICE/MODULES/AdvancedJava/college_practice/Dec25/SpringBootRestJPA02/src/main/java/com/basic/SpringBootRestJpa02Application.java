package com.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.basic.controllers", "com.basic.serviceimpl"})
@EntityScan(basePackages = {"com.basic.pojos"})
@EnableJpaRepositories(basePackages = {"com.basic.repository"})
public class SpringBootRestJpa02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestJpa02Application.class, args);
	}

}
