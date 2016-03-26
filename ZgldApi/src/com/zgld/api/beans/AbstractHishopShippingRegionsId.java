package com.zgld.api.beans;

/**
 * AbstractHishopShippingRegionsId entity provides the base persistence
 * definition of the HishopShippingRegionsId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopShippingRegionsId implements java.io.Serializable {

	// Fields

	private HishopShippingTemplates hishopShippingTemplates;
	private Integer regionId;

	// Constructors

	/** default constructor */
	public AbstractHishopShippingRegionsId() {
	}

	/** full constructor */
	public AbstractHishopShippingRegionsId(HishopShippingTemplates hishopShippingTemplates, Integer regionId) {
		this.hishopShippingTemplates = hishopShippingTemplates;
		this.regionId = regionId;
	}

	// Property accessors

	public HishopShippingTemplates getHishopShippingTemplates() {
		return this.hishopShippingTemplates;
	}

	public void setHishopShippingTemplates(HishopShippingTemplates hishopShippingTemplates) {
		this.hishopShippingTemplates = hishopShippingTemplates;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopShippingRegionsId))
			return false;
		AbstractHishopShippingRegionsId castOther = (AbstractHishopShippingRegionsId) other;

		return ((this.getHishopShippingTemplates() == castOther.getHishopShippingTemplates()) || (this.getHishopShippingTemplates() != null && castOther.getHishopShippingTemplates() != null && this.getHishopShippingTemplates().equals(castOther.getHishopShippingTemplates()))) && ((this.getRegionId() == castOther.getRegionId()) || (this.getRegionId() != null && castOther.getRegionId() != null && this.getRegionId().equals(castOther.getRegionId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHishopShippingTemplates() == null ? 0 : this.getHishopShippingTemplates().hashCode());
		result = 37 * result + (getRegionId() == null ? 0 : this.getRegionId().hashCode());
		return result;
	}

}