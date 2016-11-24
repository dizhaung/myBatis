package com.dao;

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

import com.domain.KeyBean;
import com.domain.LockBean;

public class KeyMapperTest {

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
	public void testBatchSaveKeys() {
		LockMapper lm = session.getMapper(LockMapper.class);
		KeyMapper km = session.getMapper(KeyMapper.class);

		LockBean lock = lm.findLockById(1);
		List<KeyBean> keys = new ArrayList<KeyBean>();
		for (int i = 0; i < 5; i++) {
			KeyBean key = new KeyBean(null, "key" + i, lock);
			keys.add(key);
		}
		km.batchSaveKeys(keys);
	}

}
