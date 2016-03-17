package com.zgld.api.beans;

/**
 * AbstractHishopOrderOptionsId entity provides the base persistence definition
 * of the HishopOrderOptionsId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopOrderOptionsId implements
		java.io.Serializable {

	// Fields

	private HishopOrders hishopOrders;
	private Integer lookupListId;
	private Integer lookupItemId;

	// Constructors

	/** default constructor */
	public AbstractHishopOrderOptionsId() {
	}

	/** full constructor */
	public AbstractHishopOrderOptionsId(HishopOrders hishopOrders,
			Integer lookupListId, Integer lookupItemId) {
		this.hishopOrders = hishopOrders;
		this.lookupListId = lookupListId;
		this.lookupItemId = lookupItemId;
	}

	// Property accessors

	public HishopOrders getHishopOrders() {
		return this.hishopOrders;
	}

	public void setHishopOrders(HishopOrders hishopOrders) {
		this.hishopOrders = hishopOrders;
	}

	public Integer getLookupListId() {
		return this.lookupListId;
	}

	public void setLookupListId(Integer lookupListId) {
		this.lookupListId = lookupListId;
	}

	public Integer getLookupItemId() {
		return this.lookupItemId;
	}

	public void setLookupItemId(Integer lookupItemId) {
		this.lookupItemId = lookupItemId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractHishopOrderOptionsId))
			return false;
		AbstractHishopOrderOptionsId castOther = (AbstractHishopOrderOptionsId) other;

		return ((this.getHishopOrders() == castOther.getHishopOrders()) || (this
				.getHishopOrders() != null
				&& castOther.getHishopOrders() != null && this
				.getHishopOrders().equals(castOther.getHishopOrders())))
				&& ((this.getLookupListId() == castOther.getLookupListId()) || (this
						.getLookupListId() != null
						&& castOther.getLookupListId() != null && this
						.getLookupListId().equals(castOther.getLookupListId())))
				&& ((this.getLookupItemId() == castOther.getLookupItemId()) || (this
						.getLookupItemId() != null
						&& castOther.getLookupItemId() != null && this
						.getLookupItemId().equals(castOther.getLookupItemId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getHishopOrders() == null ? 0 : this.getHishopOrders()
						.hashCode());
		result = 37
				* result
				+ (getLookupListId() == null ? 0 : this.getLookupListId()
						.hashCode());
		result = 37
				* result
				+ (getLookupItemId() == null ? 0 : this.getLookupItemId()
						.hashCode());
		return result;
	}

}