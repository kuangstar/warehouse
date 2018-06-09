package com.zd.warehouse.business.service;

import com.zd.warehouse.business.model.User;

/**
 * @author kuangstar:
 * @version 2018年6月7日 上午9:13:25
 * 
 */
public interface UserService {
	User selectByUserName(String name);
}
