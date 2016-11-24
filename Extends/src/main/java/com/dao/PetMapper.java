package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.domain.CatBean;
import com.domain.DogBean;
import com.domain.PetBean;

public interface PetMapper {
	public int saveCat(@Param("c") CatBean cat);

	public int saveDog(@Param("d") DogBean dog);

	public List<PetBean> findAllPet();

	public List<CatBean> findAllCat();

}