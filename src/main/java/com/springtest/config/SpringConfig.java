package com.springtest.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.springtest.dao.UserDao;
import com.springtest.dao.UserDaoImpl;
import com.springtest.service.UserService;
import com.springtest.service.UserServiceImpl;

@Configuration
public class SpringConfig {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/demodb?userSsl=false");
		dataSource.setUsername("root");
		dataSource.setPassword("12345");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
	
	@Bean
	public UserDao getUserDao() {
		return new UserDaoImpl(getJdbcTemplate());
	}
	
	@Bean
	public UserService getUserService() {
		return new UserServiceImpl();
	}
}
