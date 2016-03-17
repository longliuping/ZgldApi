package com.zgld.api.beans;

/**
 * AbstractHishopProductTypeBrandsId entity provides the base persistence
 * definition of the HishopProductTypeBrandsId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopProductTypeBrandsId implements
		java.io.Serializable {

	// Fields

	private HishopProductTypes hishopProductTypes;
	private HishopBrandCategories hishopBrandCategories;

	// Constructors

	/** default constructor */
	public AbstractHishopProductTypeBrandsId() {
	}

	/** full constructor */
	public AbstractHishopProductTypeBrandsId(
			HishopProductTypes hishopProductTypes,
			HishopBrandCategories hishopBrandCategories) {
		this.hishopProductTypes = hishopProductTypes;
		this.hishopBrandCategories = hishopBrandCategories;
	}

	// Property accessors

	public HishopProductTypes getHishopProductTypes() {
		return this.hishopProductTypes;
	}

	public void setHishopProductTypes(HishopProductTypes hishopProductTypes) {
		this.hishopProductTypes = hishopProductTypes;
	}

	public HishopBrandCategories getHishopBrandCategories() {
		return this.hishopBrandCategories;
	}

	public void setHishopBrandCategories(
			HishopBrandCategories hishopBrandCategories) {
		this.hishopBrandCategories = hishopBrandCategories;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopProductTypeBrandsId))
			return false;
		AbstractHishopProductTypeBrandsId castOther = (AbstractHishopProductTypeBrandsId) other;

		return ((this.getHishopProductTypes() == castOther
				.getHishopProductTypes()) || (this.getHishopProductTypes() != null
				&& castOther.getHishopProductTypes() != null && this
				.getHishopProductTypes().equals(
						castOther.getHishopProductTypes())))
				&& ((this.getHishopBrandCategories() == castOther
						.getHishopBrandCategories()) || (this
						.getHishopBrandCategories() != null
						&& castOther.getHishopBrandCategories() != null && this
						.getHishopBrandCategories().equals(
								castOther.getHishopBrandCategories())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getHishopProductTypes() == null ? 0 : this
						.getHishopProductTypes().hashCode());
		result = 37
				* result
				+ (getHishopBrandCategories() == null ? 0 : this
						.getHishopBrandCategories().hashCode());
		return result;
	}

}