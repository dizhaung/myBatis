package com.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.domain.CatBean;
import com.domain.DogBean;
import com.domain.PetBean;

public class PetMapperTest {

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
	public void testSaveCat() {
		PetMapper pm = session.getMapper(PetMapper.class);
		CatBean cat = new CatBean(null, "cat1");
		cat.setFish(10);
		pm.saveCat(cat);
	}

	@Test
	public void testSaveDog() {
		PetMapper pm = session.getMapper(PetMapper.class);
		DogBean dog = new DogBean(null, "dog1");
		dog.setBone(10);
		pm.saveDog(dog);
	}

	@Test
	public void testFindAllPet() {
		PetMapper pm = session.getMapper(PetMapper.class);
		List<PetBean> pets = pm.findAllPet();
		for (PetBean petBean : pets) {
			System.out.println(petBean);
		}
	}

	@Test
	public void testFindAllCat() {
		PetMapper pm = session.getMapper(PetMapper.class);
		List<CatBean> cats = pm.findAllCat();
		for (CatBean catBean : cats) {
			System.out.println(catBean);
		}
	}

}
