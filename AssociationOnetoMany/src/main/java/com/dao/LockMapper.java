package com.dao;

import org.apache.ibatis.annotations.Param;

import com.domain.LockBean;

public interface LockMapper {

	public int saveLock(@Param("lock") LockBean lock);

	public LockBean findLockById(int id);

	public LockBean findLockAndKeys(int id);

}
