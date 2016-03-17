package com.zgld.api.beans;

/**
 * AspnetOpenIdSettings entity. @author MyEclipse Persistence Tools
 */
public class AspnetOpenIdSettings extends AbstractAspnetOpenIdSettings
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AspnetOpenIdSettings() {
	}

	/** minimal constructor */
	public AspnetOpenIdSettings(String name, String settings) {
		super(name, settings);
	}

	/** full constructor */
	public AspnetOpenIdSettings(String name, String description, String settings) {
		super(name, description, settings);
	}

}
