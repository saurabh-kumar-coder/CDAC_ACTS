package com.annotations;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.annotations.pojos.Users;

public class App {
	public static void main(String[] args) {

		Configuration hibernateConfiguration = new Configuration();
		hibernateConfiguration.configure("first.cfg.xml");

		try (SessionFactory hibernateFactory = hibernateConfiguration.buildSessionFactory();
				Session hibernateSession = hibernateFactory.openSession()) {
			Users userObj = hibernateSession.get(Users.class, 5);

			System.out.println(userObj.toString());
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
