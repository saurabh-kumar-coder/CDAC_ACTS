package com.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.basic.pojos.Users;

@Configuration
@ComponentScan(basePackages = {"com.basic.pojos"})
public class ApplicationConfiguration {
	
	@Bean
	public Users objUser() {
		return new Users("Saurabh", "Kumar");
	}
	
}
