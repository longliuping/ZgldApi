package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Set;

/**
 * AspnetUsers entity. @author MyEclipse Persistence Tools
 */
public class AspnetUsers extends AbstractAspnetUsers implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AspnetUsers() {
	}
	UserToken userToken;
	public UserToken getUserToken() {
		return userToken;
	}
	public void setUserToken(UserToken userToken) {
		this.userToken = userToken;
	}
}
