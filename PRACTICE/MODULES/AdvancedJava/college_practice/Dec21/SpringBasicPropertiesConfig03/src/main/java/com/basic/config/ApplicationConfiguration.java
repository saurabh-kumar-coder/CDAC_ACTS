package com.basic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.basic.pojos.Users;

@Configuration
//@ComponentScan(basePackages = {"com.basic.pojos"})
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {
	@Bean
	public Users objUser(@Value("${data.username}")String username, @Value("${data.password}") String password) {
		System.out.println(username + " -> " + password);
		return new Users(username, password);
	}
}
