package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.hibernate.pojos.Users;

@SpringBootApplication
@EntityScan(basePackages = {"com.hibernate.pojos"})
public class SpringBootHibernate02Application implements CommandLineRunner {

	@Autowired
	SessionFactory hibernateFactory;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernate02Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		try(Session hibernateSession = hibernateFactory.openSession();)
		{
			Users users = (Users)hibernateSession.get(Users.class, 1);
			System.out.println("users : " + users.toString());
		}
	}

}
