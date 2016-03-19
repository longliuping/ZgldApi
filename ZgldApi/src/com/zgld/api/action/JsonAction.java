package com.zgld.api.action;

import java.io.InputStream;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.zgld.api.beans.AspnetMembers;
import com.zgld.api.beans.AspnetUsers;
import com.zgld.api.beans.AspnetUsersInRoles;
import com.zgld.api.beans.HishopAttributeValues;
import com.zgld.api.beans.HishopAttributes;
import com.zgld.api.beans.HishopOrderItems;
import com.zgld.api.beans.HishopOrders;
import com.zgld.api.beans.HishopProductTypes;
import com.zgld.api.beans.HishopProducts;
import com.zgld.api.beans.HishopShoppingCarts;
import com.zgld.api.beans.HishopSkuitems;
import com.zgld.api.beans.HishopSkus;
import com.zgld.api.beans.HishopUserShippingAddresses;
import com.zgld.api.beans.HomeBanner;
import com.zgld.api.beans.Supplier;
import com.zgld.api.utils.AddressXmlUtils;
import com.zgld.api.utils.DateUtils;

public class JsonAction extends BaseAction {

	/**
	 * 用户登录
	 */
	public String user_login() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			if (form.getName() == null || form.getName().isEmpty()) {
				form.setJsonMsg("用户名不能为空", false, json, 1001);
			} else if (form.getPassword() == null || form.getPassword().isEmpty()) {
				form.setJsonMsg("密码不能为空", false, json, 1001);
			} else if (form.getId() == null) {
				form.setJsonMsg("id不能为空", false, json, 1001);
			} else {
				AspnetUsers user = baseBiz.findUserinfoByUserName(form.getName());
				if (user != null) {
					if (user == null || !user.getPassword().equals(pwd(form.getPassword(), user.getPasswordSalt()))) {
						form.setJsonMsg("用户名或者密码错误", false, json, 1001);
					} else {
						user.setUserToken(setUserToken(user.getUserId()));
						json.put(INFO, user);
						form.setJsonMsg("登录成功", true, json, 200);
					}
				} else {
					form.setJsonMsg("用户名不存在", false, json, 1001);
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
	 * 注册
	 * 
	 * @return
	 */
	public String usere_register() {

		Map<String, Object> json = new HashMap<String, Object>();
		try {
			if (form.getName() == null || form.getName().isEmpty()) {
				form.setJsonMsg("用户名name不能为空", false, json, 1001);
			} else if (form.getPassword() == null || form.getPassword().isEmpty()) {
				form.setJsonMsg("密码password不能为空", false, json, 1001);
			} else {
				AspnetUsers user = baseBiz.findUserinfoByUserName(form.getName());
				if (user != null) {
					form.setJsonMsg("用户名已经存在", false, json, 1001);
				} else {
					if (form.getId() != null && form.getId() > 10) {
						AspnetUsers u = (AspnetUsers) baseBiz.bean(" from AspnetUsers as u where u.userId = " + form.getId());
						if (u == null) {
							form.setJsonMsg("邀请码不存在", false, json, 1001);
						} else {
							json.put(INFO, reg_user());
							form.setJsonMsg("注册成功", true, json, 200);
						}
					} else {
						json.put(INFO, reg_user());
						form.setJsonMsg("注册成功", true, json, 200);
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
	 * 修改用户密码
	 * 
	 * @return
	 */
	public String update_user_password() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			AspnetUsers aspnetUsers = getUserInfo();
			if (aspnetUsers == null) {
				form.setJsonMsg(NO_USER, false, json, 201);
			} else if (form.getOldPassword() == null) {
				form.setJsonMsg("密码oldPassword不能为空", false, json, 1001);
			} else if (form.getPassword() == null) {
				form.setJsonMsg("密码password不能为空", false, json, 1001);
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
	 * 首页的banner
	 * 
	 * @return
	 */
	public String home_banner() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			List<HomeBanner> listBanner = new ArrayList<HomeBanner>();
			HomeBanner banner = new HomeBanner();
			banner.setImgUrl("http://www.jym1798.com:99/templates/master/fangjingdong/fckfiles/Files/Image/1.jpg");
			listBanner.add(banner);
			banner.setImgUrl("http://www.jym1798.com:99/templates/master/fangjingdong/fckfiles/Files/Image/2.jpg");
			listBanner.add(banner);
			banner.setImgUrl("http://www.jym1798.com:99/templates/master/fangjingdong/fckfiles/Files/Image/3.jpg");
			listBanner.add(banner);
			banner.setImgUrl("http://www.jym1798.com:99/templates/master/fangjingdong/fckfiles/Files/Image/4.jpg");
			listBanner.add(banner);
			banner.setImgUrl("http://www.jym1798.com:99/templates/master/fangjingdong/fckfiles/Files/Image/5.jpg");
			listBanner.add(banner);
			json.put("items", listBanner);
			form.setJsonMsg("success", true, json, 200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}

	/**
	 * 根据分类id 查询产品列表
	 * 
	 * @return
	 */
	public String home_type_product() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			if (form.getId() == null || form.getId() <= 0) {
				form.setJsonMsg("产品类型id不能为空", false, json);
			} else {
				List<HishopProducts> hishopProducts = (List<HishopProducts>) baseBiz.findPage(form.getPageNum(), form.getPageSize(), " from HishopProducts as p where p.typeId = " + form.getId() + " order by p.addedDate desc ");
				for (int i = 0; i < hishopProducts.size(); i++) {
					HishopProducts hishopProducts2 = hishopProducts.get(i);
					HishopSkus hishopSkus = (HishopSkus) baseBiz.bean(" from HishopSkus as hs where hs.productId =" + hishopProducts2.getProductId() + " order by hs.salePrice asc");
					hishopProducts2.setHishopSkus(hishopSkus);
					hishopProducts.set(i, hishopProducts2);
					System.out.println(hishopProducts2.getProductName());
					System.out.println(hishopProducts2.getHishopSkus().getSalePrice());
				}
				json.put("listInfo", hishopProducts);
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
	 * 查询每一个分类产品
	 * 
	 * @return
	 */
	public String home_all_product() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			List<HishopProductTypes> listTypes = (List<HishopProductTypes>) baseBiz.findAll(" from HishopProductTypes");
			for (int i = 0; i < listTypes.size(); i++) {
				HishopProductTypes info = listTypes.get(i);
				List<HishopProducts> hishopProducts = (List<HishopProducts>) baseBiz.findPage(1, 3, " from HishopProducts as p where p.typeId = " + info.getTypeId() + " order by p.addedDate asc ");
				for (int j = 0; j < hishopProducts.size(); j++) {
					HishopProducts hishopProducts2 = hishopProducts.get(j);
					HishopSkus hishopSkus = (HishopSkus) baseBiz.bean(" from HishopSkus as hs where hs.productId =" + hishopProducts2.getProductId() + " order by hs.salePrice asc");
					hishopProducts2.setHishopSkus(hishopSkus);
					System.out.println(hishopProducts2.getProductName());
					System.out.println(hishopProducts2.getHishopSkus().getSalePrice());
					hishopProducts.set(j, hishopProducts2);
				}
				info.setHishopProducts(hishopProducts);
				listTypes.set(i, info);
			}
			json.put("listInfo", listTypes);
			form.setJsonMsg("success", true, json, 200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}

	/**
	 * 查询用户购物车的所有产品
	 * 
	 * @return
	 */
	public String user_car_product() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			AspnetUsers aspnetUsers = getUserInfo();
			if (aspnetUsers == null) {
				form.setJsonMsg(NO_USER, false, json, 201);
			} else {
				int userId = aspnetUsers.getUserId();
				List<HishopShoppingCarts> lsitHishopShoppingCarts = (List<HishopShoppingCarts>) baseBiz.findAll(" from HishopShoppingCarts as sc where sc.userId = " + userId + " order by sc.addTime desc ");
				for (int i = 0; i < lsitHishopShoppingCarts.size(); i++) {
					HishopShoppingCarts hishopShoppingCarts = lsitHishopShoppingCarts.get(i);
					HishopProducts hishopProducts = (HishopProducts) baseBiz.bean(" from HishopProducts as hp where hp.productId = " + hishopShoppingCarts.getProductId());
					// 产品价格
					HishopSkus hishopSkus = (HishopSkus) baseBiz.bean(" from HishopSkus as hs where hs.productId =" + hishopProducts.getProductId() + " and hs.skuId = '" + hishopShoppingCarts.getSkuId() + "'");
					hishopProducts.setHishopSkus(hishopSkus);
					// 产品规格
					List<HishopSkuitems> listHishopSkuitems = (List<HishopSkuitems>) baseBiz.findAll(" from HishopSkuitems as hs where hs.skuId = '" + hishopShoppingCarts.getSkuId() + "'");
					for (int j = 0; j < listHishopSkuitems.size(); j++) {
						HishopSkuitems hishopSkuitems = listHishopSkuitems.get(j);
						HishopAttributes hishopAttributes = (HishopAttributes) baseBiz.bean(" from HishopAttributes as ha where ha.attributeId = " + hishopSkuitems.getAttributeId());
						HishopAttributeValues hishopAttributeValues = (HishopAttributeValues) baseBiz.bean(" from HishopAttributeValues as hav where hav.valueId = " + hishopSkuitems.getValueId());
						hishopSkuitems.setHishopAttributes(hishopAttributes);
						hishopSkuitems.setHishopAttributeValues(hishopAttributeValues);
						listHishopSkuitems.set(j, hishopSkuitems);
					}
					hishopProducts.setListHishopSkuitems(listHishopSkuitems);
					// hishopShoppingCarts.setHishopProducts(hishopProducts);
					List<HishopProducts> list = new ArrayList<HishopProducts>();
					list.add(hishopProducts);
					hishopShoppingCarts.setListHishopProducts(list);
					lsitHishopShoppingCarts.set(i, hishopShoppingCarts);
				}
				if (lsitHishopShoppingCarts != null && lsitHishopShoppingCarts.size() > 0) {
					for (int i = 0; i < lsitHishopShoppingCarts.size(); i++) {
						HishopShoppingCarts carts = lsitHishopShoppingCarts.get(i);
						Supplier supplier = (Supplier) baseBiz.bean(" from Supplier as s where s.userId = " + carts.getListHishopProducts().get(0).getUserid());
						carts.setSupplier(supplier);
						lsitHishopShoppingCarts.set(i, carts);
					}
				}
				json.put("listInfo", lsitHishopShoppingCarts);
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
	 * 产品详细页面
	 */
	public String product_detail() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			if (form.getId() == null) {
				form.setJsonMsg("产品id不能为空", false, json, 1001);
			} else {
				int productId = form.getId();
				// 查询产品详细
				HishopProducts hishopProducts = (HishopProducts) baseBiz.bean(" from HishopProducts as p where p.productId = " + productId);
				Supplier info = (Supplier) baseBiz.bean(" from Supplier as s where s.userId = " + hishopProducts.getUserid());
				// 规格
				List<HishopSkus> hishopSkus = (List<HishopSkus>) baseBiz.findAll(" from HishopSkus as s where s.productId = " + productId);
				StringBuffer hqlHishopAttributes = new StringBuffer(" from HishopAttributes as ha where ");
				StringBuffer hqlHishopAttributeValues = new StringBuffer(" from HishopAttributeValues as hav where ");
				List<HishopSkuitems> listHishopSkuitems = new ArrayList<HishopSkuitems>();
				for (int i = 0; i < hishopSkus.size(); i++) {
					HishopSkus hishopSkus2 = hishopSkus.get(i);
					List<HishopSkuitems> hishopSkuitems = (List<HishopSkuitems>) baseBiz.findAll(" from HishopSkuitems as hsi where hsi.skuId = '" + hishopSkus2.getSkuId() + "'");
					for (int j = 0; j < hishopSkuitems.size(); j++) {
						HishopSkuitems hishopSkuitems2 = hishopSkuitems.get(j);
						listHishopSkuitems.add(hishopSkuitems2);
						hqlHishopAttributes.append(" ha.attributeId = " + hishopSkuitems2.getAttributeId() + " or ");
						hqlHishopAttributeValues.append(" hav.valueId = " + hishopSkuitems2.getValueId() + " or ");
					}
					hishopSkus2.setHishopSkuitems(hishopSkuitems);
					hishopSkus.set(i, hishopSkus2);
				}
				hishopProducts.setListHishopSkuitems(listHishopSkuitems);
				hishopProducts.setListHishopSkus(hishopSkus);
				hqlHishopAttributes.delete(hqlHishopAttributes.toString().length() - 3, hqlHishopAttributes.toString().length());
				hqlHishopAttributeValues.delete(hqlHishopAttributeValues.toString().length() - 3, hqlHishopAttributeValues.toString().length());
				List<HishopAttributes> hishopAttributes = (List<HishopAttributes>) baseBiz.findAll(hqlHishopAttributes.toString() + " order by ha.displaySequence desc ");
				List<HishopAttributeValues> hishopAttributeValues = (List<HishopAttributeValues>) baseBiz.findAll(hqlHishopAttributeValues.toString() + " order by hav.displaySequence desc ");
				hishopProducts.setListHishopAttributes(hishopAttributes);
				hishopProducts.setListHishopAttributeValues(hishopAttributeValues);
				hishopProducts.setListHishopSkus(hishopSkus);

				System.out.println(hishopProducts.getProductName());

				for (int i = 0; i < hishopProducts.getListHishopSkus().size(); i++) {
					HishopSkus hishopSkus2 = hishopProducts.getListHishopSkus().get(i);
					System.out.println(hishopSkus2.getSalePrice());
				}
				for (int i = 0; i < hishopProducts.getListHishopAttributes().size(); i++) {
					System.out.println(hishopProducts.getListHishopAttributes().get(i).getAttributeName());
				}
				for (int i = 0; i < hishopProducts.getListHishopAttributeValues().size(); i++) {
					System.out.println(hishopProducts.getListHishopAttributeValues().get(i).getValueStr());
				}
				info.setHishopProducts(hishopProducts);
				json.put("info", info);
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
	 * 加入产品到购物车
	 * 
	 * @return
	 */
	public String add_product_car() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			if (form.getSkuId() == null) {
				form.setJsonMsg("skuId不能为空", false, json, 1001);
			} else if (form.getProductId() == null || form.getSkuId().isEmpty()) {
				form.setJsonMsg("productuId不能为空", false, json, 1001);
			} else if (form.getNumber() == null) {
				form.setJsonMsg("number不能为空", false, json, 1001);
			} else {
				AspnetUsers aspnetUsers = getUserInfo();
				if (aspnetUsers == null) {
					form.setJsonMsg(NO_USER, false, json, 201);
				} else {
					int userId = aspnetUsers.getUserId();
					String skuId = form.getSkuId();
					int productId = form.getProductId();
					int number = form.getNumber();
					HishopSkus hishopSkus = (HishopSkus) baseBiz.bean(" from HishopSkus as hs where hs.skuId = '" + skuId + "' and hs.productId = " + productId);
					if (hishopSkus == null) {
						form.setJsonMsg("产品信息不存在", true, json, 1001);
					} else if (number > hishopSkus.getStock()) {
						form.setJsonMsg("购买数量不能大于库存数量:" + hishopSkus.getStock(), true, json, 1001);
					} else {
						HishopShoppingCarts hishopShoppingCarts = (HishopShoppingCarts) baseBiz.bean(" from HishopShoppingCarts as sc where sc.skuId = '" + skuId + "' and sc.productId = " + productId);
						if (hishopShoppingCarts != null) {
							if (hishopShoppingCarts.getQuantity() + number > hishopSkus.getStock()) {
								form.setJsonMsg("购买数量不能大于库存数量:" + hishopSkus.getStock(), true, json, 1001);
							} else {
								hishopShoppingCarts.setQuantity(hishopShoppingCarts.getQuantity() + number);
								baseBiz.update(hishopShoppingCarts);
								form.setJsonMsg("添加成功", true, json, 200);
							}
						} else {
							HishopShoppingCarts carts = new HishopShoppingCarts();
							carts.setAddTime(new Date());
							carts.setProductId(productId);
							carts.setQuantity(number);
							carts.setSkuId(skuId);
							carts.setUserId(userId);
							baseBiz.save(carts);
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
	 * 删除购物车产品
	 * 
	 * @return
	 */
	public String delete_car_product() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			if (form.getProductId() == null) {
				form.setJsonMsg("productId不能为空", false, json, 1001);
			} else if (form.getSkuId() == null || form.getSkuId().isEmpty()) {
				form.setJsonMsg("skuId不能为空", false, json, 1001);
			} else {
				AspnetUsers aspnetUsers = getUserInfo();
				if (aspnetUsers == null) {
					form.setJsonMsg(NO_USER, false, json, 201);
				} else {
					int userId = aspnetUsers.getUserId();
					String skuId = form.getSkuId();
					int productId = form.getProductId();
					HishopShoppingCarts hishopShoppingCarts = (HishopShoppingCarts) baseBiz.bean(" from HishopShoppingCarts as hsc where hsc.userId = " + userId + " and hsc.skuId='" + skuId + "' and hsc.productId=" + productId);
					if (hishopShoppingCarts == null) {
						form.setJsonMsg("购物车产品信息不存在", true, json, 1001);
					} else {
						baseBiz.delete(hishopShoppingCarts);
						form.setJsonMsg("删除成功", true, json, 200);
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
	 * 更新购物车产品数量
	 * 
	 * @return
	 */
	public String update_car_product_quantity() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			if (form.getSkuId() == null || form.getSkuId().isEmpty()) {
				form.setJsonMsg("skuId不能为空", false, json, 1001);
			} else if (form.getSkuNumber() == null) {
				form.setJsonMsg("skuNumber不能为空", false, json, 1001);
			} else {
				String skuIds[] = form.getSkuId().split("|");
				String skuNumbers[] = form.getSkuNumber().split("|");
				if (skuIds.length != skuNumbers.length) {
					form.setJsonMsg("数据格式错误", false, json, 1001);
				} else {
					AspnetUsers aspnetUsers = getUserInfo();
					if (aspnetUsers == null) {
						form.setJsonMsg(NO_USER, false, json, 201);
					} else {
						int userId = aspnetUsers.getUserId();
						StringBuffer sbHql = new StringBuffer(" select count(*) from HishopShoppingCarts as hsc where ");
						for (String string : skuIds) {
							sbHql.append(" hsc.skuId = '" + string + "' or ");
						}
						sbHql.delete(sbHql.length() - 3, sbHql.length());
						int count = baseBiz.count(sbHql.toString() + " and hsc.userId = " + userId);
						if (count != skuIds.length) {
							form.setJsonMsg("购物车有部分产品已经被删除了，请刷新购物车后重试！", false, json, 1001);
						} else {
							String message = "";
							for (int i = 0; i < skuIds.length; i++) {
								HishopSkus hishopSkus = (HishopSkus) baseBiz.bean(" from HishopSkus as hs where hs.skuId = '" + skuIds[i] + "'");
								if (skuNumbers.length > hishopSkus.getStock()) {
									message += "商品货号:" + hishopSkus.getSku() + "   购买数量不能大于库存数量:" + hishopSkus.getStock() + "  请修改购买数量后重试!";
									break;
								}
							}
							if (message.length() > 5) {
								form.setJsonMsg(message, false, json, 1001);
							} else {
								for (int i = 0; i < skuIds.length; i++) {
									HishopShoppingCarts hsc = (HishopShoppingCarts)baseBiz.bean(" from HishopShoppingCarts as hsc where hsc.skuId = '"+skuIds[i]+"' and hsc.userId = "+userId);
									hsc.setQuantity(Integer.parseInt(skuNumbers[i]));
									baseBiz.save(hsc);
									form.setJsonMsg("修改成功", true, json, 200);
								}
							}
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
			form.setJsonMsg("success", true, json, 200);
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
					form.setJsonMsg("success", true, json, 200);
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
