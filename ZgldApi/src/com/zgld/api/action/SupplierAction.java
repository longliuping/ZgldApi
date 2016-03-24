package com.zgld.api.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zgld.api.beans.AspnetUsers;
import com.zgld.api.beans.HishopProducts;
import com.zgld.api.beans.HishopSkus;
import com.zgld.api.beans.SupperArea;
import com.zgld.api.beans.SupperHot;
import com.zgld.api.beans.Supplier;

public class SupplierAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 商家的产品
	 * 
	 * @return
	 */
	public String supplier_product() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			List<HishopProducts> listInfo = (List<HishopProducts>) baseBiz.findPage(form.getPageNum(), form.getPageSize(), " from HishopProducts as hp where hp.userid = " + form.getId());
			for (int j = 0; j < listInfo.size(); j++) {
				HishopProducts hishopProducts2 = listInfo.get(j);
				HishopSkus hishopSkus = (HishopSkus) baseBiz.bean(" from HishopSkus as hs where hs.productId =" + hishopProducts2.getProductId() + " order by hs.salePrice asc");
				hishopProducts2.setHishopSkus(hishopSkus);
				listInfo.set(j, hishopProducts2);
			}
			json.put(LISTINFO, listInfo);
			form.setJsonMsg(SUCCESS, true, json, 200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}

	public String hot_supplier() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			List<SupperHot> listSupperHots = (List<SupperHot>) baseBiz.findPage(form.getPageNum(), form.getPageSize(), " from SupperHot as sh where sh.hotid = " + form.getHotid());
			List<Supplier> listInfo = new ArrayList<Supplier>();
			if (listSupperHots != null && listSupperHots.size() > 0) {
				StringBuffer sb = new StringBuffer(" from Supplier as s where ");
				for (int i = 0; i < listSupperHots.size(); i++) {
					SupperHot supperHot = listSupperHots.get(i);
					sb.append(" s.userId = " + supperHot.getUserid() + " or ");
				}
				sb.delete(sb.toString().length() - 3, sb.toString().length());
				listInfo = (List<Supplier>) baseBiz.findAll(sb.toString());
			}
			json.put(LISTINFO, listInfo);
			form.setJsonMsg(SUCCESS, true, json, 200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}

	public String area_supplier() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			List<SupperArea> listAreas = (List<SupperArea>) baseBiz.findPage(form.getPageNum(), form.getPageSize(), " from SupperArea as sa where sa.areaid = " + form.getAreaid());
			if (listAreas != null) {
				for (int i = 0; i < listAreas.size(); i++) {
					SupperArea supperArea = listAreas.get(i);
					Supplier supplier = (Supplier) baseBiz.bean(" from Supplier as s where s.userId = " + supperArea.getUserid());
					supperArea.setSupplier(supplier);
					listAreas.set(i, supperArea);
				}
			}
			json.put(LISTINFO, listAreas);
			form.setJsonMsg(SUCCESS, true, json, 200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}
}
