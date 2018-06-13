package com.zd.warehouse.business.service.Imp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zd.warehouse.business.mapper.BranchMapper;
import com.zd.warehouse.business.mapper.CategoryMapper;
import com.zd.warehouse.business.mapper.UnitMapper;
import com.zd.warehouse.business.model.Branch;
import com.zd.warehouse.business.model.Category;
import com.zd.warehouse.business.model.Unit;
import com.zd.warehouse.business.service.DatabaseService;

/**
 * @author kuangstar:
 * @version 2018年6月9日 下午3:02:52
 * 
 */
@Service
public class DatabaseServiceImp implements DatabaseService {
	@Resource
	private UnitMapper unitMapper;
	
	@Resource
	private BranchMapper branchMapper;
	
	@Resource
	private CategoryMapper categoryMapper;
	
	@Override
	public int insertUnit(Unit unit) {
		return unitMapper.insert(unit);
	}
	
	@Override
	public int insertBranch(Branch branch) {
		return branchMapper.insert(branch);
	}
	
	@Override
	public int insertCategory(Category category) {
		return categoryMapper.insert(category);
	}
	
	@Override
	public List<Unit> queryAllUnit() {
		return unitMapper.queryAllUnit();
	}
	@Override
	public List<Branch> queryAllBranch() {
		return branchMapper.queryAllBranch();
	}
	@Override
	public List<Category> queryAllCategory() {
		return categoryMapper.queryAllCategory();
	}
}
