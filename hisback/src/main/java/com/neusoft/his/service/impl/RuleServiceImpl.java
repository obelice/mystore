package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.RuleMapper;
import com.neusoft.his.pojo.Rule;
import com.neusoft.his.service.RuleService;

@Service
public class RuleServiceImpl implements RuleService {

	@Autowired
	private RuleMapper ruleMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Rule record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Rule record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Rule selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Rule record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Rule record) {
		// TODO Auto-generated method stub
		return 0;
	}

}