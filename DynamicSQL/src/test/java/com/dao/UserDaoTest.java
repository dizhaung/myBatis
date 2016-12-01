package com.dao;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.domain.User;

public class UserDaoTest {

	SqlSession session = null;

	@Before
	public void setUp() throws Exception {

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		session = sqlSessionFactory.openSession();

	}

	@After
	public void tearDown() throws Exception {
		session.commit();
		session.close();
	}

	@Test
	public void testSelectUserById() {
		UserDao userDao = (UserDao) session.getMapper(UserDao.class);
		User user = userDao.selectUserByID(1);
		assertEquals(user.getName(), "update");
	}

	@Test
	public void testSelectUser() {
		UserDao userDao = (UserDao) session.getMapper(UserDao.class);
		User u = new User();
		// u.setId(0);
		u.setName("user");
		User user = userDao.selectUser(u);
		System.out.println(user);
	}

	@Test
	public void testSelectUser1() {
		UserDao userDao = (UserDao) session.getMapper(UserDao.class);
		User u = new User();
		// u.setId(1);
		// u.setName("user2");
		User user = userDao.selectUser1(u);
		System.out.println(user);
	}

	@Test
	public void testBatchSaveUsers() {
		UserDao userDao = (UserDao) session.getMapper(UserDao.class);
		User u1 = new User();
		User u2 = new User();
		List<User> users = new ArrayList<User>();
		users.add(u1);
		users.add(u2);
		userDao.batchSaveUsers(users);
	}

}
