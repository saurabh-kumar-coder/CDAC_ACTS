package com.hibernateProperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateProperties.pojos.Users;

public class App {
	public static void main(String[] args) {
		Configuration hibernateConfiguration = new Configuration();

		try {
			Properties configProperties = new Properties();
			configProperties.load(new FileInputStream("application.properties.txt"));

			hibernateConfiguration.addProperties(configProperties);

			hibernateConfiguration.addAnnotatedClass(Users.class);

			try (SessionFactory hibernateFactory = hibernateConfiguration.buildSessionFactory();
					Session hibernateSession = hibernateFactory.openSession()) {
				Users userObj = hibernateSession.get(Users.class, 1);

				System.out.println(userObj.toString());
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
