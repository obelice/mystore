package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.DrugsMapper;
import com.neusoft.his.pojo.Drugs;
import com.neusoft.his.service.DrugsService;

@Service
public class DrugsServiceImpl implements DrugsService {

	@Autowired
	private DrugsMapper drugsMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Drugs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Drugs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Drugs selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Drugs record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Drugs record) {
		// TODO Auto-generated method stub
		return 0;
	}

}