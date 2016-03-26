package com.zgld.api.beans;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractHishopVotes entity provides the base persistence definition of the
 * HishopVotes entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHishopVotes implements java.io.Serializable {

	// Fields

	private Long voteId;
	private String voteName;
	private Boolean isBackup;
	private Integer maxCheck;
	private Set hishopVoteItemses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractHishopVotes() {
	}

	/** minimal constructor */
	public AbstractHishopVotes(String voteName, Boolean isBackup, Integer maxCheck) {
		this.voteName = voteName;
		this.isBackup = isBackup;
		this.maxCheck = maxCheck;
	}

	/** full constructor */
	public AbstractHishopVotes(String voteName, Boolean isBackup, Integer maxCheck, Set hishopVoteItemses) {
		this.voteName = voteName;
		this.isBackup = isBackup;
		this.maxCheck = maxCheck;
		this.hishopVoteItemses = hishopVoteItemses;
	}

	// Property accessors

	public Long getVoteId() {
		return this.voteId;
	}

	public void setVoteId(Long voteId) {
		this.voteId = voteId;
	}

	public String getVoteName() {
		return this.voteName;
	}

	public void setVoteName(String voteName) {
		this.voteName = voteName;
	}

	public Boolean getIsBackup() {
		return this.isBackup;
	}

	public void setIsBackup(Boolean isBackup) {
		this.isBackup = isBackup;
	}

	public Integer getMaxCheck() {
		return this.maxCheck;
	}

	public void setMaxCheck(Integer maxCheck) {
		this.maxCheck = maxCheck;
	}

	public Set getHishopVoteItemses() {
		return this.hishopVoteItemses;
	}

	public void setHishopVoteItemses(Set hishopVoteItemses) {
		this.hishopVoteItemses = hishopVoteItemses;
	}

}