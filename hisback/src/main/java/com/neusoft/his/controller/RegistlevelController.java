package com.neusoft.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.pojo.Registlevel;
import com.neusoft.his.service.RegistlevelService;

@RestController
@RequestMapping("/Registlevel")
public class RegistlevelController {

	@Autowired
	private RegistlevelService registlevelService;

	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insert")
	public int insert(Registlevel record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(Registlevel record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/selectByPrimaryKey")
	public List<Registlevel> selectByPrimaryKey(@RequestBody Registlevel record) {
		// TODO Auto-generated method stub
		return registlevelService.selectByPrimaryKey(record.getId());
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(Registlevel record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(Registlevel record) {
		// TODO Auto-generated method stub
		return 0;
	}

}