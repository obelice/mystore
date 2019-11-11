package com.neusoft.his.service;

import java.util.List;

import com.neusoft.his.pojo.Constantitem;
import com.neusoft.his.pojo.Constanttype;

public interface ConstantitemService {
    int deleteByPrimaryKey(Integer id);

    int insert(Constantitem record);

    int insertSelective(Constantitem record);

    Constantitem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Constantitem record);

    int updateByPrimaryKey(Constantitem record);
    
    public int selectByCount(Constantitem record);
    
    public List<Constantitem> selectAll(Constantitem record);
}