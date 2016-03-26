package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopCountDown entity provides the base persistence definition of
 * the HishopCountDown entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopCountDown implements java.io.Serializable {

	// Fields

	private Integer countDownId;
	private HishopProducts hishopProducts;
	private Date startDate;
	private Date endDate;
	private String content;
	private Integer displaySequence;
	private Double countDownPrice;

	// Constructors

	/** default constructor */
	public AbstractHishopCountDown() {
	}

	/** minimal constructor */
	public AbstractHishopCountDown(HishopProducts hishopProducts, Date startDate, Date endDate, Integer displaySequence, Double countDownPrice) {
		this.hishopProducts = hishopProducts;
		this.startDate = startDate;
		this.endDate = endDate;
		this.displaySequence = displaySequence;
		this.countDownPrice = countDownPrice;
	}

	/** full constructor */
	public AbstractHishopCountDown(HishopProducts hishopProducts, Date startDate, Date endDate, String content, Integer displaySequence, Double countDownPrice) {
		this.hishopProducts = hishopProducts;
		this.startDate = startDate;
		this.endDate = endDate;
		this.content = content;
		this.displaySequence = displaySequence;
		this.countDownPrice = countDownPrice;
	}

	// Property accessors

	public Integer getCountDownId() {
		return this.countDownId;
	}

	public void setCountDownId(Integer countDownId) {
		this.countDownId = countDownId;
	}

	public HishopProducts getHishopProducts() {
		return this.hishopProducts;
	}

	public void setHishopProducts(HishopProducts hishopProducts) {
		this.hishopProducts = hishopProducts;
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getDisplaySequence() {
		return this.displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public Double getCountDownPrice() {
		return this.countDownPrice;
	}

	public void setCountDownPrice(Double countDownPrice) {
		this.countDownPrice = countDownPrice;
	}

}