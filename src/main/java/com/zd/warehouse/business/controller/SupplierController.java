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
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.warehouse.business.model.Supplier;
import com.zd.warehouse.business.service.SupplierService;
import com.zd.warehouse.core.model.Result;

/**
 * @author Kstar:
 * @version 2018年6月13日 上午10:28:00
 * 
 */
@Controller
@RequestMapping("/supplier")
@Api(tags="供应商操作接口")
public class SupplierController {
	
	@Resource
	private SupplierService supplierService;
	
	@PostMapping("/insert")
	@ResponseBody
	@ApiOperation(value="插入供应商--KStar",httpMethod="POST",response=Result.class,notes="插入供应商")
	@ApiImplicitParam(name="supplier",value="供应商实体",required=true,dataType="Supplier",paramType="form")
	public Result<Supplier> insertSupplier(@RequestBody Supplier supplier){
		return supplierService.insert(supplier);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	@ApiOperation(value="删除供应商--KStar",httpMethod="DELETE",response=Result.class,notes="删除供应商")
	@ApiImplicitParam(name="list",value="供应商id集合",required=true,dataType="List",paramType="body")
	public Result<String> deleteSupplier(@RequestBody List<String> list){
		return supplierService.deleteSupplier(list);
	}
	
	@PutMapping("/update")
	@ResponseBody
	@ApiOperation(value="更新供应商--KStar",httpMethod="PUT",response=Result.class,notes="更新供应商信息")
	@ApiImplicitParam(name="supplier",value="供应商实体",required=true,dataType="Supplier",paramType="form")
	public Result<Supplier> updateSupplier(@RequestBody Supplier supplier){
		return supplierService.updateSupplier(supplier);
	}
	
	@GetMapping("/{supplierId}")
	@ResponseBody
	@ApiOperation(value="根据id查询单个供应商--KStar",httpMethod="GET",response=Result.class,notes="根据id查询单个供应商")
	@ApiImplicitParam(name="supplierId",value="供应商id",required=true,dataType="Integer",paramType="path")
	public Result<Supplier> queryResult(@PathVariable Integer supplierId){
		return supplierService.querySupplierById(supplierId);
	}
	
	@PostMapping("/querySomeSuppliers")
	@ResponseBody
	@ApiOperation(value="根据id集合查询一些供应商--KStar",httpMethod="POST",response=Result.class,notes="根据id集合查询某些供应商")
	@ApiImplicitParam(name="list",value="供应商id集合",required=true,dataType="List",paramType="body")
	public Result<List<Supplier>> queryResults(@RequestBody List<Integer> list){
		return supplierService.querySomeSuppliers(list);
	}
}
