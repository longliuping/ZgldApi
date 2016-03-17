package com.zgld.api.beans;

/**
 * HishopOrderOptionsId entity. @author MyEclipse Persistence Tools
 */
public class HishopOrderOptionsId extends AbstractHishopOrderOptionsId
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopOrderOptionsId() {
	}

	/** full constructor */
	public HishopOrderOptionsId(HishopOrders hishopOrders,
			Integer lookupListId, Integer lookupItemId) {
		super(hishopOrders, lookupListId, lookupItemId);
	}

}
