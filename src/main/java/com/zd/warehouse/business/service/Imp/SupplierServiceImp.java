package com.zd.warehouse.business.service.Imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zd.warehouse.business.mapper.SupplierMapper;
import com.zd.warehouse.business.model.Supplier;
import com.zd.warehouse.business.service.SupplierService;
import com.zd.warehouse.core.model.Result;

/**
 * @author Kstar:
 * @version 2018年6月13日 上午10:41:02
 * 
 */
@Service
public class SupplierServiceImp implements SupplierService {

	@Resource
	private SupplierMapper supplierMapper;
	
	@Override
	public Result<Supplier> insert(Supplier supplier) {
		Result<Supplier> result = new Result<Supplier>();
		if(supplierMapper.insert(supplier)>0){
			result.success("插入供应商成功", supplier);
		}else{
			result.failure("插入供应商失败", supplier);
		}
		return result;
	}
	
	@Override
	public Result<String> deleteSupplier(List<String> list) {
		Result<String> result = new Result<String>();
		if(supplierMapper.deleteSupplier(list)>0){
			result.success("删除供应商成功");
		}else{
			result.failure("删除供应商失败");
		}
		return result;
	}
	
	@Override
	public Result<Supplier> updateSupplier(Supplier supplier) {
		Result<Supplier> result = new Result<Supplier>();
		if(supplierMapper.updateByPrimaryKey(supplier)>0){
			result.success("更新供应商成功", supplier);
		}else{
			result.failure("更新供应商失败", null);
		}
		return result;
	}
	
	@Override
	public Result<Supplier> querySupplierById(Integer supplierId) {
		Result<Supplier> result = new Result<Supplier>();
		Supplier supplier = supplierMapper.selectByPrimaryKey(supplierId);
		if(supplier!=null){
			result.success("查询供应商成功", supplier);
		}else{
			result.failure("查询供应商失败", null);
		}
		return result;
	}
	@Override
	public Result<List<Supplier>> querySomeSuppliers(List<Integer> list) {
		Result<List<Supplier>> result = new Result<List<Supplier>>();
		List<Supplier> supplierList = supplierMapper.querySomeSuppliers(list);
		if(supplierList!=null){
			result.success("查询某些供应商成功", supplierList);
		}else{
			result.failure("查询某些供应商失败", null);
		}
		return result;
	}
}
