package com.zgld.api.beans;

/**
 * AbstractHishopProductAttributesId entity provides the base persistence
 * definition of the HishopProductAttributesId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopProductAttributesId implements java.io.Serializable {

	// Fields

	private HishopProducts hishopProducts;
	private HishopAttributes hishopAttributes;
	private Integer valueId;

	// Constructors

	/** default constructor */
	public AbstractHishopProductAttributesId() {
	}

	/** full constructor */
	public AbstractHishopProductAttributesId(HishopProducts hishopProducts, HishopAttributes hishopAttributes, Integer valueId) {
		this.hishopProducts = hishopProducts;
		this.hishopAttributes = hishopAttributes;
		this.valueId = valueId;
	}

	// Property accessors

	public HishopProducts getHishopProducts() {
		return this.hishopProducts;
	}

	public void setHishopProducts(HishopProducts hishopProducts) {
		this.hishopProducts = hishopProducts;
	}

	public HishopAttributes getHishopAttributes() {
		return this.hishopAttributes;
	}

	public void setHishopAttributes(HishopAttributes hishopAttributes) {
		this.hishopAttributes = hishopAttributes;
	}

	public Integer getValueId() {
		return this.valueId;
	}

	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopProductAttributesId))
			return false;
		AbstractHishopProductAttributesId castOther = (AbstractHishopProductAttributesId) other;

		return ((this.getHishopProducts() == castOther.getHishopProducts()) || (this.getHishopProducts() != null && castOther.getHishopProducts() != null && this.getHishopProducts().equals(castOther.getHishopProducts()))) && ((this.getHishopAttributes() == castOther.getHishopAttributes()) || (this.getHishopAttributes() != null && castOther.getHishopAttributes() != null && this.getHishopAttributes().equals(castOther.getHishopAttributes()))) && ((this.getValueId() == castOther.getValueId()) || (this.getValueId() != null && castOther.getValueId() != null && this.getValueId().equals(castOther.getValueId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHishopProducts() == null ? 0 : this.getHishopProducts().hashCode());
		result = 37 * result + (getHishopAttributes() == null ? 0 : this.getHishopAttributes().hashCode());
		result = 37 * result + (getValueId() == null ? 0 : this.getValueId().hashCode());
		return result;
	}

}