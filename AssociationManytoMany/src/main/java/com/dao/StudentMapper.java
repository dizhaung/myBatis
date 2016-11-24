package com.dao;

import com.domain.StudentBean;

public interface StudentMapper {

	public StudentBean findStuById(int id);

	public StudentBean findStuAndCou(int id);
}
