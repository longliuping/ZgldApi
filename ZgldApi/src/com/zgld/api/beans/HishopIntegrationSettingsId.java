package com.zgld.api.beans;

/**
 * HishopIntegrationSettingsId entity. @author MyEclipse Persistence Tools
 */
public class HishopIntegrationSettingsId extends
		AbstractHishopIntegrationSettingsId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopIntegrationSettingsId() {
	}

	/** full constructor */
	public HishopIntegrationSettingsId(Integer integrationForumId,
			String applicationName, String integrationForumXml, Boolean isOff,
			Boolean isUsing, String integrationForumUrl) {
		super(integrationForumId, applicationName, integrationForumXml, isOff,
				isUsing, integrationForumUrl);
	}

}
