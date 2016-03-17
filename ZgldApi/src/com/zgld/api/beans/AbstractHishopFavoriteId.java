package com.zgld.api.beans;

/**
 * AbstractHishopFavoriteId entity provides the base persistence definition of
 * the HishopFavoriteId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopFavoriteId implements java.io.Serializable {

	// Fields

	private Integer productId;
	private AspnetMembers aspnetMembers;

	// Constructors

	/** default constructor */
	public AbstractHishopFavoriteId() {
	}

	/** full constructor */
	public AbstractHishopFavoriteId(Integer productId,
			AspnetMembers aspnetMembers) {
		this.productId = productId;
		this.aspnetMembers = aspnetMembers;
	}

	// Property accessors

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public AspnetMembers getAspnetMembers() {
		return this.aspnetMembers;
	}

	public void setAspnetMembers(AspnetMembers aspnetMembers) {
		this.aspnetMembers = aspnetMembers;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopFavoriteId))
			return false;
		AbstractHishopFavoriteId castOther = (AbstractHishopFavoriteId) other;

		return ((this.getProductId() == castOther.getProductId()) || (this
				.getProductId() != null
				&& castOther.getProductId() != null && this.getProductId()
				.equals(castOther.getProductId())))
				&& ((this.getAspnetMembers() == castOther.getAspnetMembers()) || (this
						.getAspnetMembers() != null
						&& castOther.getAspnetMembers() != null && this
						.getAspnetMembers()
						.equals(castOther.getAspnetMembers())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getProductId() == null ? 0 : this.getProductId().hashCode());
		result = 37
				* result
				+ (getAspnetMembers() == null ? 0 : this.getAspnetMembers()
						.hashCode());
		return result;
	}

}