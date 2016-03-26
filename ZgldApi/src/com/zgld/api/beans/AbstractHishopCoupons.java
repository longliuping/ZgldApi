package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopCoupons entity provides the base persistence definition of the
 * HishopCoupons entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopCoupons implements java.io.Serializable {

	// Fields

	private Integer couponId;
	private String name;
	private Date closingTime;
	private String description;
	private Double amount;
	private Double discountValue;
	private Integer sentCount;
	private Integer usedCount;
	private Integer needPoint;
	private Set hishopCouponItemses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHishopCoupons() {
	}

	/** minimal constructor */
	public AbstractHishopCoupons(String name, Date closingTime, Double discountValue, Integer sentCount, Integer usedCount, Integer needPoint) {
		this.name = name;
		this.closingTime = closingTime;
		this.discountValue = discountValue;
		this.sentCount = sentCount;
		this.usedCount = usedCount;
		this.needPoint = needPoint;
	}

	/** full constructor */
	public AbstractHishopCoupons(String name, Date closingTime, String description, Double amount, Double discountValue, Integer sentCount, Integer usedCount, Integer needPoint, Set hishopCouponItemses) {
		this.name = name;
		this.closingTime = closingTime;
		this.description = description;
		this.amount = amount;
		this.discountValue = discountValue;
		this.sentCount = sentCount;
		this.usedCount = usedCount;
		this.needPoint = needPoint;
		this.hishopCouponItemses = hishopCouponItemses;
	}

	// Property accessors

	public Integer getCouponId() {
		return this.couponId;
	}

	public void setCouponId(Integer couponId) {
		this.couponId = couponId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getClosingTime() {
		return this.closingTime;
	}

	public void setClosingTime(Date closingTime) {
		this.closingTime = closingTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getDiscountValue() {
		return this.discountValue;
	}

	public void setDiscountValue(Double discountValue) {
		this.discountValue = discountValue;
	}

	public Integer getSentCount() {
		return this.sentCount;
	}

	public void setSentCount(Integer sentCount) {
		this.sentCount = sentCount;
	}

	public Integer getUsedCount() {
		return this.usedCount;
	}

	public void setUsedCount(Integer usedCount) {
		this.usedCount = usedCount;
	}

	public Integer getNeedPoint() {
		return this.needPoint;
	}

	public void setNeedPoint(Integer needPoint) {
		this.needPoint = needPoint;
	}

	public Set getHishopCouponItemses() {
		return this.hishopCouponItemses;
	}

	public void setHishopCouponItemses(Set hishopCouponItemses) {
		this.hishopCouponItemses = hishopCouponItemses;
	}

}