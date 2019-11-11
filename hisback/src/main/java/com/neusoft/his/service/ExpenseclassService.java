package com.neusoft.his.service;

import com.neusoft.his.pojo.Expenseclass;

public interface ExpenseclassService {
    int deleteByPrimaryKey(Integer id);

    int insert(Expenseclass record);

    int insertSelective(Expenseclass record);

    Expenseclass selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Expenseclass record);

    int updateByPrimaryKey(Expenseclass record);
}