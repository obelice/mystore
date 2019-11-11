package com.neusoft.his.service;

import java.util.List;

import com.neusoft.his.pojo.Constanttype;

public interface ConstantTypeService {
	int deleteByPrimaryKey(Integer id);

    int insert(Constanttype record);

    int insertSelective(Constanttype record);

    Constanttype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Constanttype record);

    int updateByPrimaryKey(Constanttype record);
    
    public int selectByCount(Constanttype record);
    
    public List<Constanttype> selectAll(Constanttype record);
}
