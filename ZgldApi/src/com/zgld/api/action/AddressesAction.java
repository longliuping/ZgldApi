package com.zgld.api.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zgld.api.beans.AspnetUsers;
import com.zgld.api.beans.HishopUserShippingAddresses;

public class AddressesAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 删除用户收货地址信息
	 * 
	 * @return
	 */
	public String delete_user_shipping_addresses() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			AspnetUsers aspnetUsers = getUserInfo();
			if (aspnetUsers == null) {
				form.setJsonMsg(NO_USER, false, json, 201);
			} else {
				int userId = aspnetUsers.getUserId();
				HishopUserShippingAddresses hishopUserShippingAddresses = (HishopUserShippingAddresses) baseBiz.bean(" from HishopUserShippingAddresses as hu where hu.userId = " + userId + " and hu.shippingId = " + form.getAddress().getShippingId());
				if (hishopUserShippingAddresses == null) {
					form.setJsonMsg("要删除的地址信息不存在", false, json, 1001);
				} else {
					baseBiz.delete(hishopUserShippingAddresses);
					form.setJsonMsg("删除成功", true, json, 200);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}

	/**
	 * 添加收货地址
	 * 
	 * @return
	 */
	public String add_user_shipping_addresses() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			HishopUserShippingAddresses info = form.getAddress();
			AspnetUsers aspnetUsers = getUserInfo();
			if (aspnetUsers == null) {
				form.setJsonMsg(NO_USER, false, json, 201);
			} else {
				int userId = aspnetUsers.getUserId();
				if (info.getRegionId() == null) {
					form.setJsonMsg("address.regionId不能为空", false, json, 1001);
				} else if (info.getShipTo() == null) {
					form.setJsonMsg("address.shipTo不能为空", false, json, 1001);
				} else if (info.getAddress() == null) {
					form.setJsonMsg("address.address不能为空", false, json, 1001);
				} else if (info.getZipcode() == null) {
					form.setJsonMsg("address.zipcode不能为空", false, json, 1001);
				} else if (info.getTelPhone() == null) {
					form.setJsonMsg("address.telPhone不能为空", false, json, 1001);
				} else if (info.getCellPhone() == null) {
					form.setJsonMsg("address.cellPhone不能为空", false, json, 1001);
				} else {
					info.setUserId(userId);
					baseBiz.save(info);
					form.setJsonMsg("添加成功", true, json, 200);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}
	/**
	 * 用户 所有的收货地址
	 * 
	 * @return
	 */
	public String user_shipping_addresses() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			AspnetUsers aspnetUsers = getUserInfo();
			if (aspnetUsers == null) {
				form.setJsonMsg(NO_USER, false, json, 201);
			} else {
				int userId = aspnetUsers.getUserId();
				List<HishopUserShippingAddresses> hishopUserShippingAddresses = (List<HishopUserShippingAddresses>) baseBiz.findAll(" from HishopUserShippingAddresses as hu where hu.userId = " + userId);
				for (HishopUserShippingAddresses hishopUserShippingAddresses2 : hishopUserShippingAddresses) {
					System.out.println(hishopUserShippingAddresses2.getAddress());
				}
				json.put("listInfo", hishopUserShippingAddresses);
				form.setJsonMsg("success", true, json, 200);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}

	/**
	 * 修改用户收货地址信息
	 * 
	 * @return
	 */
	public String update_user_shipping_addresses() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			AspnetUsers aspnetUsers = getUserInfo();
			if (aspnetUsers == null) {
				form.setJsonMsg(NO_USER, false, json, 201);
			} else {
				int userId = aspnetUsers.getUserId();
				HishopUserShippingAddresses info = form.getAddress();
				if (info.getShippingId() == null) {
					form.setJsonMsg("address.shippingId不能为空", false, json, 1001);
				} else if (info.getRegionId() == null) {
					form.setJsonMsg("address.regionId不能为空", false, json, 1001);
				} else if (info.getShipTo() == null) {
					form.setJsonMsg("address.shipTo不能为空", false, json, 1001);
				} else if (info.getAddress() == null) {
					form.setJsonMsg("address.address不能为空", false, json, 1001);
				} else if (info.getZipcode() == null) {
					form.setJsonMsg("address.zipcode不能为空", false, json, 1001);
				} else if (info.getTelPhone() == null) {
					form.setJsonMsg("address.telPhone不能为空", false, json, 1001);
				} else if (info.getCellPhone() == null) {
					form.setJsonMsg("address.cellPhone不能为空", false, json, 1001);
				} else {
					HishopUserShippingAddresses hishopUserShippingAddresses = (HishopUserShippingAddresses) baseBiz.bean(" from HishopUserShippingAddresses as hu where hu.userId = " + userId + " and hu.shippingId = " + form.getAddress().getShippingId());
					if (hishopUserShippingAddresses == null) {
						form.setJsonMsg("要修改的地址信息不存在", false, json, 1001);
					} else if (!hishopUserShippingAddresses.getUserId().equals(userId)) {
						form.setJsonMsg("你没有权限修改", false, json, 1001);
					} else {
						hishopUserShippingAddresses.setAddress(form.getAddress().getAddress());
						hishopUserShippingAddresses.setCellPhone(form.getAddress().getCellPhone());
						hishopUserShippingAddresses.setRegionId(form.getAddress().getRegionId());
						hishopUserShippingAddresses.setShipTo(form.getAddress().getShipTo());
						hishopUserShippingAddresses.setTelPhone(form.getAddress().getTelPhone());
						hishopUserShippingAddresses.setZipcode(form.getAddress().getZipcode());
						baseBiz.update(hishopUserShippingAddresses);
						form.setJsonMsg("修改成功", true, json, 200);
					}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}
}
