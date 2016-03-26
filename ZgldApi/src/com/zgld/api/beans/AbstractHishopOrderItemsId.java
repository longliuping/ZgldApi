package com.zgld.api.beans;

/**
 * AbstractHishopOrderItemsId entity provides the base persistence definition of
 * the HishopOrderItemsId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopOrderItemsId implements java.io.Serializable {

	// Fields

	private HishopOrders hishopOrders;
	private String skuId;

	// Constructors

	/** default constructor */
	public AbstractHishopOrderItemsId() {
	}

	/** full constructor */
	public AbstractHishopOrderItemsId(HishopOrders hishopOrders, String skuId) {
		this.hishopOrders = hishopOrders;
		this.skuId = skuId;
	}

	// Property accessors

	public HishopOrders getHishopOrders() {
		return this.hishopOrders;
	}

	public void setHishopOrders(HishopOrders hishopOrders) {
		this.hishopOrders = hishopOrders;
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
		if (!(other instanceof AbstractHishopOrderItemsId))
			return false;
		AbstractHishopOrderItemsId castOther = (AbstractHishopOrderItemsId) other;

		return ((this.getHishopOrders() == castOther.getHishopOrders()) || (this.getHishopOrders() != null && castOther.getHishopOrders() != null && this.getHishopOrders().equals(castOther.getHishopOrders()))) && ((this.getSkuId() == castOther.getSkuId()) || (this.getSkuId() != null && castOther.getSkuId() != null && this.getSkuId().equals(castOther.getSkuId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHishopOrders() == null ? 0 : this.getHishopOrders().hashCode());
		result = 37 * result + (getSkuId() == null ? 0 : this.getSkuId().hashCode());
		return result;
	}

}