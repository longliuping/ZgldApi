package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopEmailQueue entity. @author MyEclipse Persistence Tools
 */
public class HishopEmailQueue extends AbstractHishopEmailQueue implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopEmailQueue() {
	}

	/** minimal constructor */
	public HishopEmailQueue(Integer emailPriority, Boolean isBodyHtml, String emailTo, String emailSubject, String emailBody, Timestamp nextTryTime, Integer numberOfTries) {
		super(emailPriority, isBodyHtml, emailTo, emailSubject, emailBody, nextTryTime, numberOfTries);
	}

	/** full constructor */
	public HishopEmailQueue(Integer emailPriority, Boolean isBodyHtml, String emailTo, String emailCc, String emailBcc, String emailSubject, String emailBody, Timestamp nextTryTime, Integer numberOfTries) {
		super(emailPriority, isBodyHtml, emailTo, emailCc, emailBcc, emailSubject, emailBody, nextTryTime, numberOfTries);
	}

}
