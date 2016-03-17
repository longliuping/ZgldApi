package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopMessageContent entity provides the base persistence definition
 * of the HishopMessageContent entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopMessageContent implements
		java.io.Serializable {

	// Fields

	private Long contentId;
	private String title;
	private String content;
	private Date date;

	// Constructors

	/** default constructor */
	public AbstractHishopMessageContent() {
	}

	/** full constructor */
	public AbstractHishopMessageContent(String title, String content,
			Date date) {
		this.title = title;
		this.content = content;
		this.date = date;
	}

	// Property accessors

	public Long getContentId() {
		return this.contentId;
	}

	public void setContentId(Long contentId) {
		this.contentId = contentId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}