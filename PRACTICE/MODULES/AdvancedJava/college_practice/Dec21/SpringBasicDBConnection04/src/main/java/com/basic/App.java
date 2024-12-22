package com.basic;

import java.util.Iterator;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.basic.config.ApplicationConfiguration;
import com.basic.dao.UsersDao;
import com.basic.pojos.Users;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
				Scanner sc = new Scanner(System.in)) {
        	UsersDao dao = (UsersDao)applicationContext.getBean("usersDao");
//        	registerUser(dao, sc);
//        	changePassword(dao, sc);
        	findAllUsers(dao);
        }
        
        
    }

	private static void findAllUsers(UsersDao dao) {
		// TODO Auto-generated method stub
		Iterator<Users> listUser = dao.findAllUsers();
		while(listUser.hasNext()) {
			Users usr = listUser.next();
			System.out.println(usr);
		}
	}

	private static void changePassword(UsersDao dao, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("enter username");
		String username = sc.nextLine();
		System.out.println("enter password");
		String password = sc.nextLine();
		dao.changePassword(username, password);
	}

	private static void registerUser(UsersDao dao, Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("enter username");
		String username = sc.nextLine();
		System.out.println("enter password");
		String password = sc.nextLine();
		System.out.println("enter mobile");
		int mobile = sc.nextInt();
		sc.nextLine();
		System.out.println("enter firstName");
		String firstName = sc.nextLine();
		System.out.println("enter lastName");
		String lastName = sc.nextLine();
		System.out.println("enter email");
		String email = sc.nextLine();
		dao.registerUser(username, password, mobile, firstName, lastName, email);
	}
}
