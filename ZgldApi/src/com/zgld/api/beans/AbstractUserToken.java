package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractUserToken entity provides the base persistence definition of the
 * UserToken entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUserToken implements java.io.Serializable {

	// Fields

	private Integer tokenId;
	private String accountToken;
	private Date tokenDateTime;
	private Integer tokenType;
	private String tokenRemark;
	private Integer userId;

	// Constructors

	/** default constructor */
	public AbstractUserToken() {
	}

	// Property accessors

	public Integer getTokenId() {
		return this.tokenId;
	}

	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}

	public String getAccountToken() {
		return this.accountToken;
	}

	public void setAccountToken(String accountToken) {
		this.accountToken = accountToken;
	}

	public Date getTokenDateTime() {
		return this.tokenDateTime;
	}

	public void setTokenDateTime(Date tokenDateTime) {
		this.tokenDateTime = tokenDateTime;
	}

	public Integer getTokenType() {
		return this.tokenType;
	}

	public void setTokenType(Integer tokenType) {
		this.tokenType = tokenType;
	}

	public String getTokenRemark() {
		return this.tokenRemark;
	}

	public void setTokenRemark(String tokenRemark) {
		this.tokenRemark = tokenRemark;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}