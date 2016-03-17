package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopEmailQueue entity provides the base persistence definition of
 * the HishopEmailQueue entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopEmailQueue implements java.io.Serializable {

	// Fields

	private String emailId;
	private Integer emailPriority;
	private Boolean isBodyHtml;
	private String emailTo;
	private String emailCc;
	private String emailBcc;
	private String emailSubject;
	private String emailBody;
	private Date nextTryTime;
	private Integer numberOfTries;

	// Constructors

	/** default constructor */
	public AbstractHishopEmailQueue() {
	}

	/** minimal constructor */
	public AbstractHishopEmailQueue(Integer emailPriority, Boolean isBodyHtml,
			String emailTo, String emailSubject, String emailBody,
			Date nextTryTime, Integer numberOfTries) {
		this.emailPriority = emailPriority;
		this.isBodyHtml = isBodyHtml;
		this.emailTo = emailTo;
		this.emailSubject = emailSubject;
		this.emailBody = emailBody;
		this.nextTryTime = nextTryTime;
		this.numberOfTries = numberOfTries;
	}

	/** full constructor */
	public AbstractHishopEmailQueue(Integer emailPriority, Boolean isBodyHtml,
			String emailTo, String emailCc, String emailBcc,
			String emailSubject, String emailBody, Date nextTryTime,
			Integer numberOfTries) {
		this.emailPriority = emailPriority;
		this.isBodyHtml = isBodyHtml;
		this.emailTo = emailTo;
		this.emailCc = emailCc;
		this.emailBcc = emailBcc;
		this.emailSubject = emailSubject;
		this.emailBody = emailBody;
		this.nextTryTime = nextTryTime;
		this.numberOfTries = numberOfTries;
	}

	// Property accessors

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getEmailPriority() {
		return this.emailPriority;
	}

	public void setEmailPriority(Integer emailPriority) {
		this.emailPriority = emailPriority;
	}

	public Boolean getIsBodyHtml() {
		return this.isBodyHtml;
	}

	public void setIsBodyHtml(Boolean isBodyHtml) {
		this.isBodyHtml = isBodyHtml;
	}

	public String getEmailTo() {
		return this.emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getEmailCc() {
		return this.emailCc;
	}

	public void setEmailCc(String emailCc) {
		this.emailCc = emailCc;
	}

	public String getEmailBcc() {
		return this.emailBcc;
	}

	public void setEmailBcc(String emailBcc) {
		this.emailBcc = emailBcc;
	}

	public String getEmailSubject() {
		return this.emailSubject;
	}

	public void setEmailSubject(String emailSubject) {
		this.emailSubject = emailSubject;
	}

	public String getEmailBody() {
		return this.emailBody;
	}

	public void setEmailBody(String emailBody) {
		this.emailBody = emailBody;
	}

	public Date getNextTryTime() {
		return this.nextTryTime;
	}

	public void setNextTryTime(Date nextTryTime) {
		this.nextTryTime = nextTryTime;
	}

	public Integer getNumberOfTries() {
		return this.numberOfTries;
	}

	public void setNumberOfTries(Integer numberOfTries) {
		this.numberOfTries = numberOfTries;
	}

}