package com.neusoft.his.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.mapper.SchedulingMapper;
import com.neusoft.his.pojo.Scheduling;
import com.neusoft.his.pojo.dto.ScheEntity;
import com.neusoft.his.service.SchedulingService;

@Service
public class SchedulingServiceImpl implements SchedulingService {

	@Autowired
	private SchedulingMapper schedulingMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return schedulingMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingMapper.insert(record);
	}

	@Override
	public int insertSelective(Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingMapper.insertSelective(record);
	}

	@Override
	public Scheduling selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return schedulingMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingMapper.updateByPrimaryKey(record);
	}

	@Override
	public int deleteBybatch(List<Scheduling> record) {
		// TODO Auto-generated method stub
		return schedulingMapper.deleteBybatch(record);
	}

	@Override
	public int selectByCount(Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingMapper.selectByCount(record);
	}

	@Override
	public List<ScheEntity> selectAllByConditions(Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingMapper.selectAllByConditions(record);
	}

}