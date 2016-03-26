package com.zgld.api.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao {
	/**
	 * 分页查询
	 * 
	 * @param pageNum
	 *            当前页
	 * @param pageSize
	 *            当前页要查询的数量
	 * @param hql
	 *            hql语句
	 * @return
	 */
	public List<?> findPage(int pageNum, int pageSize, String hql);

	/**
	 * 更新对象
	 * 
	 * @param object
	 * @return
	 */
	public void update(Object object);

	/**
	 * 保存数据 添加数据 插入数据
	 * 
	 * @param object
	 * @return
	 */
	public Serializable save(Object object);

	/**
	 * 删除一个对象 删除数据
	 * 
	 * @param object
	 * @return
	 */
	public void delete(Object object);

	/**
	 * 查询一条数据
	 * 
	 * @param hql
	 * @return
	 */
	public Object bean(String hql);

	/**
	 * 查询总数量
	 * 
	 * @param hql
	 * @return
	 */
	public Long count(String hql);

	/**
	 * 查询所有数据 数据量少时候使用
	 * 
	 * @param hql
	 * @return
	 */
	public List<?> findAll(String hql);

	/**
	 * 批量更新
	 * 
	 * @param hql
	 */
	public void updateListObject(String hql);

	/**
	 * 统计
	 * 
	 * @param hql
	 * @return
	 */
	public Object totalObject(String hql);

	public Object getObjectInfo(String hql);
}
