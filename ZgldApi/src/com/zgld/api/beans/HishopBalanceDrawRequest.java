package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopBalanceDrawRequest entity. @author MyEclipse Persistence Tools
 */
public class HishopBalanceDrawRequest extends AbstractHishopBalanceDrawRequest
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopBalanceDrawRequest() {
	}

	/** minimal constructor */
	public HishopBalanceDrawRequest(AspnetMembers aspnetMembers,
			String userName, Timestamp requestTime, Double amount,
			String accountName, String bankName, String merchantCode) {
		super(aspnetMembers, userName, requestTime, amount, accountName,
				bankName, merchantCode);
	}

	/** full constructor */
	public HishopBalanceDrawRequest(AspnetMembers aspnetMembers,
			String userName, Timestamp requestTime, Double amount,
			String accountName, String bankName, String merchantCode,
			String remark) {
		super(aspnetMembers, userName, requestTime, amount, accountName,
				bankName, merchantCode, remark);
	}

}
