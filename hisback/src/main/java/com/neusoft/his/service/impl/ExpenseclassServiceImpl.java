package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.ExpenseclassMapper;
import com.neusoft.his.pojo.Expenseclass;
import com.neusoft.his.service.ExpenseclassService;

@Service
public class ExpenseclassServiceImpl implements ExpenseclassService {

	@Autowired
	private ExpenseclassMapper expenseclassMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Expenseclass record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Expenseclass record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Expenseclass selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Expenseclass record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Expenseclass record) {
		// TODO Auto-generated method stub
		return 0;
	}

}