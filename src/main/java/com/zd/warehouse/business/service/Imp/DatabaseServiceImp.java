package com.zd.warehouse.business.service.Imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zd.warehouse.business.mapper.UnitMapper;
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
	@Override
	public int insertUnit(Unit unit) {
		return unitMapper.insert(unit);
	}

}
