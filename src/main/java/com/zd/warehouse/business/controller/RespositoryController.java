package com.zd.warehouse.business.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.HttpMethod;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.warehouse.business.model.RepositoryDetails;
import com.zd.warehouse.business.service.RepositoryService;
import com.zd.warehouse.core.model.Result;


/**
 * @author kuangstar:
 * @version 2018年6月12日 上午9:57:13
 * 
 */
@Controller
@RequestMapping("/respository")
@Api(tags="物品库存接口")
public class RespositoryController {
	Logger logger = LoggerFactory.getLogger(RespositoryController.class);
	
	@Resource
	private RepositoryService repositoryService;
	/**
	 * 查询所有物品库存
	 * @return 保存物品库存的list
	 */
	@GetMapping("/all")
	@ResponseBody
	@ApiOperation(value="查询所有物品库存--kuangStar",httpMethod="GET",response=Result.class,notes="查询所有库存")
	public Result<List<RepositoryDetails>> queryAll(){
		return repositoryService.queryAll();
	}
	
	@PostMapping(value="/insert")
	@ResponseBody
	@ApiOperation(value="新增物品库存信息--kuangStar",httpMethod="POST",response=Result.class,notes="新增物品库存信息")
	@ApiImplicitParam(name="repositoryDetails",value="物品库存实体",required = true, dataType = "RepositoryDetails", paramType = "form")
	public Result<RepositoryDetails> insertRepository(@RequestBody RepositoryDetails repositoryDetails){
		return repositoryService.insertRepository(repositoryDetails);
	}
	
	@DeleteMapping("/delete")
	@ResponseBody
	@ApiOperation(value="删除物品库存信息--kuangStar",httpMethod="DELETE",response=Result.class,notes="删除物品库存信息")
	@ApiImplicitParam(name="list",value="物品库存id集合",required = true, dataType = "List", paramType = "body")
	public Result<String> deleteRepository(@RequestBody List<String> list){
		return repositoryService.deleteRepository(list);
	}
	
	@PutMapping("update")
	@ResponseBody
	@ApiOperation(value="更新物品库存信息--kuangStar",httpMethod="PUT",response=Result.class,notes="更新物品库存信息")
	@ApiImplicitParam(name="repositoryDetails",value="物品库存实体",required=true,dataType="RepositoryDetails",paramType="form")
	public Result<RepositoryDetails> updateRepository(@RequestBody RepositoryDetails repositoryDetails){
		return repositoryService.updateRepository(repositoryDetails);
	}
}
