package com.zd.warehouse.business.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.warehouse.business.model.Dept;
import com.zd.warehouse.business.service.DeptService;
import com.zd.warehouse.core.model.Result;

/**
 * @author Kstar:
 * @version 2018年6月12日 下午4:28:15
 * 
 */
@Controller
@RequestMapping("/dept")
@Api(tags="部门操作接口")
public class DeptController {
	
	@Resource
	private DeptService deptService;
	
	@PostMapping("/insert")
	@ResponseBody
	@ApiOperation(value="添加部门--KStar",httpMethod="POST",response=Result.class,notes="添加部门")
	@ApiImplicitParam(name="dept",value="部门实体",required=true,dataType="Dept",paramType="form")
	public Result<Dept> insertDept(@RequestBody Dept dept){
		return deptService.insertDept(dept);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	@ApiOperation(value="删除部门--KStar",httpMethod="DELETE",response=Result.class,notes="删除部门")
	@ApiImplicitParam(name="list",value="部门id集合",required=true,dataType="List",paramType="body")
	public Result<String> deleteDept(@RequestBody List<String> list){
		return deptService.deleteDept(list);
	}
	
	@PutMapping("/update")
	@ResponseBody
	@ApiOperation(value="更新部门--KStar",httpMethod="PUT",response=Result.class,notes="更新部门")
	@ApiImplicitParam(name="dept",value="部门实体",required=true,dataType="Dept",paramType="form")
	public Result<Dept> updateDept(@RequestBody Dept dept){
		return deptService.updateDept(dept);
	}
	
	@GetMapping("/all")
	@ResponseBody
	@ApiOperation(value="查询所有部门",httpMethod="GET",response=Result.class,notes="查询所有部门")
	public Result<List<Dept>> queryAll(){
		return deptService.queryAll();
	}
 	
	@GetMapping("/{deptId}")
	@ResponseBody
	@ApiOperation(value="查询单个部门",httpMethod="GET",response=Result.class,notes="查询单个部门")
	@ApiImplicitParam(name="id",value="部门id",required=true,dataType="Integer",paramType="path")
	public Result<Dept> queryDept(@PathVariable Integer deptId){
		return deptService.queryDept(deptId);
	}
}
