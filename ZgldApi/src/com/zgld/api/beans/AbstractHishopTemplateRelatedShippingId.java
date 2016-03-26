package com.zgld.api.beans;

/**
 * AbstractHishopTemplateRelatedShippingId entity provides the base persistence
 * definition of the HishopTemplateRelatedShippingId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopTemplateRelatedShippingId implements java.io.Serializable {

	// Fields

	private Integer modeId;
	private String expressCompanyName;

	// Constructors

	/** default constructor */
	public AbstractHishopTemplateRelatedShippingId() {
	}

	/** full constructor */
	public AbstractHishopTemplateRelatedShippingId(Integer modeId, String expressCompanyName) {
		this.modeId = modeId;
		this.expressCompanyName = expressCompanyName;
	}

	// Property accessors

	public Integer getModeId() {
		return this.modeId;
	}

	public void setModeId(Integer modeId) {
		this.modeId = modeId;
	}

	public String getExpressCompanyName() {
		return this.expressCompanyName;
	}

	public void setExpressCompanyName(String expressCompanyName) {
		this.expressCompanyName = expressCompanyName;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopTemplateRelatedShippingId))
			return false;
		AbstractHishopTemplateRelatedShippingId castOther = (AbstractHishopTemplateRelatedShippingId) other;

		return ((this.getModeId() == castOther.getModeId()) || (this.getModeId() != null && castOther.getModeId() != null && this.getModeId().equals(castOther.getModeId()))) && ((this.getExpressCompanyName() == castOther.getExpressCompanyName()) || (this.getExpressCompanyName() != null && castOther.getExpressCompanyName() != null && this.getExpressCompanyName().equals(castOther.getExpressCompanyName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getModeId() == null ? 0 : this.getModeId().hashCode());
		result = 37 * result + (getExpressCompanyName() == null ? 0 : this.getExpressCompanyName().hashCode());
		return result;
	}

}