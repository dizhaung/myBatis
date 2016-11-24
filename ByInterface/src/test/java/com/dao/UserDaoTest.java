package com.dao;

import static org.junit.Assert.assertEquals;

import java.io.InputStream;

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
		session.close();
	}

	@Test
	public void testSelectUserById() {
		UserDao userDao = (UserDao) session.getMapper(UserDao.class);
		User user = userDao.selectUserByID(1);
		assertEquals(user.getName(), "update");
	}

}
