package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopCellphoneQueue entity. @author MyEclipse Persistence Tools
 */
public class HishopCellphoneQueue extends AbstractHishopCellphoneQueue
		implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopCellphoneQueue() {
	}

	/** full constructor */
	public HishopCellphoneQueue(String cellphoneNumber, String subject,
			Timestamp nextTryTime, Integer numberOfTries) {
		super(cellphoneNumber, subject, nextTryTime, numberOfTries);
	}

}
