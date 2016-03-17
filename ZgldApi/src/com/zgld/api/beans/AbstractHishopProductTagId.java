package com.zgld.api.beans;

/**
 * AbstractHishopProductTagId entity provides the base persistence definition of
 * the HishopProductTagId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopProductTagId implements
		java.io.Serializable {

	// Fields

	private Integer tagId;
	private HishopProducts hishopProducts;

	// Constructors

	/** default constructor */
	public AbstractHishopProductTagId() {
	}

	/** full constructor */
	public AbstractHishopProductTagId(Integer tagId,
			HishopProducts hishopProducts) {
		this.tagId = tagId;
		this.hishopProducts = hishopProducts;
	}

	// Property accessors

	public Integer getTagId() {
		return this.tagId;
	}

	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}

	public HishopProducts getHishopProducts() {
		return this.hishopProducts;
	}

	public void setHishopProducts(HishopProducts hishopProducts) {
		this.hishopProducts = hishopProducts;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopProductTagId))
			return false;
		AbstractHishopProductTagId castOther = (AbstractHishopProductTagId) other;

		return ((this.getTagId() == castOther.getTagId()) || (this.getTagId() != null
				&& castOther.getTagId() != null && this.getTagId().equals(
				castOther.getTagId())))
				&& ((this.getHishopProducts() == castOther.getHishopProducts()) || (this
						.getHishopProducts() != null
						&& castOther.getHishopProducts() != null && this
						.getHishopProducts().equals(
								castOther.getHishopProducts())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTagId() == null ? 0 : this.getTagId().hashCode());
		result = 37
				* result
				+ (getHishopProducts() == null ? 0 : this.getHishopProducts()
						.hashCode());
		return result;
	}

}