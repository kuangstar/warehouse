package com.zd.testing.business.service;

import com.zd.testing.business.model.User;

/**
 * @author kuangstar:
 * @version 2018年6月7日 上午9:13:25
 * 
 */
public interface UserService {
	User selectByUserName(String name);
}
