package com.shopwise.startup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shopwise.pojos.Users;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(loadOnStartup = 1, urlPatterns = { "/InitializeHibernate" })
public class InitializeHibernate extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);

		Configuration hibernateConfiguration = new Configuration();

		Properties configProperties = new Properties();
		configProperties.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		configProperties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/advjava");
		configProperties.setProperty("hibernate.connection.username", "root");
		configProperties.setProperty("hibernate.connection.password", "tiger");
		configProperties.setProperty("hibernate.show_sql","true");
		configProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		
		hibernateConfiguration.addProperties(configProperties);

		hibernateConfiguration.addAnnotatedClass(Users.class);

		SessionFactory hibernateFactory = hibernateConfiguration.buildSessionFactory();
		ServletContext application = getServletContext();
		application.setAttribute("hibernateFactory", hibernateFactory);

	}

}
