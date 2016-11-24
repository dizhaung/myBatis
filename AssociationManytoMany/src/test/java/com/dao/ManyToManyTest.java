package com.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.domain.CoursesBean;
import com.domain.StudentBean;

public class ManyToManyTest {

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
	public void findCoursesByStudent() {
		StudentMapper sm = session.getMapper(StudentMapper.class);
		StudentBean sb = sm.findStuAndCou(1);
		System.out.println(sb);

	}

	@Test
	public void findStudentByCourses() {
		CoursesMapper cm = session.getMapper(CoursesMapper.class);
		CoursesBean cb = cm.findCouAndStu(2);
		System.out.println(cb);
	}

}
