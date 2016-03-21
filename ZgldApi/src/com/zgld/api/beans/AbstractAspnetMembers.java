package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractAspnetMembers entity provides the base persistence definition of the
 * AspnetMembers entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAspnetMembers implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Integer gradeId;
	private Integer referralUserId;
	private Boolean isOpenBalance;
	private String tradePassword;
	private String tradePasswordSalt;
	private Integer tradePasswordFormat;
	private Integer orderNumber;
	private Double expenditure;
	private Integer points;
	private Double balance;
	private Double requestBalance;
	private Integer topRegionId;
	private Integer regionId;
	private String realName;
	private String address;
	private String zipcode;
	private String telPhone;
	private String cellPhone;
	private String qq;
	private String wangwang;
	private String msn;


	// Constructors

	/** default constructor */
	public AbstractAspnetMembers() {
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(Integer gradeId) {
		this.gradeId = gradeId;
	}

	public Integer getReferralUserId() {
		return this.referralUserId;
	}

	public void setReferralUserId(Integer referralUserId) {
		this.referralUserId = referralUserId;
	}

	public Boolean getIsOpenBalance() {
		return this.isOpenBalance;
	}

	public void setIsOpenBalance(Boolean isOpenBalance) {
		this.isOpenBalance = isOpenBalance;
	}

	public String getTradePassword() {
		return this.tradePassword;
	}

	public void setTradePassword(String tradePassword) {
		this.tradePassword = tradePassword;
	}

	public String getTradePasswordSalt() {
		return this.tradePasswordSalt;
	}

	public void setTradePasswordSalt(String tradePasswordSalt) {
		this.tradePasswordSalt = tradePasswordSalt;
	}

	public Integer getTradePasswordFormat() {
		return this.tradePasswordFormat;
	}

	public void setTradePasswordFormat(Integer tradePasswordFormat) {
		this.tradePasswordFormat = tradePasswordFormat;
	}

	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Double getExpenditure() {
		return this.expenditure;
	}

	public void setExpenditure(Double expenditure) {
		this.expenditure = expenditure;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getRequestBalance() {
		return this.requestBalance;
	}

	public void setRequestBalance(Double requestBalance) {
		this.requestBalance = requestBalance;
	}

	public Integer getTopRegionId() {
		return this.topRegionId;
	}

	public void setTopRegionId(Integer topRegionId) {
		this.topRegionId = topRegionId;
	}

	public Integer getRegionId() {
		return this.regionId;
	}

	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getTelPhone() {
		return this.telPhone;
	}

	public void setTelPhone(String telPhone) {
		this.telPhone = telPhone;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWangwang() {
		return this.wangwang;
	}

	public void setWangwang(String wangwang) {
		this.wangwang = wangwang;
	}

	public String getMsn() {
		return this.msn;
	}

	public void setMsn(String msn) {
		this.msn = msn;
	}
}