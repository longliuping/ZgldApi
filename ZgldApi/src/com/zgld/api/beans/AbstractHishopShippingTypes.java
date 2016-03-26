package com.zgld.api.beans;

/**
 * AbstractHishopShippingTypes entity provides the base persistence definition
 * of the HishopShippingTypes entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopShippingTypes implements java.io.Serializable {

	// Fields

	private Integer modeId;
	private String name;
	private Integer templateId;
	private String description;
	private Integer displaySequence;

	// Constructors

	/** default constructor */
	public AbstractHishopShippingTypes() {
	}

	public Integer getModeId() {
		return modeId;
	}

	public void setModeId(Integer modeId) {
		this.modeId = modeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTemplateId() {
		return templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplaySequence() {
		return displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

}