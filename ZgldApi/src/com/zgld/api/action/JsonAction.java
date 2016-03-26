package com.zgld.api.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zgld.api.beans.HomeBanner;
import com.zgld.api.beans.HotCategory;

public class JsonAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
			form.setJsonMsg(SUCCESS, true, json, 200);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}

	/**
	 * 首页热门标签
	 * 
	 * @return
	 */
	public String home_hot_category() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			List<HotCategory> listInfo = (List<HotCategory>) baseBiz.findAll(" from HotCategory as h order by h.hotid asc ");
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
