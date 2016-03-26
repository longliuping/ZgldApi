package com.zgld.api.beans;

/**
 * AbstractHishopSkuitemsId entity provides the base persistence definition of
 * the HishopSkuitemsId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopSkuitemsId implements java.io.Serializable {

	// Fields

	private HishopSkus hishopSkus;
	private Integer attributeId;

	// Constructors

	/** default constructor */
	public AbstractHishopSkuitemsId() {
	}

	/** full constructor */
	public AbstractHishopSkuitemsId(HishopSkus hishopSkus, Integer attributeId) {
		this.hishopSkus = hishopSkus;
		this.attributeId = attributeId;
	}

	// Property accessors

	public HishopSkus getHishopSkus() {
		return this.hishopSkus;
	}

	public void setHishopSkus(HishopSkus hishopSkus) {
		this.hishopSkus = hishopSkus;
	}

	public Integer getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(Integer attributeId) {
		this.attributeId = attributeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopSkuitemsId))
			return false;
		AbstractHishopSkuitemsId castOther = (AbstractHishopSkuitemsId) other;

		return ((this.getHishopSkus() == castOther.getHishopSkus()) || (this.getHishopSkus() != null && castOther.getHishopSkus() != null && this.getHishopSkus().equals(castOther.getHishopSkus()))) && ((this.getAttributeId() == castOther.getAttributeId()) || (this.getAttributeId() != null && castOther.getAttributeId() != null && this.getAttributeId().equals(castOther.getAttributeId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHishopSkus() == null ? 0 : this.getHishopSkus().hashCode());
		result = 37 * result + (getAttributeId() == null ? 0 : this.getAttributeId().hashCode());
		return result;
	}

}