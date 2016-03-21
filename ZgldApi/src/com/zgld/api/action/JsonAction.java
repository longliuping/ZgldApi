package com.zgld.api.action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zgld.api.beans.HomeBanner;

public class JsonAction extends BaseAction {

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
}
