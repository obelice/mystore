package com.neusoft.his.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.RegistlevelMapper;
import com.neusoft.his.pojo.Registlevel;
import com.neusoft.his.service.RegistlevelService;

@Service
public class RegistlevelServiceImpl implements RegistlevelService {

	@Autowired
	private RegistlevelMapper registlevelMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Registlevel record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Registlevel record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Registlevel> selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return registlevelMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Registlevel record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Registlevel record) {
		// TODO Auto-generated method stub
		return 0;
	}

}