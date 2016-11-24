package com.dao;

import com.domain.User;

public interface UserDao {

	public User selectUserByID(int id);
}
