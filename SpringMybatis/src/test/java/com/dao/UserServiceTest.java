package com.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domain.User;
import com.service.UserService;
import com.service.impl.UserServiceImpl;

public class UserServiceTest {

	private ApplicationContext applicationContext = null;
	private UserService userService;

	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("application.xml");
		userService = applicationContext.getBean(UserServiceImpl.class);

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetById() {
		User user = userService.getById(1);
		System.out.println(user);
	}

}
