package com.zgld.api.beans;

/**
 * HishopMessageTemplates entity. @author MyEclipse Persistence Tools
 */
public class HishopMessageTemplates extends AbstractHishopMessageTemplates implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopMessageTemplates() {
	}

	/** full constructor */
	public HishopMessageTemplates(String name, Boolean sendEmail, Boolean sendSms, Boolean sendInnerMessage, String tagDescription, String emailSubject, String emailBody, String innerMessageSubject, String innerMessageBody, String smsbody) {
		super(name, sendEmail, sendSms, sendInnerMessage, tagDescription, emailSubject, emailBody, innerMessageSubject, innerMessageBody, smsbody);
	}

}
