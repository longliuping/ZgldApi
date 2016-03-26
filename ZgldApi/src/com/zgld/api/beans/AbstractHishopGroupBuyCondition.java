package com.zgld.api.beans;

/**
 * AbstractHishopGroupBuyCondition entity provides the base persistence
 * definition of the HishopGroupBuyCondition entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopGroupBuyCondition implements java.io.Serializable {

	// Fields

	private HishopGroupBuyConditionId id;
	private Double price;

	// Constructors

	/** default constructor */
	public AbstractHishopGroupBuyCondition() {
	}

	/** full constructor */
	public AbstractHishopGroupBuyCondition(HishopGroupBuyConditionId id, Double price) {
		this.id = id;
		this.price = price;
	}

	// Property accessors

	public HishopGroupBuyConditionId getId() {
		return this.id;
	}

	public void setId(HishopGroupBuyConditionId id) {
		this.id = id;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}