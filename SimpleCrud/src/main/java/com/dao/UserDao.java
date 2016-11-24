package com.dao;

import java.util.List;

import com.domain.User;

public interface UserDao {

	public void insert(User user);

	public void delete(int id);

	public void update(User user);

	public List<User> selectByIds(int[] ids);

	public User selectById(int id);

	public List<User> list();
}
