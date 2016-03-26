package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopBalanceDetails entity provides the base persistence definition
 * of the HishopBalanceDetails entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopBalanceDetails implements java.io.Serializable {

	// Fields

	private Long journalNumber;
	private AspnetMembers aspnetMembers;
	private String userName;
	private Date tradeDate;
	private Integer tradeType;
	private Double income;
	private Double expenses;
	private Double balance;
	private String remark;

	// Constructors

	/** default constructor */
	public AbstractHishopBalanceDetails() {
	}

	/** minimal constructor */
	public AbstractHishopBalanceDetails(AspnetMembers aspnetMembers, String userName, Date tradeDate, Integer tradeType, Double balance) {
		this.aspnetMembers = aspnetMembers;
		this.userName = userName;
		this.tradeDate = tradeDate;
		this.tradeType = tradeType;
		this.balance = balance;
	}

	/** full constructor */
	public AbstractHishopBalanceDetails(AspnetMembers aspnetMembers, String userName, Date tradeDate, Integer tradeType, Double income, Double expenses, Double balance, String remark) {
		this.aspnetMembers = aspnetMembers;
		this.userName = userName;
		this.tradeDate = tradeDate;
		this.tradeType = tradeType;
		this.income = income;
		this.expenses = expenses;
		this.balance = balance;
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public Double getIncome() {
		return this.income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Double getExpenses() {
		return this.expenses;
	}

	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}