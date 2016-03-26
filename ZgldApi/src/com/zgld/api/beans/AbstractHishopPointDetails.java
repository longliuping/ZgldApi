package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopPointDetails entity provides the base persistence definition of
 * the HishopPointDetails entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopPointDetails implements java.io.Serializable {

	// Fields

	private Long journalNumber;
	private AspnetMembers aspnetMembers;
	private String orderId;
	private Date tradeDate;
	private Integer tradeType;
	private Integer increased;
	private Integer reduced;
	private Integer points;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractHishopPointDetails() {
	}

	/** minimal constructor */
	public AbstractHishopPointDetails(AspnetMembers aspnetMembers, Date tradeDate, Integer tradeType) {
		this.aspnetMembers = aspnetMembers;
		this.tradeDate = tradeDate;
		this.tradeType = tradeType;
	}

	/** full constructor */
	public AbstractHishopPointDetails(AspnetMembers aspnetMembers, String orderId, Date tradeDate, Integer tradeType, Integer increased, Integer reduced, Integer points, String remark) {
		this.aspnetMembers = aspnetMembers;
		this.orderId = orderId;
		this.tradeDate = tradeDate;
		this.tradeType = tradeType;
		this.increased = increased;
		this.reduced = reduced;
		this.points = points;
		this.remark = remark;
	}

	// Property accessors

	public Long getJournalNumber() {
		return this.journalNumber;
	}

	public void setJournalNumber(Long journalNumber) {
		this.journalNumber = journalNumber;
	}

	public AspnetMembers getAspnetMembers() {
		return this.aspnetMembers;
	}

	public void setAspnetMembers(AspnetMembers aspnetMembers) {
		this.aspnetMembers = aspnetMembers;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Date getTradeDate() {
		return this.tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Integer getTradeType() {
		return this.tradeType;
	}

	public void setTradeType(Integer tradeType) {
		this.tradeType = tradeType;
	}

	public Integer getIncreased() {
		return this.increased;
	}

	public void setIncreased(Integer increased) {
		this.increased = increased;
	}

	public Integer getReduced() {
		return this.reduced;
	}

	public void setReduced(Integer reduced) {
		this.reduced = reduced;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}