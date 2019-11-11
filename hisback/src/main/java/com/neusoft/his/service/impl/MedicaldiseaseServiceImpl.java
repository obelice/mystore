package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.MedicaldiseaseMapper;
import com.neusoft.his.pojo.Medicaldisease;
import com.neusoft.his.service.MedicaldiseaseService;

@Service
public class MedicaldiseaseServiceImpl implements MedicaldiseaseService {

	@Autowired
	private MedicaldiseaseMapper medicaldiseaseMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Medicaldisease record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Medicaldisease record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Medicaldisease selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Medicaldisease record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Medicaldisease record) {
		// TODO Auto-generated method stub
		return 0;
	}

}