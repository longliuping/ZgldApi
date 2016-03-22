package com.zgld.api.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zgld.api.beans.AspnetUsers;
import com.zgld.api.beans.HishopAttributeValues;
import com.zgld.api.beans.HishopAttributes;
import com.zgld.api.beans.HishopOrderItems;
import com.zgld.api.beans.HishopOrders;
import com.zgld.api.beans.HishopProducts;
import com.zgld.api.beans.HishopShoppingCarts;
import com.zgld.api.beans.HishopSkuitems;
import com.zgld.api.beans.HishopSkus;
import com.zgld.api.beans.HishopUserShippingAddresses;
import com.zgld.api.utils.DateUtils;

public class OrderAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 提交订单
	 * 
	 * @return
	 */
	public String submit_order() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			AspnetUsers aspnetUsers = getUserInfo();
			if (aspnetUsers == null) {
				form.setJsonMsg(NO_USER, false, json, 201);
			} else if (form.getSkuId() == null) {
				form.setJsonMsg("skuId不能为空", false, json, 1001);
			} else if (form.getSkuNumber() == null) {
				form.setJsonMsg("skuNumber不能为空", false, json, 1001);
			} else {
				String skuId[] = form.getSkuId().split(",");
				String skuNumber[] = form.getSkuNumber().split(",");
				String message = "";
				String skuIdStr = "";
				for (int i = 0; i < skuId.length; i++) {
					HishopSkus hishopSkus = (HishopSkus) baseBiz.bean(" from HishopSkus as hs where hs.skuId = '" + skuId[i] + "'");
					if (hishopSkus != null) {
						int number = Integer.parseInt(skuNumber[i]);
						if (number > hishopSkus.getStock()) {
							message += "skuId:" + hishopSkus.getSkuId() + "产品库存不能大于" + hishopSkus.getStock() + ";";
						} else {
							skuIdStr += hishopSkus.getSkuId() + ",";
						}
					}
				}
				if (message.length() > 5) {
					form.setJsonMsg("产品库存不足，请删减后重试!" + message, false, json, 1001);
				} else if (skuIdStr.length() < 5) {
					form.setJsonMsg("购买的产品不存在", false, json, 1001);
				} else {
					int userId = aspnetUsers.getUserId();
					String orderId = DateUtils.order_no();// 订单号
					AspnetUsers users = (AspnetUsers) baseBiz.bean(" from AspnetUsers as au where au.userId = " + userId);
					// 地址信息
					HishopUserShippingAddresses address = (HishopUserShippingAddresses) baseBiz.bean(" from HishopUserShippingAddresses as usa where usa.userId = " + userId);
					if (address == null) {
						form.setJsonMsg("请填写收货地址", false, json, 1001);
					} else {
						List<HishopShoppingCarts> hishopShoppingCarts = (List<HishopShoppingCarts>) baseBiz.findAll(" from HishopShoppingCarts as sc where userId = " + userId);
						if (hishopShoppingCarts == null) {
							form.setJsonMsg("购物车是空的，请添加产品", false, json, 1001);
						} else {
							for (HishopShoppingCarts hishopShoppingCarts2 : hishopShoppingCarts) {
								HishopSkus hishopSkus = (HishopSkus) baseBiz.bean(" from HishopSkus as hs where hs.skuId = '" + hishopShoppingCarts2.getSkuId() + "' and hs.productId = " + hishopShoppingCarts2.getProductId());
								HishopProducts products = (HishopProducts) baseBiz.bean(" from HishopProducts as hp where hp.productId = " + hishopShoppingCarts2.getProductId());
								List<HishopSkuitems> skuitems = (List<HishopSkuitems>) baseBiz.bean(" from HishopSkuitems as hs where hs.skuId = '" + hishopShoppingCarts2.getSkuId() + "'");
								// List<HishopSkuitems> skuitems =
								// (List<HishopSkuitems>)baseBiz.findAll(" from HishopSkuitems as hs where hs.skuId = '40_93_75'");
								String skuStr = "";
								for (HishopSkuitems hishopSkuitems : skuitems) {
									HishopAttributes hishopAttributes = (HishopAttributes) baseBiz.bean(" from HishopAttributes as ha where ha.attributeId = " + hishopSkuitems.getAttributeId());
									HishopAttributeValues hishopAttributeValues = (HishopAttributeValues) baseBiz.bean(" from HishopAttributeValues as hav where hav.valueId = " + hishopSkuitems.getValueId() + " and hav.attributeId = '" + hishopSkuitems.getAttributeId() + "'");
									skuStr += hishopAttributes.getAttributeName() + "：" + hishopAttributeValues.getValueStr() + ";";
								}
								HishopOrderItems items = new HishopOrderItems();
								items.setOrderId(orderId);
								items.setSkuId(hishopShoppingCarts2.getSkuId());
								items.setProductId(hishopShoppingCarts2.getProductId());
								items.setSku(hishopSkus.getSku());
								items.setQuantity(hishopShoppingCarts2.getQuantity());
								items.setShipmentQuantity(1);
								items.setCostPrice(hishopSkus.getCostPrice());
								items.setItemListPrice(hishopSkus.getSalePrice());
								items.setItemAdjustedPrice(hishopSkus.getSalePrice());
								items.setItemDescription(products.getProductName());
								items.setThumbnailsUrl(products.getThumbnailUrl40());
								items.setWeight(Long.parseLong(hishopSkus.getWeight() + ""));
								items.setSkucontent(skuStr);
							}

							HishopOrders orders = new HishopOrders();
							orders.setOrderId(orderId);
							orders.setOrderStatus(1);
							orders.setOrderDate(new Date());
							orders.setUserId(userId);
							orders.setUsername(users.getUserName());
							orders.setEmailAddress(users.getEmail());
							orders.setShippingRegion("");
							orders.setAddress(address.getAddress());
							orders.setZipCode(address.getZipcode());
							orders.setShipTo(address.getShipTo());
							orders.setTelPhone(address.getTelPhone());
							orders.setCellPhone(address.getAddress());
							orders.setRegionId(address.getRegionId());
							orders.setSourceOrder(1);

							baseBiz.save(orders);
							form.setJsonMsg("添加成功", true, json, 200);
						}
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

	/**
	 * 用户订单
	 * 
	 * @return
	 */
	public String user_order() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			int userId = 1117;
			List<HishopOrders> hishopOrders = (List<HishopOrders>) baseBiz.findPage(form.getPageNum(), form.getPageSize(), " from HishopOrders as order where order.userId = " + userId);
			for (int i = 0; i < hishopOrders.size(); i++) {
				List<HishopOrderItems> items = (List<HishopOrderItems>) baseBiz.findPage(form.getPageNum(), form.getPageSize(), " from HishopOrderItems as oi where oi.orderId = " + hishopOrders.get(i).getOrderId());
				hishopOrders.get(i).setListHishopOrderItems(items);
			}
			json.put("listInfo", hishopOrders);
			form.setJsonMsg(SUCCESS, true, json, 200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}

	/**
	 * 订单项
	 * 
	 * @return
	 */
	public String user_order_item() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			int userId = 1117;
			if (form.getId() == null) {
				form.setJsonMsg("id不能为空", false, json, 1001);
			} else {
				HishopOrders orders = (HishopOrders) baseBiz.bean(" from HishopOrders as order where order.userId = " + userId + " and order.orderId = '" + form.getId() + "'");
				if (orders == null) {
					form.setJsonMsg("订单不存在", false, json, 1001);
				} else {
					List<HishopOrderItems> items = (List<HishopOrderItems>) baseBiz.findPage(form.getPageNum(), form.getPageSize(), " from HishopOrderItems as oi where oi.orderId = " + orders.getOrderId());
					orders.setListHishopOrderItems(items);
					json.put("info", orders);
					form.setJsonMsg(SUCCESS, true, json, 200);
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
