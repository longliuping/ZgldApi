package com.zgld.api.beans;

/**
 * AspnetUsersInRoles entity. @author MyEclipse Persistence Tools
 */
public class AspnetUsersInRoles extends AbstractAspnetUsersInRoles implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AspnetUsersInRoles() {
	}

	/** full constructor */
	public AspnetUsersInRoles(AspnetUsersInRolesId id) {
		super(id);
	}
	int userId;
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	String roleId;
	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
}
