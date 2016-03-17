package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopBalanceDrawRequest entity provides the base persistence
 * definition of the HishopBalanceDrawRequest entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopBalanceDrawRequest implements
		java.io.Serializable {

	// Fields

	private Integer userId;
	private AspnetMembers aspnetMembers;
	private String userName;
	private Date requestTime;
	private Double amount;
	private String accountName;
	private String bankName;
	private String merchantCode;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractHishopBalanceDrawRequest() {
	}

	/** minimal constructor */
	public AbstractHishopBalanceDrawRequest(AspnetMembers aspnetMembers,
			String userName, Date requestTime, Double amount,
			String accountName, String bankName, String merchantCode) {
		this.aspnetMembers = aspnetMembers;
		this.userName = userName;
		this.requestTime = requestTime;
		this.amount = amount;
		this.accountName = accountName;
		this.bankName = bankName;
		this.merchantCode = merchantCode;
	}

	/** full constructor */
	public AbstractHishopBalanceDrawRequest(AspnetMembers aspnetMembers,
			String userName, Date requestTime, Double amount,
			String accountName, String bankName, String merchantCode,
			String remark) {
		this.aspnetMembers = aspnetMembers;
		this.userName = userName;
		this.requestTime = requestTime;
		this.amount = amount;
		this.accountName = accountName;
		this.bankName = bankName;
		this.merchantCode = merchantCode;
		this.remark = remark;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public AspnetMembers getAspnetMembers() {
		return this.aspnetMembers;
	}

	public void setAspnetMembers(AspnetMembers aspnetMembers) {
		this.aspnetMembers = aspnetMembers;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getMerchantCode() {
		return this.merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}