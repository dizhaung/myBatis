package com.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.domain.Student;

public class StudentMapperTest {

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
	public void testInsert() {

		Student student = new Student();
		student.setStudentName("stu1");

		StudentMapper sm = session.getMapper(StudentMapper.class);

		sm.insert(student);

	}

}
