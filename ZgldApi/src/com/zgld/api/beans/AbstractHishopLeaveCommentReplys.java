package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Date;

/**
 * AbstractHishopLeaveCommentReplys entity provides the base persistence
 * definition of the HishopLeaveCommentReplys entity. @author MyEclipse
 * Persistence Tools
 */

public abstract class AbstractHishopLeaveCommentReplys implements java.io.Serializable {

	// Fields

	private Long replyId;
	private HishopLeaveComments hishopLeaveComments;
	private Integer userId;
	private String replyContent;
	private Date replyDate;

	// Constructors

	/** default constructor */
	public AbstractHishopLeaveCommentReplys() {
	}

	/** full constructor */
	public AbstractHishopLeaveCommentReplys(HishopLeaveComments hishopLeaveComments, Integer userId, String replyContent, Date replyDate) {
		this.hishopLeaveComments = hishopLeaveComments;
		this.userId = userId;
		this.replyContent = replyContent;
		this.replyDate = replyDate;
	}

	// Property accessors

	public Long getReplyId() {
		return this.replyId;
	}

	public void setReplyId(Long replyId) {
		this.replyId = replyId;
	}

	public HishopLeaveComments getHishopLeaveComments() {
		return this.hishopLeaveComments;
	}

	public void setHishopLeaveComments(HishopLeaveComments hishopLeaveComments) {
		this.hishopLeaveComments = hishopLeaveComments;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getReplyContent() {
		return this.replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public Date getReplyDate() {
		return this.replyDate;
	}

	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}

}