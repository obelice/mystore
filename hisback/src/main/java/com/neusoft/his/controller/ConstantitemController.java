package com.neusoft.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.pojo.Constantitem;
import com.neusoft.his.service.ConstantitemService;
@RestController
@RequestMapping("/ConstantitemController")
public class ConstantitemController {

	@Autowired
	private ConstantitemService constantitemService;

	@RequestMapping("/selectByCount")
	public int selectByCount(@RequestBody Constantitem record) {
		return constantitemService.selectByCount(record);
	}
	
	@RequestMapping("/selectAll")
	public List<Constantitem> selectAll(@RequestBody Constantitem record) {
		return constantitemService.selectAll(record);
	}
	
	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insert")
	public int insert(Constantitem record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(Constantitem record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/selectByPrimaryKey")
	public Constantitem selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(Constantitem record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(Constantitem record) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}