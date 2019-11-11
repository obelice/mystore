package com.neusoft.his.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Scheduling;
import com.neusoft.his.pojo.dto.ScheEntity;

@Mapper
public interface SchedulingMapper {
	int deleteByPrimaryKey(Integer id);

	int insert(Scheduling record);

	int insertSelective(Scheduling record);

	Scheduling selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Scheduling record);

	int updateByPrimaryKey(Scheduling record);

//批量删除
	int deleteBybatch(List<Scheduling> record);

	// 待条件查询总行数
	int selectByCount(Scheduling record);

	// <!-- 带条件疾病类别和编号 查询-->
	List<ScheEntity> selectAllByConditions(Scheduling record);
}