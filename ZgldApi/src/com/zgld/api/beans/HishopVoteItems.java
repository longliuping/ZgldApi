package com.zgld.api.beans;

/**
 * HishopVoteItems entity. @author MyEclipse Persistence Tools
 */
public class HishopVoteItems extends AbstractHishopVoteItems implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopVoteItems() {
	}

	/** full constructor */
	public HishopVoteItems(HishopVotes hishopVotes, String voteItemName, Integer itemCount) {
		super(hishopVotes, voteItemName, itemCount);
	}

}
