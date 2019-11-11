package com.neusoft.his.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.FmeditemMapper;
import com.neusoft.his.pojo.Fmeditem;
import com.neusoft.his.pojo.dto.FmeditemDepExp;
import com.neusoft.his.service.FmeditemService;

@Service
public class FmeditemServiceImpl implements FmeditemService {

	@Autowired
	private FmeditemMapper fmeditemMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return fmeditemMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Fmeditem record) {
		return fmeditemMapper.insert(record);
	}

	@Override
	public int insertSelective(Fmeditem record) {
		return fmeditemMapper.insertSelective(record);
	}

	@Override
	public Fmeditem selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return fmeditemMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Fmeditem record) {
		// TODO Auto-generated method stub
		return fmeditemMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Fmeditem record) {
		// TODO Auto-generated method stub
		return fmeditemMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<FmeditemDepExp> selectAllByConditions(Fmeditem record) {
		return fmeditemMapper.selectAllByConditions(record);
	}

	@Override
	public int selectByCount(Fmeditem record) {
		return fmeditemMapper.selectByCount(record);
	}

	@Override
	public int deleteBybatch(List<Fmeditem> record) {
		return fmeditemMapper.deleteBybatch(record);
	}

}