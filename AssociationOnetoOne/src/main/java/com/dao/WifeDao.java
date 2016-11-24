package com.dao;

import com.domain.Husband;

public interface WifeDao {

	public Husband selectWifeByHusbandId(int id) throws Exception;

}
