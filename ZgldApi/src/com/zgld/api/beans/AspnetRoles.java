package com.zgld.api.beans;

import java.util.Set;

/**
 * AspnetRoles entity. @author MyEclipse Persistence Tools
 */
public class AspnetRoles extends AbstractAspnetRoles implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AspnetRoles() {
	}

	/** minimal constructor */
	public AspnetRoles(String roleName, String loweredRoleName) {
		super(roleName, loweredRoleName);
	}

	/** full constructor */
	public AspnetRoles(String roleName, String loweredRoleName,
			String description, Set aspnetUsersInRoleses) {
		super(roleName, loweredRoleName, description, aspnetUsersInRoleses);
	}

}
