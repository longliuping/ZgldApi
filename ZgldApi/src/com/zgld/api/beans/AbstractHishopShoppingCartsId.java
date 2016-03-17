package com.zgld.api.beans;

/**
 * AbstractHishopShoppingCartsId entity provides the base persistence definition
 * of the HishopShoppingCartsId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopShoppingCartsId implements
		java.io.Serializable {

	// Fields

	private AspnetMembers aspnetMembers;
	private String skuId;

	// Constructors

	/** default constructor */
	public AbstractHishopShoppingCartsId() {
	}

	/** full constructor */
	public AbstractHishopShoppingCartsId(AspnetMembers aspnetMembers,
			String skuId) {
		this.aspnetMembers = aspnetMembers;
		this.skuId = skuId;
	}

	// Property accessors

	public AspnetMembers getAspnetMembers() {
		return this.aspnetMembers;
	}

	public void setAspnetMembers(AspnetMembers aspnetMembers) {
		this.aspnetMembers = aspnetMembers;
	}

	public String getSkuId() {
		return this.skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopShoppingCartsId))
			return false;
		AbstractHishopShoppingCartsId castOther = (AbstractHishopShoppingCartsId) other;

		return ((this.getAspnetMembers() == castOther.getAspnetMembers()) || (this
				.getAspnetMembers() != null
				&& castOther.getAspnetMembers() != null && this
				.getAspnetMembers().equals(castOther.getAspnetMembers())))
				&& ((this.getSkuId() == castOther.getSkuId()) || (this
						.getSkuId() != null
						&& castOther.getSkuId() != null && this.getSkuId()
						.equals(castOther.getSkuId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAspnetMembers() == null ? 0 : this.getAspnetMembers()
						.hashCode());
		result = 37 * result
				+ (getSkuId() == null ? 0 : this.getSkuId().hashCode());
		return result;
	}

}