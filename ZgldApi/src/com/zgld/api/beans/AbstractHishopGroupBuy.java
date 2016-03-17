package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopGroupBuy entity provides the base persistence definition of the
 * HishopGroupBuy entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopGroupBuy implements java.io.Serializable {

	// Fields

	private Integer groupBuyId;
	private HishopProducts hishopProducts;
	private Double needPrice;
	private Date startDate;
	private Date endDate;
	private Integer maxCount;
	private String content;
	private Integer status;
	private Integer displaySequence;
	private Set hishopGroupBuyConditions = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHishopGroupBuy() {
	}

	/** minimal constructor */
	public AbstractHishopGroupBuy(HishopProducts hishopProducts,
			Double needPrice, Date startDate, Date endDate,
			Integer maxCount, Integer status, Integer displaySequence) {
		this.hishopProducts = hishopProducts;
		this.needPrice = needPrice;
		this.startDate = startDate;
		this.endDate = endDate;
		this.maxCount = maxCount;
		this.status = status;
		this.displaySequence = displaySequence;
	}

	/** full constructor */
	public AbstractHishopGroupBuy(HishopProducts hishopProducts,
			Double needPrice, Date startDate, Date endDate,
			Integer maxCount, String content, Integer status,
			Integer displaySequence, Set hishopGroupBuyConditions) {
		this.hishopProducts = hishopProducts;
		this.needPrice = needPrice;
		this.startDate = startDate;
		this.endDate = endDate;
		this.maxCount = maxCount;
		this.content = content;
		this.status = status;
		this.displaySequence = displaySequence;
		this.hishopGroupBuyConditions = hishopGroupBuyConditions;
	}

	// Property accessors

	public Integer getGroupBuyId() {
		return this.groupBuyId;
	}

	public void setGroupBuyId(Integer groupBuyId) {
		this.groupBuyId = groupBuyId;
	}

	public HishopProducts getHishopProducts() {
		return this.hishopProducts;
	}

	public void setHishopProducts(HishopProducts hishopProducts) {
		this.hishopProducts = hishopProducts;
	}

	public Double getNeedPrice() {
		return this.needPrice;
	}

	public void setNeedPrice(Double needPrice) {
		this.needPrice = needPrice;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getMaxCount() {
		return this.maxCount;
	}

	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public Set getHishopGroupBuyConditions() {
		return this.hishopGroupBuyConditions;
	}

	public void setHishopGroupBuyConditions(Set hishopGroupBuyConditions) {
		this.hishopGroupBuyConditions = hishopGroupBuyConditions;
	}

}