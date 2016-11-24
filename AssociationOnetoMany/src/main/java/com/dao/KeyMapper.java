package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.domain.KeyBean;

public interface KeyMapper {
	public int batchSaveKeys(@Param("keys") List<KeyBean> keys);
}
