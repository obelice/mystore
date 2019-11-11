package com.neusoft.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.pojo.Constanttype;
import com.neusoft.his.service.ConstantTypeService;

@RestController
@RequestMapping("/ConstantTypeController")
public class ConstantTypeController {
	
	@Autowired
	private ConstantTypeService constantTypeService;
	
	@RequestMapping("/selectByCount")
	public int selectByCount(@RequestBody Constanttype record) {
		return constantTypeService.selectByCount(record);
	}
	
	@RequestMapping("/selectAll")
	public List<Constanttype> selectAll(@RequestBody Constanttype record) {
		return constantTypeService.selectAll(record);
	}
	
	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(@RequestBody Constanttype record) {
		return constantTypeService.deleteByPrimaryKey(record.getId());
	}
	
	@RequestMapping("/insert")
	public int insert(@RequestBody Constanttype record) {
		return constantTypeService.insert(record);
	}
	
	@RequestMapping("/insertSelective")
	public int insertSelective(@RequestBody Constanttype record) {
		return constantTypeService.insertSelective(record);
	}
	
	@RequestMapping("/selectByPrimaryKey")
	public Constanttype selectByPrimaryKey(@RequestBody Constanttype record) {
		return constantTypeService.selectByPrimaryKey(record.getId());
	}
	
	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(@RequestBody Constanttype record) {
		return constantTypeService.updateByPrimaryKey(record);
	}
	
	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(@RequestBody Constanttype record) {
		return constantTypeService.updateByPrimaryKeySelective(record);
	}
	
	
}
