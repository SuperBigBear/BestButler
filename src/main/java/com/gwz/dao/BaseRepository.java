package com.gwz.dao;

import java.util.UUID;

public class BaseRepository implements IDataRepository{

	/*
	 * save new entity into database
	 * @see com.gwz.dao.IDataRepository#add(java.lang.Object)
	 */
	@Override
	public void add(Object t) {
		
		
	}

	@Override
	public void update(Object t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean delete(Object t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	public BaseRepository() {
		// TODO Auto-generated constructor stub
	}

}
