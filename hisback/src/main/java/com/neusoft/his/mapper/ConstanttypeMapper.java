package com.neusoft.his.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Constanttype;

@Mapper
public interface ConstanttypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Constanttype record);

    int insertSelective(Constanttype record);

    Constanttype selectByPrimaryKey(Integer id);
    
    int updateByPrimaryKeySelective(Constanttype record);

    int updateByPrimaryKey(Constanttype record);
    
    public int selectByCount(Constanttype record);
    
    public List<Constanttype> selectAll(Constanttype record);
}