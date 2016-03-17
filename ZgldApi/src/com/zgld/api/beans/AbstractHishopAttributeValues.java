package com.zgld.api.beans;

/**
 * AbstractHishopAttributeValues entity provides the base persistence definition
 * of the HishopAttributeValues entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopAttributeValues implements
		java.io.Serializable {

	// Fields

	private Integer valueId;
	private Integer displaySequence;
	private String valueStr;
	private String imageUrl;

	// Constructors

	/** default constructor */
	public AbstractHishopAttributeValues() {
	}

	// Property accessors

	public Integer getValueId() {
		return this.valueId;
	}

	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public String getValueStr() {
		return this.valueStr;
	}

	public void setValueStr(String valueStr) {
		this.valueStr = valueStr;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}