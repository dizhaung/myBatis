package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.domain.User;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;

	public User getById(int id) {
		// TODO Auto-generated method stub
		return userDao.getById(id);
	}

}
