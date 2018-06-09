package com.zd.warehouse.business.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.warehouse.business.model.Unit;
import com.zd.warehouse.business.service.DatabaseService;

/**
 * @author kuangstar:
 * @version 2018年6月9日 上午8:56:17
 * 
 */
@Controller
@RequestMapping("/goods_database")
public class GoodsController {
	@Resource
	private DatabaseService databaseService;
	
	@RequestMapping("/unit_add")
	@ResponseBody
	public Unit unitAdd(@RequestBody Unit unit){
		if(databaseService.insertUnit(unit)>0){
			return unit;
		}
		return null;
	}
}
