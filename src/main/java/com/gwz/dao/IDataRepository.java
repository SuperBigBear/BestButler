package com.gwz.dao;

import java.util.UUID;

public interface IDataRepository<T> {

	public void Add(T t);
	public void Update(T t);
	public boolean Delete(T t);
	public T GetById(UUID id);
}
