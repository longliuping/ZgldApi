package com.zgld.api.beans;

/**
 * AbstractHishopIntegrationSettingsId entity provides the base persistence
 * definition of the HishopIntegrationSettingsId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopIntegrationSettingsId implements java.io.Serializable {

	// Fields

	private Integer integrationForumId;
	private String applicationName;
	private String integrationForumXml;
	private Boolean isOff;
	private Boolean isUsing;
	private String integrationForumUrl;

	// Constructors

	/** default constructor */
	public AbstractHishopIntegrationSettingsId() {
	}

	/** full constructor */
	public AbstractHishopIntegrationSettingsId(Integer integrationForumId, String applicationName, String integrationForumXml, Boolean isOff, Boolean isUsing, String integrationForumUrl) {
		this.integrationForumId = integrationForumId;
		this.applicationName = applicationName;
		this.integrationForumXml = integrationForumXml;
		this.isOff = isOff;
		this.isUsing = isUsing;
		this.integrationForumUrl = integrationForumUrl;
	}

	// Property accessors

	public Integer getIntegrationForumId() {
		return this.integrationForumId;
	}

	public void setIntegrationForumId(Integer integrationForumId) {
		this.integrationForumId = integrationForumId;
	}

	public String getApplicationName() {
		return this.applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getIntegrationForumXml() {
		return this.integrationForumXml;
	}

	public void setIntegrationForumXml(String integrationForumXml) {
		this.integrationForumXml = integrationForumXml;
	}

	public Boolean getIsOff() {
		return this.isOff;
	}

	public void setIsOff(Boolean isOff) {
		this.isOff = isOff;
	}

	public Boolean getIsUsing() {
		return this.isUsing;
	}

	public void setIsUsing(Boolean isUsing) {
		this.isUsing = isUsing;
	}

	public String getIntegrationForumUrl() {
		return this.integrationForumUrl;
	}

	public void setIntegrationForumUrl(String integrationForumUrl) {
		this.integrationForumUrl = integrationForumUrl;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopIntegrationSettingsId))
			return false;
		AbstractHishopIntegrationSettingsId castOther = (AbstractHishopIntegrationSettingsId) other;

		return ((this.getIntegrationForumId() == castOther.getIntegrationForumId()) || (this.getIntegrationForumId() != null && castOther.getIntegrationForumId() != null && this.getIntegrationForumId().equals(castOther.getIntegrationForumId()))) && ((this.getApplicationName() == castOther.getApplicationName()) || (this.getApplicationName() != null && castOther.getApplicationName() != null && this.getApplicationName().equals(castOther.getApplicationName()))) && ((this.getIntegrationForumXml() == castOther.getIntegrationForumXml()) || (this.getIntegrationForumXml() != null && castOther.getIntegrationForumXml() != null && this.getIntegrationForumXml().equals(castOther.getIntegrationForumXml())))
				&& ((this.getIsOff() == castOther.getIsOff()) || (this.getIsOff() != null && castOther.getIsOff() != null && this.getIsOff().equals(castOther.getIsOff()))) && ((this.getIsUsing() == castOther.getIsUsing()) || (this.getIsUsing() != null && castOther.getIsUsing() != null && this.getIsUsing().equals(castOther.getIsUsing()))) && ((this.getIntegrationForumUrl() == castOther.getIntegrationForumUrl()) || (this.getIntegrationForumUrl() != null && castOther.getIntegrationForumUrl() != null && this.getIntegrationForumUrl().equals(castOther.getIntegrationForumUrl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIntegrationForumId() == null ? 0 : this.getIntegrationForumId().hashCode());
		result = 37 * result + (getApplicationName() == null ? 0 : this.getApplicationName().hashCode());
		result = 37 * result + (getIntegrationForumXml() == null ? 0 : this.getIntegrationForumXml().hashCode());
		result = 37 * result + (getIsOff() == null ? 0 : this.getIsOff().hashCode());
		result = 37 * result + (getIsUsing() == null ? 0 : this.getIsUsing().hashCode());
		result = 37 * result + (getIntegrationForumUrl() == null ? 0 : this.getIntegrationForumUrl().hashCode());
		return result;
	}

}