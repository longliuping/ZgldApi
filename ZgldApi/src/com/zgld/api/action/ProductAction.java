package com.zgld.api.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zgld.api.beans.HishopAttributeValues;
import com.zgld.api.beans.HishopAttributes;
import com.zgld.api.beans.HishopProductTypes;
import com.zgld.api.beans.HishopProducts;
import com.zgld.api.beans.HishopSkuitems;
import com.zgld.api.beans.HishopSkus;
import com.zgld.api.beans.Supplier;

public class ProductAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
				List<HishopProducts> hishopProducts = (List<HishopProducts>) baseBiz
						.findPage(form.getPageNum(), form.getPageSize(),
								" from HishopProducts as p where p.typeId = "
										+ form.getId()
										+ " order by p.addedDate desc ");
				for (int i = 0; i < hishopProducts.size(); i++) {
					HishopProducts hishopProducts2 = hishopProducts.get(i);
					HishopSkus hishopSkus = (HishopSkus) baseBiz
							.bean(" from HishopSkus as hs where hs.productId ="
									+ hishopProducts2.getProductId()
									+ " order by hs.salePrice asc");
					hishopProducts2.setHishopSkus(hishopSkus);
					hishopProducts.set(i, hishopProducts2);
					System.out.println(hishopProducts2.getProductName());
					System.out.println(hishopProducts2.getHishopSkus()
							.getSalePrice());
				}
				json.put(LISTINFO, hishopProducts);
				form.setJsonMsg(SUCCESS, true, json, 200);
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
				HishopProducts hishopProducts = (HishopProducts) baseBiz
						.bean(" from HishopProducts as p where p.productId = "
								+ productId);
				Supplier info = (Supplier) baseBiz
						.bean(" from Supplier as s where s.userId = "
								+ hishopProducts.getUserid());
				// 规格
				List<HishopSkus> hishopSkus = (List<HishopSkus>) baseBiz
						.findAll(" from HishopSkus as s where s.productId = "
								+ productId);
				StringBuffer hqlHishopAttributes = new StringBuffer(
						" from HishopAttributes as ha where ");
				StringBuffer hqlHishopAttributeValues = new StringBuffer(
						" from HishopAttributeValues as hav where ");
				List<HishopSkuitems> listHishopSkuitems = new ArrayList<HishopSkuitems>();
				for (int i = 0; i < hishopSkus.size(); i++) {
					HishopSkus hishopSkus2 = hishopSkus.get(i);
					List<HishopSkuitems> hishopSkuitems = (List<HishopSkuitems>) baseBiz
							.findAll(" from HishopSkuitems as hsi where hsi.skuId = '"
									+ hishopSkus2.getSkuId() + "'");
					for (int j = 0; j < hishopSkuitems.size(); j++) {
						HishopSkuitems hishopSkuitems2 = hishopSkuitems.get(j);
						listHishopSkuitems.add(hishopSkuitems2);
						hqlHishopAttributes.append(" ha.attributeId = "
								+ hishopSkuitems2.getAttributeId() + " or ");
						hqlHishopAttributeValues.append(" hav.valueId = "
								+ hishopSkuitems2.getValueId() + " or ");
					}
					hishopSkus2.setHishopSkuitems(hishopSkuitems);
					hishopSkus.set(i, hishopSkus2);
				}
				hishopProducts.setListHishopSkuitems(listHishopSkuitems);
				hishopProducts.setListHishopSkus(hishopSkus);
				if (listHishopSkuitems != null && listHishopSkuitems.size() > 0) {
					hqlHishopAttributes.delete(hqlHishopAttributes.toString()
							.length() - 3, hqlHishopAttributes.toString()
							.length());
					hqlHishopAttributeValues.delete(hqlHishopAttributeValues
							.toString().length() - 3, hqlHishopAttributeValues
							.toString().length());
					List<HishopAttributes> hishopAttributes = (List<HishopAttributes>) baseBiz
							.findAll(hqlHishopAttributes.toString()
									+ " order by ha.displaySequence desc ");
					List<HishopAttributeValues> hishopAttributeValues = (List<HishopAttributeValues>) baseBiz
							.findAll(hqlHishopAttributeValues.toString()
									+ " order by hav.displaySequence desc ");
					hishopProducts.setListHishopAttributes(hishopAttributes);
					hishopProducts
							.setListHishopAttributeValues(hishopAttributeValues);
				}
				hishopProducts.setListHishopSkus(hishopSkus);

				System.out.println(hishopProducts.getProductName());

				for (int i = 0; i < hishopProducts.getListHishopSkus().size(); i++) {
					HishopSkus hishopSkus2 = hishopProducts.getListHishopSkus()
							.get(i);
					System.out.println(hishopSkus2.getSalePrice());
				}
				if (hishopProducts.getListHishopAttributes() != null) {
					for (int i = 0; i < hishopProducts
							.getListHishopAttributes().size(); i++) {
						System.out.println(hishopProducts
								.getListHishopAttributes().get(i)
								.getAttributeName());
					}
				}
				if (hishopProducts.getListHishopAttributeValues() != null) {
					for (int i = 0; i < hishopProducts
							.getListHishopAttributeValues().size(); i++) {
						System.out.println(hishopProducts
								.getListHishopAttributeValues().get(i)
								.getValueStr());
					}
				}
				info.setHishopProducts(hishopProducts);
				json.put(INFO, info);
				form.setJsonMsg(SUCCESS, true, json, 200);
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
			List<HishopProductTypes> listTypes = (List<HishopProductTypes>) baseBiz
					.findAll(" from HishopProductTypes");
			for (int i = 0; i < listTypes.size(); i++) {
				HishopProductTypes info = listTypes.get(i);
				List<HishopProducts> hishopProducts = (List<HishopProducts>) baseBiz
						.findPage(1, 3,
								" from HishopProducts as p where p.typeId = "
										+ info.getTypeId()
										+ " order by p.addedDate asc ");
				for (int j = 0; j < hishopProducts.size(); j++) {
					HishopProducts hishopProducts2 = hishopProducts.get(j);
					HishopSkus hishopSkus = (HishopSkus) baseBiz
							.bean(" from HishopSkus as hs where hs.productId ="
									+ hishopProducts2.getProductId()
									+ " order by hs.salePrice asc");
					hishopProducts2.setHishopSkus(hishopSkus);
					System.out.println(hishopProducts2.getProductName());
					System.out.println(hishopProducts2.getHishopSkus()
							.getSalePrice());
					hishopProducts.set(j, hishopProducts2);
				}
				info.setHishopProducts(hishopProducts);
				listTypes.set(i, info);
			}
			json.put(LISTINFO, listTypes);
			form.setJsonMsg(SUCCESS, true, json, 200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}

}
