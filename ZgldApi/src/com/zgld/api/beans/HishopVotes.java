package com.zgld.api.beans;

import java.util.Set;

/**
 * HishopVotes entity. @author MyEclipse Persistence Tools
 */
public class HishopVotes extends AbstractHishopVotes implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopVotes() {
	}

	/** minimal constructor */
	public HishopVotes(String voteName, Boolean isBackup, Integer maxCheck) {
		super(voteName, isBackup, maxCheck);
	}

	/** full constructor */
	public HishopVotes(String voteName, Boolean isBackup, Integer maxCheck, Set hishopVoteItemses) {
		super(voteName, isBackup, maxCheck, hishopVoteItemses);
	}

}
