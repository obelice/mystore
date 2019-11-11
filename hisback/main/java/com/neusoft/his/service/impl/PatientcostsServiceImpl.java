package com.neusoft.his.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.PatientcostsMapper;
import com.neusoft.his.pojo.Patientcosts;
import com.neusoft.his.service.PatientcostsService;

@Service
public class PatientcostsServiceImpl implements PatientcostsService {

	@Autowired
	private PatientcostsMapper patientcostsMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Patientcosts record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Patientcosts record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Patientcosts selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Patientcosts record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Patientcosts record) {
		// TODO Auto-generated method stub
		return 0;
	}

}