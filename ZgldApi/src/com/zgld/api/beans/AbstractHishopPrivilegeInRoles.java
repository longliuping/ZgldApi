package com.zgld.api.beans;

/**
 * AbstractHishopPrivilegeInRoles entity provides the base persistence
 * definition of the HishopPrivilegeInRoles entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopPrivilegeInRoles implements
		java.io.Serializable {

	// Fields

	private HishopPrivilegeInRolesId id;

	// Constructors

	/** default constructor */
	public AbstractHishopPrivilegeInRoles() {
	}

	/** full constructor */
	public AbstractHishopPrivilegeInRoles(HishopPrivilegeInRolesId id) {
		this.id = id;
	}

	// Property accessors

	public HishopPrivilegeInRolesId getId() {
		return this.id;
	}

	public void setId(HishopPrivilegeInRolesId id) {
		this.id = id;
	}

}