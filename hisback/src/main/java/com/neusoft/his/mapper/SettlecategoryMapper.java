package com.neusoft.his.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Settlecategory;

@Mapper
public interface SettlecategoryMapper {
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