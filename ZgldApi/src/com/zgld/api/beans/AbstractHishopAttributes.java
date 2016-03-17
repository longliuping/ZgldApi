package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopAttributes entity provides the base persistence definition of
 * the HishopAttributes entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopAttributes implements java.io.Serializable {

	// Fields

	private Integer attributeId;
	private String attributeName;
	private Integer displaySequence;
	private Integer usageMode;
	private Boolean useAttributeImage;

	// Constructors

	/** default constructor */
	public AbstractHishopAttributes() {
	}

	// Property accessors

	public Integer getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public Integer getUsageMode() {
		return this.usageMode;
	}

	public void setUsageMode(Integer usageMode) {
		this.usageMode = usageMode;
	}

	public Boolean getUseAttributeImage() {
		return this.useAttributeImage;
	}

	public void setUseAttributeImage(Boolean useAttributeImage) {
		this.useAttributeImage = useAttributeImage;
	}
}