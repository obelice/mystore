package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.HerbaltemplateMapper;
import com.neusoft.his.pojo.Herbaltemplate;
import com.neusoft.his.service.HerbaltemplateService;

@Service
public class HerbaltemplateServiceImpl implements HerbaltemplateService {

	@Autowired
	private HerbaltemplateMapper herbaltemplateMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Herbaltemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Herbaltemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Herbaltemplate selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Herbaltemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Herbaltemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

}