package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopCouponItems entity. @author MyEclipse Persistence Tools
 */
public class HishopCouponItems extends AbstractHishopCouponItems implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopCouponItems() {
	}

	/** minimal constructor */
	public HishopCouponItems(HishopCoupons hishopCoupons, String lotNumber, Timestamp generateTime) {
		super(hishopCoupons, lotNumber, generateTime);
	}

	/** full constructor */
	public HishopCouponItems(HishopCoupons hishopCoupons, String lotNumber, Integer userId, String emailAddress, Timestamp generateTime) {
		super(hishopCoupons, lotNumber, userId, emailAddress, generateTime);
	}

}
