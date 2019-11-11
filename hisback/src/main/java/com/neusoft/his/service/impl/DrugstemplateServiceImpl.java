package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.DrugstemplateMapper;
import com.neusoft.his.pojo.Drugstemplate;
import com.neusoft.his.service.DrugstemplateService;

@Service
public class DrugstemplateServiceImpl implements DrugstemplateService {

	@Autowired
	private DrugstemplateMapper drugstemplateMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Drugstemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Drugstemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Drugstemplate selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Drugstemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Drugstemplate record) {
		// TODO Auto-generated method stub
		return 0;
	}

}