package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopLogs entity provides the base persistence definition of the
 * HishopLogs entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopLogs implements java.io.Serializable {

	// Fields

	private Long logId;
	private String pageUrl;
	private Date addedTime;
	private String userName;
	private String ipaddress;
	private Integer privilege;
	private String description;

	// Constructors

	/** default constructor */
	public AbstractHishopLogs() {
	}

	/** minimal constructor */
	public AbstractHishopLogs(String pageUrl, Date addedTime,
			String userName, String ipaddress, Integer privilege) {
		this.pageUrl = pageUrl;
		this.addedTime = addedTime;
		this.userName = userName;
		this.ipaddress = ipaddress;
		this.privilege = privilege;
	}

	/** full constructor */
	public AbstractHishopLogs(String pageUrl, Date addedTime,
			String userName, String ipaddress, Integer privilege,
			String description) {
		this.pageUrl = pageUrl;
		this.addedTime = addedTime;
		this.userName = userName;
		this.ipaddress = ipaddress;
		this.privilege = privilege;
		this.description = description;
	}

	// Property accessors

	public Long getLogId() {
		return this.logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	public String getPageUrl() {
		return this.pageUrl;
	}

	public void setPageUrl(String pageUrl) {
		this.pageUrl = pageUrl;
	}

	public Date getAddedTime() {
		return this.addedTime;
	}

	public void setAddedTime(Date addedTime) {
		this.addedTime = addedTime;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIpaddress() {
		return this.ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public Integer getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(Integer privilege) {
		this.privilege = privilege;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}