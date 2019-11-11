package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.ChecktemplateMapper;
import com.neusoft.his.pojo.Checktemplate;
import com.neusoft.his.service.ChecktemplateService;

@Service
public class ChecktemplateServiceImpl implements ChecktemplateService {

	@Autowired
	private ChecktemplateMapper checktemplateMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Checktemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Checktemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Checktemplate selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Checktemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Checktemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

}