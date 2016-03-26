package com.zgld.api.beans;

/**
 * AbstractHishopPrivilegeInRolesId entity provides the base persistence
 * definition of the HishopPrivilegeInRolesId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopPrivilegeInRolesId implements java.io.Serializable {

	// Fields

	private String roleId;
	private Integer privilege;

	// Constructors

	/** default constructor */
	public AbstractHishopPrivilegeInRolesId() {
	}

	/** full constructor */
	public AbstractHishopPrivilegeInRolesId(String roleId, Integer privilege) {
		this.roleId = roleId;
		this.privilege = privilege;
	}

	// Property accessors

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Integer getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(Integer privilege) {
		this.privilege = privilege;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopPrivilegeInRolesId))
			return false;
		AbstractHishopPrivilegeInRolesId castOther = (AbstractHishopPrivilegeInRolesId) other;

		return ((this.getRoleId() == castOther.getRoleId()) || (this.getRoleId() != null && castOther.getRoleId() != null && this.getRoleId().equals(castOther.getRoleId()))) && ((this.getPrivilege() == castOther.getPrivilege()) || (this.getPrivilege() != null && castOther.getPrivilege() != null && this.getPrivilege().equals(castOther.getPrivilege())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRoleId() == null ? 0 : this.getRoleId().hashCode());
		result = 37 * result + (getPrivilege() == null ? 0 : this.getPrivilege().hashCode());
		return result;
	}

}