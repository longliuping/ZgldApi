package com.zgld.api.beans;

/**
 * AbstractHishopRelatedProductsId entity provides the base persistence
 * definition of the HishopRelatedProductsId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopRelatedProductsId implements
		java.io.Serializable {

	// Fields

	private Integer productId;
	private Integer relatedProductId;

	// Constructors

	/** default constructor */
	public AbstractHishopRelatedProductsId() {
	}

	/** full constructor */
	public AbstractHishopRelatedProductsId(Integer productId,
			Integer relatedProductId) {
		this.productId = productId;
		this.relatedProductId = relatedProductId;
	}

	// Property accessors

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getRelatedProductId() {
		return this.relatedProductId;
	}

	public void setRelatedProductId(Integer relatedProductId) {
		this.relatedProductId = relatedProductId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopRelatedProductsId))
			return false;
		AbstractHishopRelatedProductsId castOther = (AbstractHishopRelatedProductsId) other;

		return ((this.getProductId() == castOther.getProductId()) || (this
				.getProductId() != null
				&& castOther.getProductId() != null && this.getProductId()
				.equals(castOther.getProductId())))
				&& ((this.getRelatedProductId() == castOther
						.getRelatedProductId()) || (this.getRelatedProductId() != null
						&& castOther.getRelatedProductId() != null && this
						.getRelatedProductId().equals(
								castOther.getRelatedProductId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getProductId() == null ? 0 : this.getProductId().hashCode());
		result = 37
				* result
				+ (getRelatedProductId() == null ? 0 : this
						.getRelatedProductId().hashCode());
		return result;
	}

}