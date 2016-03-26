package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * TaobaoProducts entity. @author MyEclipse Persistence Tools
 */
public class TaobaoProducts extends AbstractTaobaoProducts implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TaobaoProducts() {
	}

	/** minimal constructor */
	public TaobaoProducts(HishopProducts hishopProducts, Long cid, String proTitle, Long num, String locationState, String locationCity, String freightPayer, Boolean hasInvoice, Boolean hasWarranty, Boolean hasDiscount, Long validThru) {
		super(hishopProducts, cid, proTitle, num, locationState, locationCity, freightPayer, hasInvoice, hasWarranty, hasDiscount, validThru);
	}

	/** full constructor */
	public TaobaoProducts(HishopProducts hishopProducts, Long cid, String stuffStatus, String proTitle, Long num, String locationState, String locationCity, String freightPayer, Double postFee, Double expressFee, Double emsfee, Boolean hasInvoice, Boolean hasWarranty, Boolean hasDiscount, Long validThru, Timestamp listTime, String propertyAlias, String inputPids, String inputStr, String skuProperties, String skuQuantities, String skuPrices, String skuOuterIds) {
		super(hishopProducts, cid, stuffStatus, proTitle, num, locationState, locationCity, freightPayer, postFee, expressFee, emsfee, hasInvoice, hasWarranty, hasDiscount, validThru, listTime, propertyAlias, inputPids, inputStr, skuProperties, skuQuantities, skuPrices, skuOuterIds);
	}

}
