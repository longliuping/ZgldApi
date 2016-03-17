package com.zgld.api.beans;

/**
 * AbstractHishopSkuitems entity provides the base persistence definition of the
 * HishopSkuitems entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopSkuitems implements java.io.Serializable {
	// Constructors

	/** default constructor */
	public AbstractHishopSkuitems() {
	}
	// Fields
	
	private String skuId;
	private Integer attributeId;
	private Integer valueId;
	public String getSkuId() {
		return skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	public Integer getAttributeId() {
		return attributeId;
	}
	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}
	public Integer getValueId() {
		return valueId;
	}
	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}

}