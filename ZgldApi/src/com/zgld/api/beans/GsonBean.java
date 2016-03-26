package com.zgld.api.beans;

import java.io.Serializable;

public class GsonBean implements Serializable {
	String status;
	String Password;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
