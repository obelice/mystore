package com.neusoft.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.his.pojo.Scheduling;
import com.neusoft.his.pojo.dto.ScheEntity;
import com.neusoft.his.service.SchedulingService;

@RestController
@RequestMapping("/Scheduling")
public class SchedulingController {

	@Autowired
	private SchedulingService schedulingService;

	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(@RequestBody Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingService.deleteByPrimaryKey(record.getId());
	}

	@RequestMapping("/insert")
	public int insert(@RequestBody Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingService.insert(record);
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(@RequestBody Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingService.insertSelective(record);
	}

	@RequestMapping("/selectByPrimaryKey")
	public Scheduling selectByPrimaryKey(@RequestBody Integer id) {
		// TODO Auto-generated method stub
		return schedulingService.selectByPrimaryKey(id);
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(@RequestBody Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingService.updateByPrimaryKeySelective(record);
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(@RequestBody Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingService.updateByPrimaryKey(record);
	}

	@RequestMapping("/deleteBybatch")
	public int deleteBybatch(@RequestBody List<Scheduling> record) {
		return schedulingService.deleteBybatch(record);
	}

	@RequestMapping("/selectByCount")
	public int selectByCount(@RequestBody Scheduling record) {
		// TODO Auto-generated method stub
		return schedulingService.selectByCount(record);
	}

	@RequestMapping("/selectAllByConditions")
	public List<ScheEntity> selectAllByConditions(@RequestBody Scheduling record) {
		System.out.println(record);
		PageHelper.startPage(record.getBeginNum(), record.getMaxNum());
		List<ScheEntity> list = schedulingService.selectAllByConditions(record);
		PageInfo<ScheEntity> ScheEntity = new PageInfo(list);
		return ScheEntity.getList();
	}

}