package com.neusoft.his.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.neusoft.his.pojo.Constantitem;
import com.neusoft.his.pojo.Constanttype;
@Mapper
public interface ConstantitemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Constantitem record);

    int insertSelective(Constantitem record);

    Constantitem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Constantitem record);

    int updateByPrimaryKey(Constantitem record);
    
    public int selectByCount(Constantitem record);
    
    public List<Constantitem> selectAll(Constantitem record);
}