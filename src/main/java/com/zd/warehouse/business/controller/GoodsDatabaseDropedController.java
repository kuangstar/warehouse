package com.zd.warehouse.business.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.warehouse.business.model.Branch;
import com.zd.warehouse.business.model.Category;
import com.zd.warehouse.business.model.Unit;
import com.zd.warehouse.business.service.DatabaseService;

/**
 * @author kuangstar:
 * @version 2018年6月9日 上午8:56:17
 * 
 */
@Controller
@RequestMapping("/goods_database")
@Api(tags={"商品基础数据操作接口"})
public class GoodsDatabaseDropedController {
	Logger logger = LoggerFactory.getLogger(GoodsDatabaseDropedController.class);
	
	@Resource
	private DatabaseService databaseService;
	/*
	 * 添加单位
	 */
	@PostMapping("/unit_add")
	@ResponseBody
	public Unit unitAdd(@RequestBody Unit unit){
		if(databaseService.insertUnit(unit)>0){
			return unit;
		}
		return null;
	}
	
	@PostMapping("/unit_")
	@ResponseBody
	public List<Unit> queryAllUnit(){
		List<Unit> units = databaseService.queryAllUnit();
		return units;
	}
	/*
	 * 添加品牌
	 */
	@PostMapping("/branch_add")
	@ResponseBody
	public Branch branchAdd(@RequestBody Branch branch){
		if(databaseService.insertBranch(branch)>0){
			return branch;
		}
		return null;
	}
	/*
	 * 添加分类
	 */
	@PostMapping("/category_add")
	@ResponseBody
	public Category categoryAdd(@RequestBody Category category){
		if(databaseService.insertCategory(category)>0){
			return category;
		}
		return null;
	}
}
