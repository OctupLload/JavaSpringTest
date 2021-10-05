package com.springtest.dao;

import java.util.List;

import com.springtest.entity.User;

public interface UserDao {
	
	List<User> findAll();
	
}
