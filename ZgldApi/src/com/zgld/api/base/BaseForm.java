package com.zgld.api.base;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.struts2.ServletActionContext;

import com.zgld.api.beans.AspnetUsers;
import com.zgld.api.beans.HishopUserShippingAddresses;
import com.zgld.api.utils.DateJsonValueProcessor;
import com.zgld.api.utils.JsonWrapper;

public class BaseForm {

	private String popMessage;
	private boolean resultBoolean;
	private String jsonText;

	public String getJsonText() {
		return this.jsonText;
	}

	public void setJsonText(String jsonText) {
		this.jsonText = jsonText;
	}

	public void setJsonMsg(Object data) {
		setJsonMsg(this.popMessage, this.resultBoolean, data);
	}

	public static Timestamp datetime() {
		return new Timestamp(new Date().getTime());
	}

	public void setJsonMsg(String msg, boolean flag, Object data, int status) {
		JsonWrapper wrapper = new JsonWrapper(flag, msg, data, status);
		JsonConfig config = new JsonConfig();
		config.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
		setJsonText(JSONObject.fromObject(wrapper, config).toString());
	}

	public void setJsonMsg(String msg, boolean flag, Object data) {
		JsonWrapper wrapper = new JsonWrapper(flag, msg, data);
		JsonConfig config = new JsonConfig();
		config.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyy-MM-dd HH:mm:ss"));
		setJsonText(JSONObject.fromObject(wrapper, config).toString());
	}

	public void setJsonMsg() {
		setJsonMsg(this.popMessage, this.resultBoolean, null);
	}

	private Integer pageNum = 1;
	private Integer pageSize = 50;
	private Integer newPageSize = 0;
	private Integer id;
	private Integer userId;
	private Integer code;
	private Integer orderid;
	private Integer productId;
	private Integer number;
	private String skuId;
	private Double money;
	private String content;
	private Integer display;
	private String name;
	private String password;
	private String okPassword;
	private String oldPassword;
	private String token;
	private String ip;
	private Object object;
	private Object object1;
	private Object object2;
	private Object object3;
	private Object object4;
	private String exportToExcel;
	private Map<Integer, Integer> selectedUser = new HashMap<Integer, Integer>();
	private String startDate;
	private String endDate;
	private Object totalMoney;
	private Object totalPageMoney;
	private AspnetUsers userinfo;
	private HishopUserShippingAddresses address;
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public HishopUserShippingAddresses getAddress() {
		return address;
	}

	public void setAddress(HishopUserShippingAddresses address) {
		this.address = address;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public Timestamp getDatetime() {
		return new Timestamp(new Date().getTime());
	}
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Integer getNewPageSize() {
		return newPageSize;
	}

	public AspnetUsers getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(AspnetUsers userinfo) {
		this.userinfo = userinfo;
	}

	public void setNewPageSize(Integer newPageSize) {
		this.newPageSize = newPageSize;
	}

	public String getExportToExcel() {
		return exportToExcel;
	}

	public void setExportToExcel(String exportToExcel) {
		this.exportToExcel = exportToExcel;
	}

	public Object getObject3() {
		return object3;
	}

	public void setObject3(Object object3) {
		this.object3 = object3;
	}

	public Object getObject4() {
		return object4;
	}

	public void setObject4(Object object4) {
		this.object4 = object4;
	}

	public Object getTotalPageMoney() {
		return totalPageMoney;
	}

	public void setTotalPageMoney(Object totalPageMoney) {
		this.totalPageMoney = totalPageMoney;
	}

	public Object getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(Object totalMoney) {
		this.totalMoney = totalMoney;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Object getObject1() {
		return object1;
	}

	public void setObject1(Object object1) {
		this.object1 = object1;
	}

	public Object getObject2() {
		return object2;
	}

	public void setObject2(Object object2) {
		this.object2 = object2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIp() {
		HttpServletRequest request = ServletActionContext.getRequest();
		return ip = request.getRemoteAddr();
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getPopMessage() {
		return popMessage;
	}

	public void setPopMessage(String popMessage) {
		this.popMessage = popMessage;
	}

	public boolean isResultBoolean() {
		return resultBoolean;
	}

	public void setResultBoolean(boolean resultBoolean) {
		this.resultBoolean = resultBoolean;
	}

	public String getOkPassword() {
		return okPassword;
	}

	public void setOkPassword(String okPassword) {
		this.okPassword = okPassword;
	}

	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Integer getDisplay() {
		return display;
	}

	public void setDisplay(Integer display) {
		this.display = display;
	}

	public Map<Integer, Integer> getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(Map<Integer, Integer> selectedUser) {
		this.selectedUser = selectedUser;
	}
}
