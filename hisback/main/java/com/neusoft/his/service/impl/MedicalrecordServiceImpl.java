package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.MedicalrecordMapper;
import com.neusoft.his.pojo.Medicalrecord;
import com.neusoft.his.service.MedicalrecordService;

@Service
public class MedicalrecordServiceImpl implements MedicalrecordService {

	@Autowired
	private MedicalrecordMapper medicalrecordMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Medicalrecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Medicalrecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Medicalrecord selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Medicalrecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Medicalrecord record) {
		// TODO Auto-generated method stub
		return 0;
	}

}