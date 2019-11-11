package com.neusoft.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.his.pojo.Fmeditem;
import com.neusoft.his.pojo.dto.FmeditemDepExp;
import com.neusoft.his.service.FmeditemService;

@RestController
@RequestMapping("/Fmeditem")
public class FmeditemController {

	@Autowired
	private FmeditemService fmeditemService;

	@RequestMapping("/selectAllByConditions")
	public List<FmeditemDepExp> selectAllByConditions(@RequestBody Fmeditem record) {
		PageHelper.startPage(record.getBeginNum(), record.getMaxNum());
		List<FmeditemDepExp> list = fmeditemService.selectAllByConditions(record);
		PageInfo<FmeditemDepExp> FmeditemInfo = new PageInfo(list);
		return FmeditemInfo.getList();
	}

	@RequestMapping("/selectByCount")
	public int selectByCount(@RequestBody Fmeditem record) {
		return fmeditemService.selectByCount(record);
	}

	@RequestMapping("/deleteByPrimaryKey")
	public int deleteByPrimaryKey(@RequestBody Fmeditem record) {
		// TODO Auto-generated method stub
		return fmeditemService.deleteByPrimaryKey(record.getId());
	}

	@RequestMapping("/insert")
	public int insert(@RequestBody Fmeditem record) {
		// TODO Auto-generated method stub
		return fmeditemService.insert(record);
	}

	@RequestMapping("/insertSelective")
	public int insertSelective(@RequestBody Fmeditem record) {
		// TODO Auto-generated method stub
		return fmeditemService.insertSelective(record);
	}

	@RequestMapping("/selectByPrimaryKey")
	public Fmeditem selectByPrimaryKey(@RequestBody Integer id) {
		// TODO Auto-generated method stub
		return fmeditemService.selectByPrimaryKey(id);
	}

	@RequestMapping("/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(@RequestBody Fmeditem record) {
		// TODO Auto-generated method stub
		return fmeditemService.updateByPrimaryKeySelective(record);
	}

	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(@RequestBody Fmeditem record) {
		// TODO Auto-generated method stub
		return fmeditemService.updateByPrimaryKey(record);
	}

	@RequestMapping("/deleteBybatch")
	public int deleteBybatch(@RequestBody List<Fmeditem> record) {
		return fmeditemService.deleteBybatch(record);
	}

}