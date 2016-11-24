package com.dao;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;
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
	UserDao userDao = null;

	@Before
	public void setUp() throws Exception {

		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		session = sqlSessionFactory.openSession();
		userDao = (UserDao) session.getMapper(UserDao.class);

	}

	@After
	public void tearDown() throws Exception {
		session.commit();
		session.close();
	}

	@Test
	public void testInsert() {
		User user = new User(2, "user2");
		userDao.insert(user);
	}

	@Test
	public void testDelete() {
		userDao.delete(2);
	}

	@Test
	public void testUpdate() {
		User user = new User(1, "update");
		userDao.update(user);
	}

	@Test
	public void testSelectById() {

		User user = userDao.selectById(1);
		assertEquals(user.getName(), "update");
	}

	@Test
	public void testList() {
		List<User> user = userDao.list();
		assertEquals(1, user.size());
	}

}
