/**
 * 
 */
package com.gwz.web.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gwz.entity.UserInfo;
import com.gwz.serviceimpl.UserInfoServiceImpl;

//import org.springframework.web.servlet.mvc.Controller;

/**
 * @author ming
 *
 */
@Controller
public class UserManagementController {

	/**
	 * 
	 */
	public UserManagementController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private UserInfoServiceImpl userService;
	/*public UserInfoServiceImpl getUserService() {
		return userService;
	}
	public void setUserService(UserInfoServiceImpl userService) {
		this.userService = userService;
	}*/
	private UserInfo user=new UserInfo();
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	@RequestMapping(value = "/usermanagement/login", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView Login(@ModelAttribute UserInfo user1,HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("/usermanagement/login");
		try {
			String ss=request.getParameter("loginName")==null?"test":request.getParameter("loginName");
			
			Map<String, Object> map = mv.getModel();
			UserInfo userInfo = new UserInfo();
			userInfo.setId(UUID.randomUUID());
			userInfo.setFirstName("Ming");
			userInfo.setLastName("Lu");
			userInfo.setLoginName(ss);
			userInfo.setEmail("ming.lu@outlook.com");
			userInfo.setGender(3);
			userInfo.setAddress("Suzhou City,Jiangsu province");
			
			map.put("user", userInfo);
			 
			mv.addObject("map", map);
						 
			userService.getUserInfoById(UUID.randomUUID());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}

	/*
	 * public org.springframework.web.servlet.ModelAndView
	 * handleRequest(HttpServletRequest request, HttpServletResponse response)
	 * throws Exception { // TODO Auto-generated method stub return null; }
	 */
}
