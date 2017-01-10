package com.gwz.serviceimpl;

import java.util.UUID;

import com.gwz.entity.UserInfo;
import com.gwz.service.IUserBase;

public class UserInfoServiceImpl implements IUserBase {

	public UserInfoServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public UserInfo getUserInfoById(UUID userId)
	{
		UserInfo userInfo=new UserInfo();
		
		return userInfo;
				
	}
}
