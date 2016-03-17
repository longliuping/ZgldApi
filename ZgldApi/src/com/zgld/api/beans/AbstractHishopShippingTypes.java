package com.zgld.api.beans;

/**
 * AbstractHishopShippingTypes entity provides the base persistence definition
 * of the HishopShippingTypes entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopShippingTypes implements
		java.io.Serializable {

	// Fields

	private Integer modeId;
	private HishopShippingTemplates hishopShippingTemplates;
	private String name;
	private String description;
	private Integer displaySequence;

	// Constructors

	/** default constructor */
	public AbstractHishopShippingTypes() {
	}

	/** minimal constructor */
	public AbstractHishopShippingTypes(
			HishopShippingTemplates hishopShippingTemplates, String name,
			Integer displaySequence) {
		this.hishopShippingTemplates = hishopShippingTemplates;
		this.name = name;
		this.displaySequence = displaySequence;
	}

	/** full constructor */
	public AbstractHishopShippingTypes(
			HishopShippingTemplates hishopShippingTemplates, String name,
			String description, Integer displaySequence) {
		this.hishopShippingTemplates = hishopShippingTemplates;
		this.name = name;
		this.description = description;
		this.displaySequence = displaySequence;
	}

	// Property accessors

	public Integer getModeId() {
		return this.modeId;
	}

	public void setModeId(Integer modeId) {
		this.modeId = modeId;
	}

	public HishopShippingTemplates getHishopShippingTemplates() {
		return this.hishopShippingTemplates;
	}

	public void setHishopShippingTemplates(
			HishopShippingTemplates hishopShippingTemplates) {
		this.hishopShippingTemplates = hishopShippingTemplates;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

}