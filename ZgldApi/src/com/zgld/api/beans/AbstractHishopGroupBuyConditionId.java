package com.zgld.api.beans;

/**
 * AbstractHishopGroupBuyConditionId entity provides the base persistence
 * definition of the HishopGroupBuyConditionId entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopGroupBuyConditionId implements java.io.Serializable {

	// Fields

	private HishopGroupBuy hishopGroupBuy;
	private Integer count;

	// Constructors

	/** default constructor */
	public AbstractHishopGroupBuyConditionId() {
	}

	/** full constructor */
	public AbstractHishopGroupBuyConditionId(HishopGroupBuy hishopGroupBuy, Integer count) {
		this.hishopGroupBuy = hishopGroupBuy;
		this.count = count;
	}

	// Property accessors

	public HishopGroupBuy getHishopGroupBuy() {
		return this.hishopGroupBuy;
	}

	public void setHishopGroupBuy(HishopGroupBuy hishopGroupBuy) {
		this.hishopGroupBuy = hishopGroupBuy;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopGroupBuyConditionId))
			return false;
		AbstractHishopGroupBuyConditionId castOther = (AbstractHishopGroupBuyConditionId) other;

		return ((this.getHishopGroupBuy() == castOther.getHishopGroupBuy()) || (this.getHishopGroupBuy() != null && castOther.getHishopGroupBuy() != null && this.getHishopGroupBuy().equals(castOther.getHishopGroupBuy()))) && ((this.getCount() == castOther.getCount()) || (this.getCount() != null && castOther.getCount() != null && this.getCount().equals(castOther.getCount())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getHishopGroupBuy() == null ? 0 : this.getHishopGroupBuy().hashCode());
		result = 37 * result + (getCount() == null ? 0 : this.getCount().hashCode());
		return result;
	}

}