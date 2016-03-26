package com.zgld.api.beans;

/**
 * AbstractHishopMessageTemplates entity provides the base persistence
 * definition of the HishopMessageTemplates entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopMessageTemplates implements java.io.Serializable {

	// Fields

	private String messageType;
	private String name;
	private Boolean sendEmail;
	private Boolean sendSms;
	private Boolean sendInnerMessage;
	private String tagDescription;
	private String emailSubject;
	private String emailBody;
	private String innerMessageSubject;
	private String innerMessageBody;
	private String smsbody;

	// Constructors

	/** default constructor */
	public AbstractHishopMessageTemplates() {
	}

	/** full constructor */
	public AbstractHishopMessageTemplates(String name, Boolean sendEmail, Boolean sendSms, Boolean sendInnerMessage, String tagDescription, String emailSubject, String emailBody, String innerMessageSubject, String innerMessageBody, String smsbody) {
		this.name = name;
		this.sendEmail = sendEmail;
		this.sendSms = sendSms;
		this.sendInnerMessage = sendInnerMessage;
		this.tagDescription = tagDescription;
		this.emailSubject = emailSubject;
		this.emailBody = emailBody;
		this.innerMessageSubject = innerMessageSubject;
		this.innerMessageBody = innerMessageBody;
		this.smsbody = smsbody;
	}

	// Property accessors

	public String getMessageType() {
		return this.messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getSendEmail() {
		return this.sendEmail;
	}

	public void setSendEmail(Boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

	public Boolean getSendSms() {
		return this.sendSms;
	}

	public void setSendSms(Boolean sendSms) {
		this.sendSms = sendSms;
	}

	public Boolean getSendInnerMessage() {
		return this.sendInnerMessage;
	}

	public void setSendInnerMessage(Boolean sendInnerMessage) {
		this.sendInnerMessage = sendInnerMessage;
	}

	public String getTagDescription() {
		return this.tagDescription;
	}

	public void setTagDescription(String tagDescription) {
		this.tagDescription = tagDescription;
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

	public String getInnerMessageSubject() {
		return this.innerMessageSubject;
	}

	public void setInnerMessageSubject(String innerMessageSubject) {
		this.innerMessageSubject = innerMessageSubject;
	}

	public String getInnerMessageBody() {
		return this.innerMessageBody;
	}

	public void setInnerMessageBody(String innerMessageBody) {
		this.innerMessageBody = innerMessageBody;
	}

	public String getSmsbody() {
		return this.smsbody;
	}

	public void setSmsbody(String smsbody) {
		this.smsbody = smsbody;
	}

}