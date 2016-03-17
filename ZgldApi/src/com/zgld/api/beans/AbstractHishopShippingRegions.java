package com.zgld.api.beans;

/**
 * AbstractHishopShippingRegions entity provides the base persistence definition
 * of the HishopShippingRegions entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopShippingRegions implements
		java.io.Serializable {

	// Fields

	private HishopShippingRegionsId id;
	private Integer groupId;

	// Constructors

	/** default constructor */
	public AbstractHishopShippingRegions() {
	}

	/** full constructor */
	public AbstractHishopShippingRegions(HishopShippingRegionsId id,
			Integer groupId) {
		this.id = id;
		this.groupId = groupId;
	}

	// Property accessors

	public HishopShippingRegionsId getId() {
		return this.id;
	}

	public void setId(HishopShippingRegionsId id) {
		this.id = id;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

}