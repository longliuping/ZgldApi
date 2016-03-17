package com.zgld.api.beans;

/**
 * AbstractHishopVoteItems entity provides the base persistence definition of
 * the HishopVoteItems entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopVoteItems implements java.io.Serializable {

	// Fields

	private Long voteItemId;
	private HishopVotes hishopVotes;
	private String voteItemName;
	private Integer itemCount;

	// Constructors

	/** default constructor */
	public AbstractHishopVoteItems() {
	}

	/** full constructor */
	public AbstractHishopVoteItems(HishopVotes hishopVotes,
			String voteItemName, Integer itemCount) {
		this.hishopVotes = hishopVotes;
		this.voteItemName = voteItemName;
		this.itemCount = itemCount;
	}

	// Property accessors

	public Long getVoteItemId() {
		return this.voteItemId;
	}

	public void setVoteItemId(Long voteItemId) {
		this.voteItemId = voteItemId;
	}

	public HishopVotes getHishopVotes() {
		return this.hishopVotes;
	}

	public void setHishopVotes(HishopVotes hishopVotes) {
		this.hishopVotes = hishopVotes;
	}

	public String getVoteItemName() {
		return this.voteItemName;
	}

	public void setVoteItemName(String voteItemName) {
		this.voteItemName = voteItemName;
	}

	public Integer getItemCount() {
		return this.itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

}