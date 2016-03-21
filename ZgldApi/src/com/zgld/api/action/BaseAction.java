package com.zgld.api.action;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zgld.api.base.BaseForm;
import com.zgld.api.beans.AspnetMembers;
import com.zgld.api.beans.AspnetUsers;
import com.zgld.api.beans.AspnetUsersInRoles;
import com.zgld.api.beans.GsonBean;
import com.zgld.api.beans.JyPwd;
import com.zgld.api.beans.UserToken;
import com.zgld.api.biz.BaseBiz;
import com.zgld.api.utils.DateUtils;
import com.zgld.api.utils.HttpUtil;
import com.zgld.api.utils.PasswordUtils;

public class BaseAction extends ActionSupport implements ModelDriven<Object> {
	protected BaseForm form = new BaseForm();
	protected static String LOGIN = "login_html";// 登录页面
	protected static String MAIN = "main_html";// 主页面
	protected static AspnetUsers currentUser;
	protected int pageSize = 5;// 每页显示多少条记录
	protected int pageNow = 1;// 希望显示第几页
	protected int pageCount = 0;// 一共有多少页
	protected int rowCount = 0;// 一共有多少条记录
	public ServletContext getServletContext(){
		return ServletActionContext.getServletContext();
	}
	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNow() {
		return pageNow;
	}

	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public static HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}

	public static HttpServletResponse getResponse() {
		return ServletActionContext.getResponse();
	}

	public static HttpSession getSession() {
		return getRequest().getSession();
	}

	public static AspnetUsers getCurrentUserInfo() {
		return getSession().getAttribute("user") != null ? (AspnetUsers) getSession().getAttribute("user") : null;
	}

	public static void setCurrentUserInfo(AspnetUsers currentUser) {
		getSession().setAttribute("user", currentUser);
	}

	protected static String datetime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final String JSON_PAGE = "jsonPage";
	protected BaseBiz baseBiz;

	public BaseBiz getBaseBiz() {
		return baseBiz;
	}

	public void setBaseBiz(BaseBiz baseBiz) {
		this.baseBiz = baseBiz;
	}

	/**
	 * 分页方法
	 */
	protected void initPage() {
		pageNow = form.getPageNum();
		if (rowCount % form.getPageSize() == 0) {
			pageCount = rowCount / form.getPageSize();
		} else {
			pageCount = rowCount / form.getPageSize() + 1;
		}
	}

	/**
	 * 登录页面
	 * 
	 * @return
	 */
	public String login() {
		return SUCCESS;
	}

	/**
	 * 主页面
	 * 
	 * @return
	 */
	public String main() {
		return initToPage();
	}

	/**
	 * 登出
	 * 
	 * @return
	 */
	public String logout() {
		setCurrentUserInfo(null);
		return LOGIN;
	}

	/**
	 * 修改密码
	 * 
	 * @return
	 */
	public String modify_password() {
		return initToPage();
	}

	/**
	 * 保存修改的密码
	 * 
	 * @return
	 */
	public String save_modify_password() {
		try {
			if (getCurrentUserInfo() == null) {
				form.setJsonMsg("请登录", true, null, 201);
			} else if (form.getOldPassword() == null) {
				form.setJsonMsg("原密码不能为空", true, null, 201);
			} else if (form.getPassword() == null) {
				form.setJsonMsg("新密码不能为空", true, null, 201);
			} else if (form.getOkPassword() == null) {
				form.setJsonMsg("确认密码不能为空", true, null, 201);
			} else if (!form.getPassword().equals(form.getOkPassword())) {
				form.setJsonMsg("新密码和确认密码不一致", true, null, 201);
			} else {
				AspnetUsers users = baseBiz.findUserinfoByUserid(getCurrentUserInfo().getUserId());
				if (!form.getOldPassword().equals(users.getPassword())) {
					form.setJsonMsg("原密码错误", true, null, 201);
				} else {
					users.setPassword(form.getPassword());
					baseBiz.update(users);
					setCurrentUserInfo(null);
					form.setJsonMsg("修改成功,请重新登录", true, null, 200);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return JSON_PAGE;
	}

	/**
	 * 修改资料
	 * 
	 * @return
	 */
	public String modify_data() {
		return initToPage();
	}

	/**
	 * 保存修改的资料
	 * 
	 * @return
	 */
	public String save_modify_data() {
		try {

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return JSON_PAGE;
	}

	protected String initToPage() {
		if (getCurrentUserInfo() == null) {
			return LOGIN;
		} else {
			return SUCCESS;
		}
	}

	public Object getModel() {
		// TODO Auto-generated method stub
		return form;
	}
	public static final String INFO = "info";
	public static final String LISTINFO = "listInfo";
	public static final String NO_USER = "该账号已经在其它设备登录";
	public AspnetUsers reg_user() {
		String passwordformat = "n2FiT+glPSuqrahoRrP7Og==";
		Date date = DateUtils.strToDateLong("1754-01-01 00:00:00");
		AspnetUsers user = new AspnetUsers();
		user.setUserName(form.getName());
		user.setLoweredUserName(form.getName());
		user.setPassword(pwd(form.getPassword(), passwordformat));
		user.setPasswordSalt(passwordformat);
		user.setPasswordFormat(1);
		user.setIsAnonymous(false);
		user.setIsApproved(true);
		user.setSessionId(UUID.randomUUID().toString());
		user.setUserRole(3);
		user.setCreateDate(new Timestamp(new Date().getTime()));
		user.setLastLoginDate(new Timestamp(new Date().getTime()));
		user.setLastActivityDate(new Timestamp(new Date().getTime()));
		user.setLastPasswordChangedDate(new Timestamp(new Date().getTime()));
		user.setFailedPasswordAttemptCount(0);
		user.setFailedPasswordAnswerAttemptCount(0);
		user.setIsLockedOut(false);

		user.setGender(0);

		user.setLastLockoutDate(new Timestamp(date.getTime()));
		user.setFailedPasswordAttemptWindowStart(new Timestamp(date.getTime()));
		user.setFailedPasswordAnswerAttemptWindowStart(new Timestamp(date.getTime()));

		Serializable s = baseBiz.save(user);

		AspnetUsersInRoles inRoles = new AspnetUsersInRoles();

		inRoles.setRoleId("5922DF6C-7B8D-4DCE-80FE-A27C59373E5F");

		int userId = s.hashCode();
		user.setUserId(userId);

		inRoles.setUserId(userId);
		baseBiz.save(inRoles);

		AspnetMembers members = new AspnetMembers();
		members.setUserId(userId);
		members.setGradeId(1);
		if (form.getId() != null && form.getId() > 100) {
			members.setReferralUserId(form.getId());// 邀请人用户userid
		}
		members.setIsOpenBalance(false);
		members.setTradePasswordFormat(1);
		members.setOrderNumber(0);
		members.setExpenditure(new Double(0.0d));
		members.setPoints(0);
		members.setBalance(new Double(0.0d));
		members.setRequestBalance(new Double(0.0d));
		members.setTopRegionId(0);
		members.setRegionId(0);
		members.setTradePasswordSalt(passwordformat);
		members.setTradePassword(jypwd(form.getPassword(), passwordformat));
		baseBiz.save(members);
		user.setAspnetMembers(members);
		user.setUserToken(setUserToken(userId));
		return user;
	}
	public String error() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			form.setJsonMsg("错误", false, json, 1001);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}

	public String pwd(String pwd, String passwordformat) {
		String json = HttpUtil.submitPost("http://114.215.198.143:55/Home/index", "password=" + pwd + "&passwordformat=1&PasswordSalt=" + passwordformat).toString();
		if (json != null && !json.isEmpty()) {
			Gson g = new Gson();
			Type entityType = new TypeToken<GsonBean>() {
			}.getType();
			GsonBean gsonBean = g.fromJson(json, entityType);
			return gsonBean.getPassword();
		} else {
			return "";
		}
	}

	public String jypwd(String pwd, String passwordformat) {
		String json = HttpUtil.submitPost("http://114.215.198.143:56/Home/trade", "password=" + pwd + "&passwordformat=1&PasswordSalt=" + passwordformat).toString();
		if (json != null && !json.isEmpty()) {
			Gson g = new Gson();
			Type entityType = new TypeToken<JyPwd>() {
			}.getType();
			JyPwd gsonBean = g.fromJson(json, entityType);
			return gsonBean.getPassword();
		} else {
			return "";
		}
	}

	/**
	 * 获取用户信息
	 * 
	 * @param token
	 * @return
	 */
	public AspnetUsers getUserInfo() {
		String token = form.getToken();
		int userId = form.getUserId();
		if (token == null) {
			token = "";
		}
		UserToken userToken = (UserToken) baseBiz.bean(" from UserToken as ut where ut.userId = " + userId + " order by ut.tokenId desc");
		AspnetUsers users = (AspnetUsers) baseBiz.bean(" from AspnetUsers as u where u.userId = " + userId);
		AspnetMembers members = (AspnetMembers)baseBiz.bean(" from AspnetMembers as u where u.userId = "+userId);
		if (userToken != null && users != null) {
			if (userToken.getAccountToken().equals(token)) {
				users.setUserToken(userToken);
				users.setAspnetMembers(members);
				return users;
				
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	/**
	 * 设置用户token
	 * 
	 * @param userId
	 * @return
	 */
	public UserToken setUserToken(int userId) {
		try {
			UserToken userToken = new UserToken();
			userToken.setTokenDateTime(new Date());
			userToken.setAccountToken(PasswordUtils.EncoderByMd5(new Date().getTime() + ""));
			userToken.setTokenType(1);
			userToken.setUserId(userId);
			userToken.setTokenRemark("");
			baseBiz.save(userToken);
			return userToken;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
