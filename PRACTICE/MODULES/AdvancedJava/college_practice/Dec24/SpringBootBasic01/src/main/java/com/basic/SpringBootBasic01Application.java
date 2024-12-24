package com.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.basic.pojos.Users;

@SpringBootApplication(scanBasePackages = {"com.basic.pojos"})
public class SpringBootBasic01Application implements CommandLineRunner{

	@Autowired
	Users objUser;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasic01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		objUser.setUsername("kumar");
		objUser.setPassword("saurabh");
		System.out.println(objUser.getUsername());
		System.out.println(objUser.getPassword());
		
	}
	
	

}
