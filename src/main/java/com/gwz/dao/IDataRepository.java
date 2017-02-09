package com.gwz.dao;

import java.util.UUID;

public interface IDataRepository<T> {

	public void add(T t);
	public void update(T t);
	public boolean delete(T t);
	public T getById(UUID id);
}
