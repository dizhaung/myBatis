package com.dao;

import com.domain.CoursesBean;

public interface CoursesMapper {
	public CoursesBean findCouById(int id);

	public CoursesBean findCouAndStu(int id);
}
