package com.neusoft.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.pojo.Scheduling;
import com.neusoft.his.service.SchedulingService;
@RestController
@RequestMapping("/SchedulingController")
public class SchedulingController {

	@Autowired
	private SchedulingService schedulingService;
	
	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insert")
	public int insert(Scheduling record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(Scheduling record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/selectByPrimaryKey")
	public Scheduling selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(Scheduling record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(Scheduling record) {
		// TODO Auto-generated method stub
		return 0;
	}
   
}