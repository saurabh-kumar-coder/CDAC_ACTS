package com.shop.init;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shop.pojos.Category;
import com.shop.pojos.Users;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * Servlet implementation class InitializeHibernate
 */
@WebServlet(loadOnStartup = 1, urlPatterns = {"/InitializeHiber"})
public class InitializeHibernate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		Configuration hibernateConfiguration = new Configuration();
		Properties hibernateProperties = new Properties();
		InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties");
        try {
			if (input == null) {
			    throw new FileNotFoundException("application.properties not found in classpath");
			}
			hibernateProperties.load(input);
			hibernateConfiguration.setProperties(hibernateProperties);
//			addAnnotatedClass
			hibernateConfiguration.addAnnotatedClass(Users.class);
			hibernateConfiguration.addAnnotatedClass(Category.class);
			SessionFactory hibernateFactory = hibernateConfiguration.buildSessionFactory();
			ServletContext application = getServletContext();
			application.setAttribute("hibernateFactory", hibernateFactory);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
