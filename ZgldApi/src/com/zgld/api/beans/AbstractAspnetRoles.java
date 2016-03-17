package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAspnetRoles entity provides the base persistence definition of the
 * AspnetRoles entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAspnetRoles implements java.io.Serializable {

	// Fields

	private String roleId;
	private String roleName;
	private String loweredRoleName;
	private String description;
	private Set aspnetUsersInRoleses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAspnetRoles() {
	}

	/** minimal constructor */
	public AbstractAspnetRoles(String roleName, String loweredRoleName) {
		this.roleName = roleName;
		this.loweredRoleName = loweredRoleName;
	}

	/** full constructor */
	public AbstractAspnetRoles(String roleName, String loweredRoleName,
			String description, Set aspnetUsersInRoleses) {
		this.roleName = roleName;
		this.loweredRoleName = loweredRoleName;
		this.description = description;
		this.aspnetUsersInRoleses = aspnetUsersInRoleses;
	}

	// Property accessors

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getLoweredRoleName() {
		return this.loweredRoleName;
	}

	public void setLoweredRoleName(String loweredRoleName) {
		this.loweredRoleName = loweredRoleName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set getAspnetUsersInRoleses() {
		return this.aspnetUsersInRoleses;
	}

	public void setAspnetUsersInRoleses(Set aspnetUsersInRoleses) {
		this.aspnetUsersInRoleses = aspnetUsersInRoleses;
	}

}