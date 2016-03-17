package com.zgld.api.beans;

/**
 * AbstractHishopOrderGiftsId entity provides the base persistence definition of
 * the HishopOrderGiftsId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopOrderGiftsId implements
		java.io.Serializable {

	// Fields

	private HishopOrders hishopOrders;
	private Integer giftId;

	// Constructors

	/** default constructor */
	public AbstractHishopOrderGiftsId() {
	}

	/** full constructor */
	public AbstractHishopOrderGiftsId(HishopOrders hishopOrders, Integer giftId) {
		this.hishopOrders = hishopOrders;
		this.giftId = giftId;
	}

	// Property accessors

	public HishopOrders getHishopOrders() {
		return this.hishopOrders;
	}

	public void setHishopOrders(HishopOrders hishopOrders) {
		this.hishopOrders = hishopOrders;
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
		if (!(other instanceof AbstractHishopOrderGiftsId))
			return false;
		AbstractHishopOrderGiftsId castOther = (AbstractHishopOrderGiftsId) other;

		return ((this.getHishopOrders() == castOther.getHishopOrders()) || (this
				.getHishopOrders() != null
				&& castOther.getHishopOrders() != null && this
				.getHishopOrders().equals(castOther.getHishopOrders())))
				&& ((this.getGiftId() == castOther.getGiftId()) || (this
						.getGiftId() != null
						&& castOther.getGiftId() != null && this.getGiftId()
						.equals(castOther.getGiftId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getHishopOrders() == null ? 0 : this.getHishopOrders()
						.hashCode());
		result = 37 * result
				+ (getGiftId() == null ? 0 : this.getGiftId().hashCode());
		return result;
	}

}