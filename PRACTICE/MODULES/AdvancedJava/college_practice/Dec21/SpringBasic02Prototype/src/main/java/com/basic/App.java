package com.basic;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.basic.config.ApplicationConfiguration;
import com.basic.pojos.Users;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class)) {
			Users user = (Users)applicationContext.getBean(Users.class);
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
			System.out.println("user : " + user.hashCode());
			Users user1 = (Users)applicationContext.getBean(Users.class);
			System.out.println(user1.getUsername());
			System.out.println(user1.getPassword());
			System.out.println("user : " + user1.hashCode());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
