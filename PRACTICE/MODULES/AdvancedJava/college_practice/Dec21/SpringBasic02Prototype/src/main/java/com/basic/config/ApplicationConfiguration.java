package com.basic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.basic.pojos.Users;

@Configuration
@ComponentScan(basePackages = {"com.basic.pojos"})
public class ApplicationConfiguration {
	
	@Bean
	@Scope(scopeName = "prototype")
	public Users user() {
		return new Users("hi", "bye");
	}
	
}
