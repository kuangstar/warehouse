package com.zd.warehouse.business.service;

import java.util.List;

import com.zd.warehouse.business.model.Supplier;
import com.zd.warehouse.core.model.Result;

/**
 * @author Kstar:
 * @version 2018年6月13日 上午10:29:43
 * 
 */
public interface SupplierService {
	//插入供应商
	Result<Supplier> insert(Supplier supplier);
	//删除供应商
	Result<String> deleteSupplier(List<String> list);
	//更新供应商
	Result<Supplier> updateSupplier(Supplier supplier);
	//根据id查询单个供应商
	Result<Supplier> querySupplierById(Integer supplierId);
	//根据id查询某些供应商
	Result<List<Supplier>> querySomeSuppliers(List<Integer> list);
	
}
