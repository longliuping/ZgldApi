package com.zgld.api.beans;

/**
 * AbstractAspnetUsersInRolesId entity provides the base persistence definition
 * of the AspnetUsersInRolesId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAspnetUsersInRolesId implements java.io.Serializable {

	// Fields

	private AspnetUsers aspnetUsers;
	private AspnetRoles aspnetRoles;

	// Constructors

	/** default constructor */
	public AbstractAspnetUsersInRolesId() {
	}

	/** full constructor */
	public AbstractAspnetUsersInRolesId(AspnetUsers aspnetUsers, AspnetRoles aspnetRoles) {
		this.aspnetUsers = aspnetUsers;
		this.aspnetRoles = aspnetRoles;
	}

	// Property accessors

	public AspnetUsers getAspnetUsers() {
		return this.aspnetUsers;
	}

	public void setAspnetUsers(AspnetUsers aspnetUsers) {
		this.aspnetUsers = aspnetUsers;
	}

	public AspnetRoles getAspnetRoles() {
		return this.aspnetRoles;
	}

	public void setAspnetRoles(AspnetRoles aspnetRoles) {
		this.aspnetRoles = aspnetRoles;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractAspnetUsersInRolesId))
			return false;
		AbstractAspnetUsersInRolesId castOther = (AbstractAspnetUsersInRolesId) other;

		return ((this.getAspnetUsers() == castOther.getAspnetUsers()) || (this.getAspnetUsers() != null && castOther.getAspnetUsers() != null && this.getAspnetUsers().equals(castOther.getAspnetUsers()))) && ((this.getAspnetRoles() == castOther.getAspnetRoles()) || (this.getAspnetRoles() != null && castOther.getAspnetRoles() != null && this.getAspnetRoles().equals(castOther.getAspnetRoles())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getAspnetUsers() == null ? 0 : this.getAspnetUsers().hashCode());
		result = 37 * result + (getAspnetRoles() == null ? 0 : this.getAspnetRoles().hashCode());
		return result;
	}

}