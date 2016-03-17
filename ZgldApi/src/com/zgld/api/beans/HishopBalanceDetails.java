package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopBalanceDetails entity. @author MyEclipse Persistence Tools
 */
public class HishopBalanceDetails extends AbstractHishopBalanceDetails
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopBalanceDetails() {
	}

	/** minimal constructor */
	public HishopBalanceDetails(AspnetMembers aspnetMembers, String userName,
			Timestamp tradeDate, Integer tradeType, Double balance) {
		super(aspnetMembers, userName, tradeDate, tradeType, balance);
	}

	/** full constructor */
	public HishopBalanceDetails(AspnetMembers aspnetMembers, String userName,
			Timestamp tradeDate, Integer tradeType, Double income,
			Double expenses, Double balance, String remark) {
		super(aspnetMembers, userName, tradeDate, tradeType, income, expenses,
				balance, remark);
	}

}
