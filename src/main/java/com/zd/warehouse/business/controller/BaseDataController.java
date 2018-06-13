package com.zd.warehouse.business.controller;
/**
 * @author kuangstar:
 * @version 2018年6月11日 下午5:07:45
 * 
 */
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.warehouse.business.model.Branch;
import com.zd.warehouse.business.model.Category;
import com.zd.warehouse.business.model.Unit;
import com.zd.warehouse.business.service.DatabaseService;

@Controller
@RequestMapping("/baseData")
@Api(tags={"商品基础数据操作接口"})
public class BaseDataController {
	Logger logger = LoggerFactory.getLogger(GoodsDatabaseDropedController.class);
	
	@Resource
	private DatabaseService databaseService;
	/*
	 * 添加单位
	 */
	@PostMapping("/insertUnit")
	@ResponseBody
	@ApiOperation(value="添加单位--kuangStar",httpMethod="POST",response=Unit.class,notes="根据单位实体添加单位")
	@ApiImplicitParam(name="unit",value="单位实体",required = true, dataType = "Unit", paramType = "form")
	public Unit unitAdd(@RequestBody Unit unit){
		if(databaseService.insertUnit(unit)>0){
			return unit;
		}
		return null;
	}
	
	/*
	 * 查询所有单位
	 */
	@GetMapping("/queryAllUnit")
	@ResponseBody
	@ApiOperation(value="查询所有单位--kuangStar",httpMethod="GET",response=List.class,notes="查询所有单位")
	public List<Unit> queryAllUnit(){
		List<Unit> units = databaseService.queryAllUnit();
		return units;
	}
	
	/*
	 * 添加品牌
	 */
	@PostMapping("/insertBranch")
	@ResponseBody
	@ApiOperation(value="添加品牌--kuangStar",httpMethod="POST",response=Branch.class,notes="根据品牌实体添加实体")
	@ApiImplicitParam(name="branch",value="品牌实体",required=true,dataType = "Branch",paramType = "form") 
	public Branch branchAdd(@RequestBody Branch branch){
		if(databaseService.insertBranch(branch)>0){
			return branch;
		}
		return null;
	}
	
	/*
	 * 查询所有品牌
	 */
	@GetMapping("/queryAllBranch")
	@ResponseBody
	@ApiOperation(value="查询所有单位--kuangStar",httpMethod="GET",response=List.class,notes="查询所有单位")
	public List<Branch> queryAllBranch(){
		List<Branch> Branchs = databaseService.queryAllBranch();
		return Branchs;
	}
	
	/*
	 * 添加分类
	 */
	@PostMapping("/insertCategory")
	@ResponseBody
	@ApiOperation(value="添加分类--kuangStar",httpMethod="POST",response=Category.class,notes="根据单位实体添加单位")
	@ApiImplicitParam(name="category",value="分类实体",required = true, dataType = "Category", paramType = "form")
	public Category categoryAdd(@RequestBody Category category){
		if(databaseService.insertCategory(category)>0){
			return category;
		}
		return null;
	}
	
	/*
	 * 查询所有分类
	 */
	@GetMapping("/queryAllCategory")
	@ResponseBody
	@ApiOperation(value="查询所有分类--kuangStar",httpMethod="GET",response=List.class,notes="查询所有分类")
	public List<Category> queryAllCategory(){
		List<Category> categorys = databaseService.queryAllCategory();
		return categorys;
	}
}
