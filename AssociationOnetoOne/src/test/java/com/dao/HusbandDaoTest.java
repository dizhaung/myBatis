package com.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.domain.Husband;

public class HusbandDaoTest {

	SqlSession session = null;
	HusbandDao husbandDao = null;

	@Before
	public void setUp() throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		session = sqlSessionFactory.openSession();
		husbandDao = (HusbandDao) session.getMapper(HusbandDao.class);
	}

	@After
	public void tearDown() throws Exception {
		session.commit();
		session.close();
	}

	@Test
	public void testSelectHusbandAndWife() throws Exception {
		Husband husband = husbandDao.selectHusbandAndWife(1);
		System.out.println(husband);
	}

}
