package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopAffiche entity provides the base persistence definition of the
 * HishopAffiche entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopAffiche implements java.io.Serializable {

	// Fields

	private Integer afficheId;
	private String title;
	private String content;
	private Date addedDate;

	// Constructors

	/** default constructor */
	public AbstractHishopAffiche() {
	}

	/** minimal constructor */
	public AbstractHishopAffiche(String content, Date addedDate) {
		this.content = content;
		this.addedDate = addedDate;
	}

	/** full constructor */
	public AbstractHishopAffiche(String title, String content, Date addedDate) {
		this.title = title;
		this.content = content;
		this.addedDate = addedDate;
	}

	// Property accessors

	public Integer getAfficheId() {
		return this.afficheId;
	}

	public void setAfficheId(Integer afficheId) {
		this.afficheId = afficheId;
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

	public Date getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

}