package com.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.mvc.controllers"})
@EntityScan(basePackages = {"com.mvc.pojos"})
public class SpringBootMvcHibernate03Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcHibernate03Application.class, args);
	}

}
