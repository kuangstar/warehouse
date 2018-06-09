package com.zd.warehouse.business.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.WebUtils;

import com.zd.warehouse.business.model.User;
import com.zd.warehouse.business.service.UserService;
import com.zd.warehouse.business.util.ShiroUtils;

/**
 * @author kuangstar:
 * @version 2018年6月7日 上午9:31:18
 * 
 */
@Controller
@RequestMapping("/user")
public class UserController {
	public static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Resource
	private UserService userService;
	
	@RequestMapping("/login")
	public String login(String userName,String password,Model model,HttpServletRequest req){
		String error = null;
		try {
			Subject subject = SecurityUtils.getSubject();
			Session session = subject.getSession();
			if(subject.isAuthenticated()){
				logger.debug("--------------------->"+session.getAttribute("userInfo").toString());
				return "redirect:/page/home";
			}
			if(""==userName||""==password){//用户名密码未输入
				model.addAttribute("error", "用户参数错误！");
				return "LOGIN";
			}
			final User user = userService.selectByUserName(userName);
			
//			password = ShiroUtils.encryptPassword(password, userName);
			UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
			subject.login(token);
			session.setAttribute("userInfo", user);
		} catch (LockedAccountException e) {
			error = "登录失败3次，账户已被锁定 ，请3分钟后再试！";
		} catch (DisabledAccountException e) {
			error = "该账户已被禁用 ，请联系管理员！";
		} catch (UnknownAccountException e) {
			error = "该账户不存在 ！";
		} catch (IncorrectCredentialsException e) {
			error = "用户名或密码错误 ！";
		} catch (AuthenticationException e) {
			error = e.getMessage() + "！";
		}catch(NullPointerException e ){//直接输入 url 时
			return "LOGIN";
		}
		if (null != error) {
			model.addAttribute("error", error);
			return "LOGIN";
		} else {
			return "redirect:/page/home";
		}
	}
	
}
