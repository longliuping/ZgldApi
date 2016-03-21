package com.zgld.api.action;

import java.util.HashMap;
import java.util.Map;

import com.zgld.api.beans.AspnetUsers;

public class SupplierAction extends BaseAction {
	/**
	 * 商家的产品
	 * @return
	 */
	public String supplier_product(){
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			AspnetUsers aspnetUsers = getUserInfo();
			if (aspnetUsers == null) {
				form.setJsonMsg(NO_USER, false, json, 201);
			} else {
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}
}
