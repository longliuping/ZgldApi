package com.zgld.api.biz.impl;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.zgld.api.beans.AspnetUsers;
import com.zgld.api.biz.BaseBiz;
import com.zgld.api.dao.BaseDao;

public class BaseBizImpl implements BaseBiz {
	private BaseDao baseDao;

	public BaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	public Object bean(String hql) {
		// TODO Auto-generated method stub
		return baseDao.bean(hql);
	}

	public int count(String hql) {
		// TODO Auto-generated method stub
		return baseDao.count(hql).intValue();
	}

	public void delete(Object object) {
		// TODO Auto-generated method stub
		baseDao.delete(object);
	}

	public List<?> findAll(String hql) {
		// TODO Auto-generated method stub
		return baseDao.findAll(hql);
	}

	public List<?> findPage(int pageNum, int pageSize, String hql) {
		// TODO Auto-generated method stub
		return baseDao.findPage(pageNum, pageSize, hql);
	}

	public Serializable save(Object object) {
		// TODO Auto-generated method stub
		return baseDao.save(object);
	}

	public Object totalObject(String hql) {
		// TODO Auto-generated method stub
		return baseDao.totalObject(hql);
	}

	public void update(Object object) {
		// TODO Auto-generated method stub
		baseDao.update(object);
	}

	public void updateListObject(String hql) {
		// TODO Auto-generated method stub
		baseDao.updateListObject(hql);
	}


	public AspnetUsers findUserinfoByUserid(int userid) {
		// TODO Auto-generated method stub
		return (AspnetUsers) baseDao.bean(" from AspnetUsers as u where u.userId = " + userid + "");
	}

	public AspnetUsers findUserinfoByUserName(String username) {
		// TODO Auto-generated method stub
		return (AspnetUsers) baseDao.bean(" from AspnetUsers as u where u.userName = '" + username + "' order by u.userId desc ");
	}

	public Object getObjectInfo(String hql) {
		// TODO Auto-generated method stub
		return baseDao.bean(hql);
	}

	public AspnetUsers login(String name, String password) {
		// TODO Auto-generated method stub
		return (AspnetUsers) baseDao.bean(" from AspnetUsers as au where au.userName = '" + name + "' and au.password = '" + password + "'");
	}

	public int saveUserinfo(AspnetUsers aspnetUsers) {
		// TODO Auto-generated method stub
		AspnetUsers user = new AspnetUsers();
		Timestamp timestamp = new Timestamp(new Date().getTime());
		user.setBirthDate(timestamp);
		user.setComment("");
		user.setCreateDate(timestamp);
		user.setEmail("");
//		user.setExamineStuart(0);
		user.setFailedPasswordAnswerAttemptCount(0);
		user.setFailedPasswordAnswerAttemptWindowStart(timestamp);
		user.setFailedPasswordAttemptCount(0);
		user.setFailedPasswordAttemptWindowStart(timestamp);
		user.setGender(0);
		user.setIsAnonymous(false);
		user.setIsApproved(true);
		user.setIsLockedOut(false);
		user.setLastActivityDate(timestamp);
		user.setLastLockoutDate(timestamp);
		user.setLastLoginDate(timestamp);
		user.setLastPasswordChangedDate(timestamp);
		user.setLoweredEmail("");
		user.setLoweredUserName(aspnetUsers.getUserName());
		user.setMobilePin("");
		user.setOpenId("");
		user.setOpenIdType("");
		user.setPassword(aspnetUsers.getPassword());
		user.setPasswordAnswer("");
		user.setPasswordFormat(0);
		user.setPasswordQuestion("");
		user.setPasswordSalt("Pk/7BGUlLz6gdA9kn4qMVQ==");
		user.setSessionId("1C71E9CD-117A-4A81-97FF-2EBF5201B993");
		user.setUserName(aspnetUsers.getUserName());
		user.setUserRole(0);
		return Integer.parseInt(baseDao.save(user).toString());
	}
}
