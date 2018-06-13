package com.zd.warehouse.business.service;

import java.util.List;

import com.zd.warehouse.business.model.Dept;
import com.zd.warehouse.core.model.Result;

/**
 * @author Kstar:
 * @version 2018年6月13日 上午8:33:20
 * 
 */
public interface DeptService {

	//插入部门
	Result<Dept> insertDept(Dept dept);
	//删除部门
	Result<String> deleteDept(List<String> list);
	//更新部门
	Result<Dept> updateDept(Dept dept);
	//查询所有部门
	Result<List<Dept>> queryAll();
	//查询单个部门
	Result<Dept> queryDept(Integer deptId);
	

}
