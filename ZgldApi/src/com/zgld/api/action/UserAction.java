package com.zgld.api.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.zgld.api.beans.AspnetUsers;
import com.zgld.api.beans.HishopUserShippingAddresses;
import com.zgld.api.utils.EmailUtil;

public class UserAction extends BaseAction {
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
				String pwd = pwd(form.getPassword(), aspnetUsers.getPasswordSalt());
				if (!pwd.equals(aspnetUsers.getPassword())) {
					form.setJsonMsg("旧密码错误", false, json, 1001);
				} else {
					aspnetUsers.setPassword(pwd);
					baseBiz.update(aspnetUsers);
					json.put(INFO, aspnetUsers);
					form.setJsonMsg("修改成功", true, json, 200);
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
	 * 修改性别
	 * 
	 * @return
	 */
	public String update_user_gender() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			AspnetUsers aspnetUsers = getUserInfo();
			if (aspnetUsers == null) {
				form.setJsonMsg(NO_USER, false, json, 201);
			} else if (form.getUserinfo().getGender() == null) {
				form.setJsonMsg("userinfo.gender不能为空", false, json, 1001);
			} else {
				aspnetUsers.setGender(form.getUserinfo().getGender());
				baseBiz.update(aspnetUsers);
				json.put(INFO, aspnetUsers);
				form.setJsonMsg("修改成功", true, json, 200);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}
	/**
	 * 修改用户邮箱
	 * @return
	 */
	public String update_user_email() {
		Map<String, Object> json = new HashMap<String, Object>();
		try {
			AspnetUsers aspnetUsers = getUserInfo();
			if (aspnetUsers == null) {
				form.setJsonMsg(NO_USER, false, json, 201);
			} else if (form.getUserinfo().getEmail() == null) {
				form.setJsonMsg("userinfo.email不能为空", false, json, 1001);
			} else if (EmailUtil.emailMatches(form.getUserinfo().getEmail())) {
				form.setJsonMsg("email格式输入错误不能为空", false, json, 1001);
			} else {
				aspnetUsers.setEmail(form.getUserinfo().getEmail());
				baseBiz.update(aspnetUsers);
				json.put(INFO, aspnetUsers);
				form.setJsonMsg("修改成功", true, json, 200);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			form.setJsonMsg("系统出错", false, json, 1001);
		}
		return JSON_PAGE;
	}
	
}
