package com.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojos.Users;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration hibernateConfiguration = new Configuration();
        hibernateConfiguration.configure("first.cfg.xml");
        
        try (SessionFactory hibernateFactory = hibernateConfiguration.buildSessionFactory();
				Session hibernateSession = hibernateFactory.openSession()) {
			getData(hibernateSession);
			
//			putData(hibernateSession);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
    }

	private static void putData(Session hibernateSession) {
		Users userObj = new Users(5, "b", "b", "bfname", "blname", 9999, "b@b.com");
        
        Transaction tx = hibernateSession.beginTransaction();
        hibernateSession.persist(userObj);
        tx.commit();
	}

	private static void getData(Session hibernateSession) {
		Users userObj = hibernateSession.get(Users.class, 5);
        
        System.out.println(userObj.toString());
	}
}








