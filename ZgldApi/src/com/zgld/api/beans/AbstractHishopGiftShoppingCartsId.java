package com.zgld.api.beans;

/**
 * AbstractHishopGiftShoppingCartsId entity provides the base persistence
 * definition of the HishopGiftShoppingCartsId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopGiftShoppingCartsId implements
		java.io.Serializable {

	// Fields

	private AspnetMembers aspnetMembers;
	private Integer giftId;

	// Constructors

	/** default constructor */
	public AbstractHishopGiftShoppingCartsId() {
	}

	/** full constructor */
	public AbstractHishopGiftShoppingCartsId(AspnetMembers aspnetMembers,
			Integer giftId) {
		this.aspnetMembers = aspnetMembers;
		this.giftId = giftId;
	}

	// Property accessors

	public AspnetMembers getAspnetMembers() {
		return this.aspnetMembers;
	}

	public void setAspnetMembers(AspnetMembers aspnetMembers) {
		this.aspnetMembers = aspnetMembers;
	}

	public Integer getGiftId() {
		return this.giftId;
	}

	public void setGiftId(Integer giftId) {
		this.giftId = giftId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopGiftShoppingCartsId))
			return false;
		AbstractHishopGiftShoppingCartsId castOther = (AbstractHishopGiftShoppingCartsId) other;

		return ((this.getAspnetMembers() == castOther.getAspnetMembers()) || (this
				.getAspnetMembers() != null
				&& castOther.getAspnetMembers() != null && this
				.getAspnetMembers().equals(castOther.getAspnetMembers())))
				&& ((this.getGiftId() == castOther.getGiftId()) || (this
						.getGiftId() != null
						&& castOther.getGiftId() != null && this.getGiftId()
						.equals(castOther.getGiftId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getAspnetMembers() == null ? 0 : this.getAspnetMembers()
						.hashCode());
		result = 37 * result
				+ (getGiftId() == null ? 0 : this.getGiftId().hashCode());
		return result;
	}

}