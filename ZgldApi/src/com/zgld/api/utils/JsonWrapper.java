package com.zgld.api.utils;

public class JsonWrapper<T> {
	private boolean flag;
	private boolean timeout;
	private String msg;
	private T data;
	private int status;

	public JsonWrapper() {
	}

	public JsonWrapper(boolean flag, String msg, T data, int status) {
		this.timeout = false;
		this.flag = flag;
		this.msg = msg;
		this.data = data;
		this.status = status;
	}

	public JsonWrapper(boolean timeout, boolean flag, String msg, T data) {
		this.timeout = timeout;
		this.flag = flag;
		this.msg = msg;
		this.data = data;
	}

	public JsonWrapper(boolean flag, String msg, T data) {
		this.timeout = false;
		this.flag = flag;
		this.msg = msg;
		this.data = data;
	}

	public JsonWrapper(boolean flag, String msg) {
		this.timeout = false;
		this.flag = flag;
		this.msg = msg;
	}

	public boolean isTimeout() {
		return this.timeout;
	}

	public void setTimeout(boolean timeout) {
		this.timeout = timeout;
	}

	public boolean isFlag() {
		return this.flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int s) {
		this.status = s;
	}
}