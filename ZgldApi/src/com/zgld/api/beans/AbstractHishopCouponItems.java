package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopCouponItems entity provides the base persistence definition of
 * the HishopCouponItems entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopCouponItems implements java.io.Serializable {

	// Fields

	private String claimCode;
	private HishopCoupons hishopCoupons;
	private String lotNumber;
	private Integer userId;
	private String emailAddress;
	private Date generateTime;

	// Constructors

	/** default constructor */
	public AbstractHishopCouponItems() {
	}

	/** minimal constructor */
	public AbstractHishopCouponItems(HishopCoupons hishopCoupons, String lotNumber, Date generateTime) {
		this.hishopCoupons = hishopCoupons;
		this.lotNumber = lotNumber;
		this.generateTime = generateTime;
	}

	/** full constructor */
	public AbstractHishopCouponItems(HishopCoupons hishopCoupons, String lotNumber, Integer userId, String emailAddress, Date generateTime) {
		this.hishopCoupons = hishopCoupons;
		this.lotNumber = lotNumber;
		this.userId = userId;
		this.emailAddress = emailAddress;
		this.generateTime = generateTime;
	}

	// Property accessors

	public String getClaimCode() {
		return this.claimCode;
	}

	public void setClaimCode(String claimCode) {
		this.claimCode = claimCode;
	}

	public HishopCoupons getHishopCoupons() {
		return this.hishopCoupons;
	}

	public void setHishopCoupons(HishopCoupons hishopCoupons) {
		this.hishopCoupons = hishopCoupons;
	}

	public String getLotNumber() {
		return this.lotNumber;
	}

	public void setLotNumber(String lotNumber) {
		this.lotNumber = lotNumber;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getGenerateTime() {
		return this.generateTime;
	}

	public void setGenerateTime(Date generateTime) {
		this.generateTime = generateTime;
	}

}