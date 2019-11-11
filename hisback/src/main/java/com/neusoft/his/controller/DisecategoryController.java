package com.neusoft.his.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.his.pojo.Disecategory;
import com.neusoft.his.service.DisecategoryService;

@RestController
public class DisecategoryController {

	@Autowired
	private DisecategoryService disecategoryService;

	@RequestMapping("/Disecategory/selectAllByConditions")
	public List<Disecategory> selectAllByConditions(@RequestBody Disecategory disecategory) {
		PageHelper.startPage(disecategory.getBeginNum(), disecategory.getMaxNum());
		List<Disecategory> list = disecategoryService.selectAllByConditions(disecategory);
		PageInfo<Disecategory> disecategoryInfo = new PageInfo(list);
		return disecategoryInfo.getList();
	}

	@RequestMapping("/Disecategory/selectByCount")
	int selectByCount(@RequestBody Disecategory disecategory) {
		return disecategoryService.selectByCount(disecategory);
	}

	@RequestMapping("/Disecategory/insertSelective")
	public int insertSelective(@RequestBody Disecategory disecategory) {
		System.out.println(disecategory);
		return disecategoryService.insertSelective(disecategory);
	}

	@RequestMapping("/Disecategory/updateByPrimaryKeySelective")
	public int updateByPrimaryKeySelective(@RequestBody Disecategory disecategory) {
		return disecategoryService.updateByPrimaryKeySelective(disecategory);
	}

	@RequestMapping("/Disecategory/deleteByPrimaryKey")
	public int deleteByPrimaryKey(@RequestBody Disecategory disecategory) {
		return disecategoryService.deleteByPrimaryKey(disecategory.getId());
	}

	@RequestMapping("/Disecategory/deleteBybatch")
	public int deleteBybatch(@RequestBody List<Disecategory> record) {
		return disecategoryService.deleteBybatch(record);
	}
}
