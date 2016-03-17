package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Set;

/**
 * HishopCoupons entity. @author MyEclipse Persistence Tools
 */
public class HishopCoupons extends AbstractHishopCoupons implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopCoupons() {
	}

	/** minimal constructor */
	public HishopCoupons(String name, Timestamp closingTime,
			Double discountValue, Integer sentCount, Integer usedCount,
			Integer needPoint) {
		super(name, closingTime, discountValue, sentCount, usedCount, needPoint);
	}

	/** full constructor */
	public HishopCoupons(String name, Timestamp closingTime,
			String description, Double amount, Double discountValue,
			Integer sentCount, Integer usedCount, Integer needPoint,
			Set hishopCouponItemses) {
		super(name, closingTime, description, amount, discountValue, sentCount,
				usedCount, needPoint, hishopCouponItemses);
	}

}
