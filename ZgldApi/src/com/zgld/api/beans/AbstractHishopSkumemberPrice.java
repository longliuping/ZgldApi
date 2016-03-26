package com.zgld.api.beans;

/**
 * AbstractHishopSkumemberPrice entity provides the base persistence definition
 * of the HishopSkumemberPrice entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopSkumemberPrice implements java.io.Serializable {

	// Fields

	private HishopSkumemberPriceId id;
	private Double memberSalePrice;

	// Constructors

	/** default constructor */
	public AbstractHishopSkumemberPrice() {
	}

	/** full constructor */
	public AbstractHishopSkumemberPrice(HishopSkumemberPriceId id, Double memberSalePrice) {
		this.id = id;
		this.memberSalePrice = memberSalePrice;
	}

	// Property accessors

	public HishopSkumemberPriceId getId() {
		return this.id;
	}

	public void setId(HishopSkumemberPriceId id) {
		this.id = id;
	}

	public Double getMemberSalePrice() {
		return this.memberSalePrice;
	}

	public void setMemberSalePrice(Double memberSalePrice) {
		this.memberSalePrice = memberSalePrice;
	}

}