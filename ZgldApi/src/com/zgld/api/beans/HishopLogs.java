package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopLogs entity. @author MyEclipse Persistence Tools
 */
public class HishopLogs extends AbstractHishopLogs implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopLogs() {
	}

	/** minimal constructor */
	public HishopLogs(String pageUrl, Timestamp addedTime, String userName, String ipaddress, Integer privilege) {
		super(pageUrl, addedTime, userName, ipaddress, privilege);
	}

	/** full constructor */
	public HishopLogs(String pageUrl, Timestamp addedTime, String userName, String ipaddress, Integer privilege, String description) {
		super(pageUrl, addedTime, userName, ipaddress, privilege, description);
	}

}
