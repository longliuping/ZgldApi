package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopPointDetails entity. @author MyEclipse Persistence Tools
 */
public class HishopPointDetails extends AbstractHishopPointDetails implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopPointDetails() {
	}

	/** minimal constructor */
	public HishopPointDetails(AspnetMembers aspnetMembers, Timestamp tradeDate, Integer tradeType) {
		super(aspnetMembers, tradeDate, tradeType);
	}

	/** full constructor */
	public HishopPointDetails(AspnetMembers aspnetMembers, String orderId, Timestamp tradeDate, Integer tradeType, Integer increased, Integer reduced, Integer points, String remark) {
		super(aspnetMembers, orderId, tradeDate, tradeType, increased, reduced, points, remark);
	}

}
