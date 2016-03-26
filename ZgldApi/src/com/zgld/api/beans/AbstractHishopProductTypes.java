package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopProductTypes entity provides the base persistence definition of
 * the HishopProductTypes entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopProductTypes implements java.io.Serializable {

	// Fields

	private Integer typeId;
	private String typeName;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractHishopProductTypes() {
	}

	/** minimal constructor */
	public AbstractHishopProductTypes(String typeName) {
		this.typeName = typeName;
	}

	// Property accessors

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}