package com.neusoft.his.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.DiseaseMapper;
import com.neusoft.his.pojo.Disease;
import com.neusoft.his.service.DiseaseService;

@Service
public class DiseaseServiceImpl implements DiseaseService {

	@Autowired
	private DiseaseMapper diseaseMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return diseaseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Disease record) {
		// TODO Auto-generated method stub
		return diseaseMapper.insert(record);
	}

	@Override
	public int insertSelective(Disease record) {
		// TODO Auto-generated method stub
		return diseaseMapper.insertSelective(record);
	}

	@Override
	public Disease selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return diseaseMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Disease record) {
		return diseaseMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Disease record) {
		// TODO Auto-generated method stub
		return diseaseMapper.updateByPrimaryKey(record);
	}

	@Override
	public int selectByCount(Disease disease) {
		// TODO Auto-generated method stub
		return diseaseMapper.selectByCount(disease);
	}

	@Override
	public List<Disease> selectAllByConditions(Disease disease) {
		// TODO Auto-generated method stub
		return diseaseMapper.selectAllByConditions(disease);
	}

//批量删除
	@Override
	public int deleteBybatch(List<Disease> record) {
		return diseaseMapper.deleteBybatch(record);
	}

}