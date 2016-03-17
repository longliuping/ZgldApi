package com.zgld.api.beans;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

/**
 * HishopOrders entity. @author MyEclipse Persistence Tools
 */
public class HishopOrders extends AbstractHishopOrders implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public HishopOrders() {
	}
	List<HishopOrderItems> listHishopOrderItems;
	public List<HishopOrderItems> getListHishopOrderItems() {
		return listHishopOrderItems;
	}
	public void setListHishopOrderItems(List<HishopOrderItems> listHishopOrderItems) {
		this.listHishopOrderItems = listHishopOrderItems;
	}
	
}
