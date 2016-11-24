package com.dao;

import static org.junit.Assert.fail;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.domain.LockBean;

public class LockMapperTest {

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
	public void testSaveLock() {
		LockMapper lm = session.getMapper(LockMapper.class);
		LockBean lock = new LockBean(null, "lock1", null);
		lm.saveLock(lock);
	}

	@Test
	public void testFindLockAndKeys() {
		LockMapper lm = session.getMapper(LockMapper.class);
		LockBean lock = lm.findLockAndKeys(1);
		System.out.println(lock);
	}

}
