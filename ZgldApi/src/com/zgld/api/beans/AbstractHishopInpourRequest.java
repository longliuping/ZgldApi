package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopInpourRequest entity provides the base persistence definition
 * of the HishopInpourRequest entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopInpourRequest implements java.io.Serializable {

	// Fields

	private String inpourId;
	private AspnetMembers aspnetMembers;
	private Date tradeDate;
	private Double inpourBlance;
	private Integer paymentId;

	// Constructors

	/** default constructor */
	public AbstractHishopInpourRequest() {
	}

	/** full constructor */
	public AbstractHishopInpourRequest(AspnetMembers aspnetMembers, Date tradeDate, Double inpourBlance, Integer paymentId) {
		this.aspnetMembers = aspnetMembers;
		this.tradeDate = tradeDate;
		this.inpourBlance = inpourBlance;
		this.paymentId = paymentId;
	}

	// Property accessors

	public String getInpourId() {
		return this.inpourId;
	}

	public void setInpourId(String inpourId) {
		this.inpourId = inpourId;
	}

	public AspnetMembers getAspnetMembers() {
		return this.aspnetMembers;
	}

	public void setAspnetMembers(AspnetMembers aspnetMembers) {
		this.aspnetMembers = aspnetMembers;
	}

	public Date getTradeDate() {
		return this.tradeDate;
	}

	public void setTradeDate(Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Double getInpourBlance() {
		return this.inpourBlance;
	}

	public void setInpourBlance(Double inpourBlance) {
		this.inpourBlance = inpourBlance;
	}

	public Integer getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

}