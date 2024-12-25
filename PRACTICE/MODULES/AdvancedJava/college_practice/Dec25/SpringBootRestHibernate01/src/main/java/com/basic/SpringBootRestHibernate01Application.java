package com.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages = {"com.basic.controller", "com.basic.servicesimpl"})
@EntityScan(basePackages = {"com.basic.pojos"})
public class SpringBootRestHibernate01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestHibernate01Application.class, args);
	}

}
