package com.zgld.api.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class City implements Serializable {
	int id;
	String name;
	String regionID;
	String provinceID;

	public String getProvinceID() {
		return provinceID;
	}

	public void setProvinceID(String provinceID) {
		this.provinceID = provinceID;
	}

	public String getRegionID() {
		return regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	List<County> countys = new ArrayList<County>();

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

	public List<County> getCountys() {
		return countys;
	}

	public void setCountys(List<County> countys) {
		this.countys = countys;
	}

}
