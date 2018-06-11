package com.zd.warehouse.business.service;

import com.zd.warehouse.business.model.Branch;
import com.zd.warehouse.business.model.Category;
import com.zd.warehouse.business.model.Unit;

/**
 * @author kuangstar:
 * @version 2018年6月9日 下午3:02:02
 * 
 */
public interface DatabaseService {
	//插入单位名称
	int insertUnit(Unit unit);
	//插入品牌名称
	int insertBranch(Branch branch);
	//插入品牌名称
	int insertCategory(Category category);
}
