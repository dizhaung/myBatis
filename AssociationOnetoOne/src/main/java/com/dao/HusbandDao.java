package com.dao;

import com.domain.Husband;

public interface HusbandDao {

	public Husband selectHusbandById(int id) throws Exception;

	public Husband selectHusbandAndWife(int id) throws Exception;

}
