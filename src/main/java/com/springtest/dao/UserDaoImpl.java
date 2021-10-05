package com.springtest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springtest.entity.User;
import com.springtest.mapper.UserMapper;

public class UserDaoImpl implements UserDao{
	
	public final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDaoImpl (JdbcTemplate jdbcTemplate) {;
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<User> findAll() {
		String sql = "SELECT * FROM user";
		return jdbcTemplate.query(sql, new UserMapper());
	}
}
