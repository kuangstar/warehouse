package com.zd.testing.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kuangstar:
 * @version 2018年6月7日 下午3:28:23
 * 
 */
@Controller
@RequestMapping("/page")
public class PageController {
	@RequestMapping("/home")
	public String home(){
		return "index";
	}
	@RequestMapping("/database/goods")
	public String databaseGoods(){
		return "database-goods";
	}
}
