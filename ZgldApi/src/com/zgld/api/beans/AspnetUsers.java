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
	AspnetMembers aspnetMembers;
	public UserToken getUserToken() {
		return userToken;
	}
	public void setUserToken(UserToken userToken) {
		this.userToken = userToken;
	}
	public AspnetMembers getAspnetMembers() {
		return aspnetMembers;
	}
	public void setAspnetMembers(AspnetMembers aspnetMembers) {
		this.aspnetMembers = aspnetMembers;
	}
	
}
