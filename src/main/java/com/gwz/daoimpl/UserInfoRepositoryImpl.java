package com.gwz.daoimpl;

import java.util.UUID;

import com.gwz.dao.BaseRepository;
import com.gwz.dao.IDataRepository;
import com.gwz.entity.UserInfo;

public class UserInfoRepositoryImpl extends BaseRepository 
 implements IDataRepository<UserInfo> {

	@Override
	public void Add(UserInfo user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Update(UserInfo user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean Delete(UserInfo t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserInfo GetById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserInfoRepositoryImpl() {
		// TODO Auto-generated constructor stub
	}

}
