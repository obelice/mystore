package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Expenseclass;
@Mapper
public interface ExpenseclassMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Expenseclass record);

    int insertSelective(Expenseclass record);

    Expenseclass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Expenseclass record);

    int updateByPrimaryKey(Expenseclass record);
}