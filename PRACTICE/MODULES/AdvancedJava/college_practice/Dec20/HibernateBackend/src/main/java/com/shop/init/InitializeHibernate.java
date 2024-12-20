package com.shop.init;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.cfg.Configuration;

import jakarta.servlet.ServletConfig;
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
		Properties prop = new Properties();
		InputStream input = getClass().getClassLoader().getResourceAsStream("application.properties");
        try {
			if (input == null) {
			    throw new FileNotFoundException("application.properties not found in classpath");
			}
			prop.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
//			prop.load(new FileInputStream("application.properties"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
