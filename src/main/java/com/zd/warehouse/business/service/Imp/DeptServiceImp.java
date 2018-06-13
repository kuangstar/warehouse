package com.zd.warehouse.business.service.Imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zd.warehouse.business.mapper.DeptMapper;
import com.zd.warehouse.business.model.Dept;
import com.zd.warehouse.business.service.DeptService;
import com.zd.warehouse.core.model.Result;

/**
 * @author Kstar:
 * @version 2018年6月13日 上午8:34:57
 * 
 */
@Service
public class DeptServiceImp implements DeptService {

	@Resource
	private DeptMapper deptMapper;
	
	@Override
	public Result<Dept> insertDept(Dept dept) {
		Result<Dept> result = new Result<Dept>();
		if(deptMapper.insert(dept)>0){
			result.success("插入部门成功", dept);
		}else{
			result.failure("插入部门失败",null);
		}
		return result;
	}

	@Override
	public Result<String> deleteDept(List<String> list) {
		Result<String> result = new Result<String>();
		if(deptMapper.deleteDept(list)>0){
			result.success("删除部门成功");
		}else{
			result.failure("删除部门失败");
		}
		return result;
	}
	
	@Override
	public Result<Dept> updateDept(Dept dept) {
		Result<Dept> result = new Result<Dept>();
		if(deptMapper.updateByPrimaryKey(dept)>0){
			result.success("更新部门成功", dept);
		}else{
			result.failure("更新部门失败", null);
		}
		return result;
	}
	
	@Override
	public Result<List<Dept>> queryAll() {
		Result<List<Dept>> result = new Result<List<Dept>>();
		List<Dept> list = deptMapper.queryAll();
		if(list.size()>0){
			result.success("查询所有部门成功", list);
		}else{
			result.failure("查询所有部门失败", null);
		}
		return result;
	}
	@Override
	public Result<Dept> queryDept(Integer deptId) {
		Result<Dept> result = new Result<Dept>();
		Dept dept = deptMapper.queryDept(deptId);
		if(dept!=null){
			result.success("查询部门成功", dept);
		}else{
			result.failure("查询部门失败", null);
		}
		return result;
	}
}
