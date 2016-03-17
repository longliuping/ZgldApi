package com.zgld.api.beans;

/**
 * HishopSkumemberPrice entity. @author MyEclipse Persistence Tools
 */
public class HishopSkumemberPrice extends AbstractHishopSkumemberPrice
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopSkumemberPrice() {
	}

	/** full constructor */
	public HishopSkumemberPrice(HishopSkumemberPriceId id,
			Double memberSalePrice) {
		super(id, memberSalePrice);
	}

}
