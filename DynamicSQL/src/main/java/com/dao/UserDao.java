package com.dao;

import java.util.List;

import com.domain.User;

public interface UserDao {

	public User selectUserByID(int id);

	public User selectUser(User user);
	
	public User selectUser1(User user);
	
	public void batchSaveUsers(List<User> users);
}
