package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopLeaveComments entity provides the base persistence definition
 * of the HishopLeaveComments entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopLeaveComments implements
		java.io.Serializable {

	// Fields

	private Long leaveId;
	private Integer userId;
	private String userName;
	private String title;
	private String publishContent;
	private Date publishDate;
	private Date lastDate;
	private Boolean isReply;
	private Set hishopLeaveCommentReplyses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHishopLeaveComments() {
	}

	/** minimal constructor */
	public AbstractHishopLeaveComments(String title, String publishContent,
			Date publishDate, Date lastDate, Boolean isReply) {
		this.title = title;
		this.publishContent = publishContent;
		this.publishDate = publishDate;
		this.lastDate = lastDate;
		this.isReply = isReply;
	}

	/** full constructor */
	public AbstractHishopLeaveComments(Integer userId, String userName,
			String title, String publishContent, Date publishDate,
			Date lastDate, Boolean isReply, Set hishopLeaveCommentReplyses) {
		this.userId = userId;
		this.userName = userName;
		this.title = title;
		this.publishContent = publishContent;
		this.publishDate = publishDate;
		this.lastDate = lastDate;
		this.isReply = isReply;
		this.hishopLeaveCommentReplyses = hishopLeaveCommentReplyses;
	}

	// Property accessors

	public Long getLeaveId() {
		return this.leaveId;
	}

	public void setLeaveId(Long leaveId) {
		this.leaveId = leaveId;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishContent() {
		return this.publishContent;
	}

	public void setPublishContent(String publishContent) {
		this.publishContent = publishContent;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public Date getLastDate() {
		return this.lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	public Boolean getIsReply() {
		return this.isReply;
	}

	public void setIsReply(Boolean isReply) {
		this.isReply = isReply;
	}

	public Set getHishopLeaveCommentReplyses() {
		return this.hishopLeaveCommentReplyses;
	}

	public void setHishopLeaveCommentReplyses(Set hishopLeaveCommentReplyses) {
		this.hishopLeaveCommentReplyses = hishopLeaveCommentReplyses;
	}

}