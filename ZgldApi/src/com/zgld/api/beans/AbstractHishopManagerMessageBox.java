package com.zgld.api.beans;

/**
 * AbstractHishopManagerMessageBox entity provides the base persistence
 * definition of the HishopManagerMessageBox entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopManagerMessageBox implements
		java.io.Serializable {

	// Fields

	private Long messageId;
	private Long contentId;
	private String sernder;
	private String accepter;
	private Boolean isRead;

	// Constructors

	/** default constructor */
	public AbstractHishopManagerMessageBox() {
	}

	/** full constructor */
	public AbstractHishopManagerMessageBox(Long contentId, String sernder,
			String accepter, Boolean isRead) {
		this.contentId = contentId;
		this.sernder = sernder;
		this.accepter = accepter;
		this.isRead = isRead;
	}

	// Property accessors

	public Long getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}

	public Long getContentId() {
		return this.contentId;
	}

	public void setContentId(Long contentId) {
		this.contentId = contentId;
	}

	public String getSernder() {
		return this.sernder;
	}

	public void setSernder(String sernder) {
		this.sernder = sernder;
	}

	public String getAccepter() {
		return this.accepter;
	}

	public void setAccepter(String accepter) {
		this.accepter = accepter;
	}

	public Boolean getIsRead() {
		return this.isRead;
	}

	public void setIsRead(Boolean isRead) {
		this.isRead = isRead;
	}

}