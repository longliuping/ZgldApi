package com.zgld.api.beans;

/**
 * AbstractHishopIntegrationSettings entity provides the base persistence
 * definition of the HishopIntegrationSettings entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopIntegrationSettings implements java.io.Serializable {

	// Fields

	private HishopIntegrationSettingsId id;

	// Constructors

	/** default constructor */
	public AbstractHishopIntegrationSettings() {
	}

	/** full constructor */
	public AbstractHishopIntegrationSettings(HishopIntegrationSettingsId id) {
		this.id = id;
	}

	// Property accessors

	public HishopIntegrationSettingsId getId() {
		return this.id;
	}

	public void setId(HishopIntegrationSettingsId id) {
		this.id = id;
	}

}