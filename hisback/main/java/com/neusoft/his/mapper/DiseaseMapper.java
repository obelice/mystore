package com.neusoft.his.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Disease;

@Mapper
public interface DiseaseMapper {
	int deleteByPrimaryKey(Integer id);

	int deleteBybatch(List<Disease> record);

	int insert(Disease record);

	int insertSelective(Disease record);

	Disease selectByPrimaryKey(Integer id);

	// 待条件查询总行数
	int selectByCount(Disease disease);

	// <!-- 带条件疾病类别和编号 查询-->
	List<Disease> selectAllByConditions(Disease disease);

	int updateByPrimaryKeySelective(Disease record);

	int updateByPrimaryKey(Disease record);
}