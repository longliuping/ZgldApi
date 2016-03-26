package com.zgld.api.beans;

/**
 * AbstractHishopPaymentTypes entity provides the base persistence definition of
 * the HishopPaymentTypes entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopPaymentTypes implements java.io.Serializable {

	// Fields

	private Integer modeId;
	private String name;
	private String description;
	private String gateway;
	private Integer displaySequence;
	private Boolean isUseInpour;
	private Double charge;
	private Boolean isPercent;
	private String applicationType;
	private String settings;

	// Constructors

	/** default constructor */
	public AbstractHishopPaymentTypes() {
	}

	/** minimal constructor */
	public AbstractHishopPaymentTypes(String name, Integer displaySequence, Boolean isUseInpour, Double charge, Boolean isPercent, String applicationType) {
		this.name = name;
		this.displaySequence = displaySequence;
		this.isUseInpour = isUseInpour;
		this.charge = charge;
		this.isPercent = isPercent;
		this.applicationType = applicationType;
	}

	/** full constructor */
	public AbstractHishopPaymentTypes(String name, String description, String gateway, Integer displaySequence, Boolean isUseInpour, Double charge, Boolean isPercent, String applicationType, String settings) {
		this.name = name;
		this.description = description;
		this.gateway = gateway;
		this.displaySequence = displaySequence;
		this.isUseInpour = isUseInpour;
		this.charge = charge;
		this.isPercent = isPercent;
		this.applicationType = applicationType;
		this.settings = settings;
	}

	// Property accessors

	public Integer getModeId() {
		return this.modeId;
	}

	public void setModeId(Integer modeId) {
		this.modeId = modeId;
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

	public String getGateway() {
		return this.gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public Boolean getIsUseInpour() {
		return this.isUseInpour;
	}

	public void setIsUseInpour(Boolean isUseInpour) {
		this.isUseInpour = isUseInpour;
	}

	public Double getCharge() {
		return this.charge;
	}

	public void setCharge(Double charge) {
		this.charge = charge;
	}

	public Boolean getIsPercent() {
		return this.isPercent;
	}

	public void setIsPercent(Boolean isPercent) {
		this.isPercent = isPercent;
	}

	public String getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}

	public String getSettings() {
		return this.settings;
	}

	public void setSettings(String settings) {
		this.settings = settings;
	}

}