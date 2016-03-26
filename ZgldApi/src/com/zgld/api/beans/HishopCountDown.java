package com.zgld.api.beans;

import java.sql.Timestamp;

/**
 * HishopCountDown entity. @author MyEclipse Persistence Tools
 */
public class HishopCountDown extends AbstractHishopCountDown implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopCountDown() {
	}

	/** minimal constructor */
	public HishopCountDown(HishopProducts hishopProducts, Timestamp startDate, Timestamp endDate, Integer displaySequence, Double countDownPrice) {
		super(hishopProducts, startDate, endDate, displaySequence, countDownPrice);
	}

	/** full constructor */
	public HishopCountDown(HishopProducts hishopProducts, Timestamp startDate, Timestamp endDate, String content, Integer displaySequence, Double countDownPrice) {
		super(hishopProducts, startDate, endDate, content, displaySequence, countDownPrice);
	}

}
