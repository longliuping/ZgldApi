package com.zgld.api.beans;

/**
 * AbstractAspnetOpenIdSettings entity provides the base persistence definition
 * of the AspnetOpenIdSettings entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAspnetOpenIdSettings implements
		java.io.Serializable {

	// Fields

	private String openIdType;
	private String name;
	private String description;
	private String settings;

	// Constructors

	/** default constructor */
	public AbstractAspnetOpenIdSettings() {
	}

	/** minimal constructor */
	public AbstractAspnetOpenIdSettings(String name, String settings) {
		this.name = name;
		this.settings = settings;
	}

	/** full constructor */
	public AbstractAspnetOpenIdSettings(String name, String description,
			String settings) {
		this.name = name;
		this.description = description;
		this.settings = settings;
	}

	// Property accessors

	public String getOpenIdType() {
		return this.openIdType;
	}

	public void setOpenIdType(String openIdType) {
		this.openIdType = openIdType;
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

	public String getSettings() {
		return this.settings;
	}

	public void setSettings(String settings) {
		this.settings = settings;
	}

}