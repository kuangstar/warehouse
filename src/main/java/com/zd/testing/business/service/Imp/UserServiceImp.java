package com.zd.testing.business.service.Imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zd.testing.business.mapper.UserMapper;
import com.zd.testing.business.model.User;
import com.zd.testing.business.service.UserService;

/**
 * @author kuangstar:
 * @version 2018年6月7日 上午9:18:04
 * 
 */
@Service
public class UserServiceImp implements UserService {
	@Resource
	private UserMapper usermapper;
	
	@Override
	public User selectByUserName(String name) {
		User u = usermapper.selectByUserName(name);
		return u;
	}
}
