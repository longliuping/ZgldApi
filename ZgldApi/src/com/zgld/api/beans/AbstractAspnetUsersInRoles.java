package com.zgld.api.beans;

/**
 * AbstractAspnetUsersInRoles entity provides the base persistence definition of
 * the AspnetUsersInRoles entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAspnetUsersInRoles implements
		java.io.Serializable {

	// Fields

	private AspnetUsersInRolesId id;

	// Constructors

	/** default constructor */
	public AbstractAspnetUsersInRoles() {
	}

	/** full constructor */
	public AbstractAspnetUsersInRoles(AspnetUsersInRolesId id) {
		this.id = id;
	}

	// Property accessors

	public AspnetUsersInRolesId getId() {
		return this.id;
	}

	public void setId(AspnetUsersInRolesId id) {
		this.id = id;
	}

}