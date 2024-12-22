package com.basic.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.basic.dao.UsersDao;
import com.basic.daoImpl.UsersDaoImpl;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {
	
	@Autowired
	Environment env;
	
	@Bean
	public DataSource dataSource() {
		String driver = env.getProperty("db.connection.driverclass");
		String url = env.getProperty("db.connection.url");
		String username = env.getProperty("db.connection.username");
		String password = env.getProperty("db.connection.password");
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		ds.setPassword(password);
		
		return ds;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public UsersDao usersDao() {
		return new UsersDaoImpl();
	}
}
