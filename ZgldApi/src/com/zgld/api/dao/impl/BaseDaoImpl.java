package com.zgld.api.dao.impl;

import java.io.Serializable;
import java.util.List;

import com.zgld.api.base.BaseHibernateDaoSupport;
import com.zgld.api.dao.BaseDao;

public class BaseDaoImpl extends BaseHibernateDaoSupport implements BaseDao, Cloneable {

	public List<Object> findPage(int pageNum, int pageSize, String hql) {
		// TODO Auto-generated method stub
		return findObjectPage(pageNum, pageSize, hql);
	}

	public Long count(String hql) {
		// TODO Auto-generated method stub
		return countObject(hql);
	}

	public void delete(Object object) {
		// TODO Auto-generated method stub
		deleteObject(object);
	}

	public Serializable save(Object object) {
		// TODO Auto-generated method stub
		return saveObject(object);
	}

	public void update(Object object) {
		// TODO Auto-generated method stub
		updateObject(object);
	}

	public Object bean(String hql) {
		// TODO Auto-generated method stub
		return beanObject(hql);
	}

	public List<Object> findAll(String hql) {
		// TODO Auto-generated method stub
		return (List<Object>) findAllObject(hql);
	}

	public void updateListObject(String hql) {
		// TODO Auto-generated method stub
		updateAllObject(hql);
	}

	public Object totalObject(String hql) {
		// TODO Auto-generated method stub
		return totalObject(hql);
	}

	public Object getObjectInfo(String hql) {
		// TODO Auto-generated method stub
		return beanObject(hql);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
