package com.neusoft.his.service;

import java.util.List;

import com.neusoft.his.pojo.Settlecategory;

public interface SettlecategoryService {
	int deleteByPrimaryKey(Integer id);

	int insert(Settlecategory record);

	int insertSelective(Settlecategory record);

	Settlecategory selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Settlecategory record);

	int updateByPrimaryKey(Settlecategory record);

	int deleteBybatch(List<Settlecategory> record);

	// 待条件查询总行数
	int selectByCount(Settlecategory record);

	// <!-- 带条件疾病类别和编号 查询-->
	List<Settlecategory> selectAllByConditions(Settlecategory record);
}