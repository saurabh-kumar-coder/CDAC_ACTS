package com.basic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.basic.config.ApplicationConfiguration;
import com.basic.pojos.Users;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
//    	** configuration class need to be passed in the AnnotationConfigApplicationContext() ctor.
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);
		Users user = (Users) applicationContext.getBean("objUser");
		Users user1 = applicationContext.getBean(Users.class);

//    	setting username for a particular user
		user.setUsername("Ramu");

//    	printing user and user1 data
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user1.getUsername());
		System.out.println(user1.getPassword());

//    	getting hashcode for the references.
		System.out.println(user.hashCode());
		System.out.println(user1.hashCode());
	}
}
