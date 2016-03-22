package com.zgld.api.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zgld.api.beans.AspnetUsers;
import com.zgld.api.beans.HishopProducts;
import com.zgld.api.beans.HishopSkus;

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
}
