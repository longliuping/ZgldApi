package com.zgld.api.beans;

/**
 * HishopOrderLookupItems entity. @author MyEclipse Persistence Tools
 */
public class HishopOrderLookupItems extends AbstractHishopOrderLookupItems implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopOrderLookupItems() {
	}

	/** minimal constructor */
	public HishopOrderLookupItems(HishopOrderLookupLists hishopOrderLookupLists, String name, Boolean isUserInputRequired) {
		super(hishopOrderLookupLists, name, isUserInputRequired);
	}

	/** full constructor */
	public HishopOrderLookupItems(HishopOrderLookupLists hishopOrderLookupLists, String name, Boolean isUserInputRequired, String userInputTitle, Double appendMoney, Integer calculateMode, String remark) {
		super(hishopOrderLookupLists, name, isUserInputRequired, userInputTitle, appendMoney, calculateMode, remark);
	}

}
