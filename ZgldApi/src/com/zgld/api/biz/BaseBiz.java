package com.zgld.api.biz;

import java.io.Serializable;
import java.util.List;

import com.zgld.api.beans.AspnetUsers;

public interface BaseBiz {
	/**
	 * 分页查询
	 * 
	 * @param pageNum
	 *            当前�?
	 * @param pageSize
	 *            当前页要查询的数�?
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
	 * 删除�?��对象 删除数据
	 * 
	 * @param object
	 * @return
	 */
	public void delete(Object object);

	/**
	 * 查询�?��数据
	 * 
	 * @param hql
	 * @return
	 */
	public Object bean(String hql);

	/**
	 * 查询总数�?
	 * 
	 * @param hql
	 * @return
	 */
	public int count(String hql);

	/**
	 * 查询�?��数据 数据量少时�?使用
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
	 * 计算价格
	 * 
	 * @param hql
	 * @return
	 */
	public Object totalObject(String hql);

	/**
	 * 根据用户ID查询用户信息
	 * 
	 * @param userid
	 * @return
	 */
	public AspnetUsers findUserinfoByUserid(int userid);

	/**
	 * 根据用户名查询用户信�?
	 * 
	 * @param username
	 * @return
	 */
	public AspnetUsers findUserinfoByUserName(String username);

	/**
	 * 
	 * @param hql
	 * @return
	 */
	public Object getObjectInfo(String hql);

	/**
	 * 用户登录
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	public AspnetUsers login(String name, String password);

	/**
	 * 保存注册用户
	 * 
	 * @param aspnetUsers
	 */
	public int saveUserinfo(AspnetUsers aspnetUsers);
}
