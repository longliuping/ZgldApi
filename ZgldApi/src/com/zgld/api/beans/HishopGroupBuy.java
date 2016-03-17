package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.Set;

/**
 * HishopGroupBuy entity. @author MyEclipse Persistence Tools
 */
public class HishopGroupBuy extends AbstractHishopGroupBuy implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopGroupBuy() {
	}

	/** minimal constructor */
	public HishopGroupBuy(HishopProducts hishopProducts, Double needPrice,
			Timestamp startDate, Timestamp endDate, Integer maxCount,
			Integer status, Integer displaySequence) {
		super(hishopProducts, needPrice, startDate, endDate, maxCount, status,
				displaySequence);
	}

	/** full constructor */
	public HishopGroupBuy(HishopProducts hishopProducts, Double needPrice,
			Timestamp startDate, Timestamp endDate, Integer maxCount,
			String content, Integer status, Integer displaySequence,
			Set hishopGroupBuyConditions) {
		super(hishopProducts, needPrice, startDate, endDate, maxCount, content,
				status, displaySequence, hishopGroupBuyConditions);
	}

}
