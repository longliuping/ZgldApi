package com.zgld.api.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Region implements Serializable {
	int id;
	String name;
	List<Province> provinces = new ArrayList<Province>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Province> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<Province> provinces) {
		this.provinces = provinces;
	}
}
