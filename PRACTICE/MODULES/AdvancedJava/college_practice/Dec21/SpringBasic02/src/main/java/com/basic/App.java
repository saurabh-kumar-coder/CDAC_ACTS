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
			Users user = (Users)applicationContext.getBean("objUser");
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}