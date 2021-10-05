package com.springtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtest.dao.UserDao;
import com.springtest.entity.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	public UserDao userDao;
	
	public List<User> findAll() {
		return userDao.findAll();
	}
	
}
