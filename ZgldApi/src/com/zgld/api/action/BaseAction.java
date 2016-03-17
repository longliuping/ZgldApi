package com.zgld.api.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zgld.api.base.BaseForm;
import com.zgld.api.beans.AspnetUsers;
import com.zgld.api.biz.BaseBiz;

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
}
