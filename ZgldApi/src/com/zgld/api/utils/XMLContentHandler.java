package com.zgld.api.utils;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.zgld.api.beans.City;
import com.zgld.api.beans.County;
import com.zgld.api.beans.Province;
import com.zgld.api.beans.Region;

public class XMLContentHandler extends DefaultHandler {
	List<Region> regions = null;
	Region currentRegion;

	List<Province> provinces = null;
	Province currentProvince;

	List<City> citys = null;
	City currentCity;

	private List<County> countys = null;
	private County currentCounty;

	private String tagName = null;// 当前解析的元素标签

	public List<Region> getRegions() {
		return regions;
	}

	List<Province> getProvinces() {
		return provinces;
	}

	List<City> getCitys() {
		return citys;
	}

	List<County> getCountys() {
		return countys;
	}

	// 接收文档开始的通知。当遇到文档的开头的时候，调用这个方法，可以在其中做一些预处理的工作。
	@Override
	public void startDocument() throws SAXException {
		regions = new ArrayList<Region>();
		provinces = new ArrayList<Province>();
		citys = new ArrayList<City>();
		countys = new ArrayList<County>();
	}

	// 接收元素开始的通知。当读到一个开始标签的时候，会触发这个方法。其中namespaceURI表示元素的命名空间；
	// localName表示元素的本地名称（不带前缀）；qName表示元素的限定名（带前缀）；atts 表示元素的属性集合
	@Override
	public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {

		if (qName.equals("region")) {
			currentRegion = new Region();
			currentRegion.setId(Integer.parseInt(atts.getValue(0)));
			currentRegion.setName(atts.getValue(1));
		}
		if (qName.equals("province")) {
			currentProvince = new Province();
			currentProvince.setId(Integer.parseInt(atts.getValue(0)));
			currentProvince.setName(atts.getValue(1));
		}
		if (qName.equals("city")) {
			currentCity = new City();
			currentCity.setId(Integer.parseInt(atts.getValue(0)));
			currentCity.setName(atts.getValue(1));
		}
		if (qName.equals("county")) {
			currentCounty = new County();
			currentCounty.setId(Integer.parseInt(atts.getValue(0)));
			currentCounty.setName(atts.getValue(1));
		}
		this.tagName = qName;
	}

	// 接收字符数据的通知。该方法用来处理在XML文件中读到的内容，第一个参数用于存放文件的内容，
	// 后面两个参数是读到的字符串在这个数组中的起始位置和长度，使用new String(ch,start,length)就可以获取内容。
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {

		if (tagName != null) {
			String data = new String(ch, start, length);
			if (tagName.equals("name")) {
				this.currentRegion.setName(data);
			} else if (tagName.equals("age")) {
				// this.currentPerson.setAge(Short.parseShort(data));
			}
		}
	}

	// 接收文档的结尾的通知。在遇到结束标签的时候，调用这个方法。其中，uri表示元素的命名空间；
	// localName表示元素的本地名称（不带前缀）；name表示元素的限定名（带前缀）
	@Override
	public void endElement(String uri, String localName, String name) throws SAXException {

		if (name.equals("region")) {
			currentRegion.setProvinces(getProvinces());
			regions.add(currentRegion);
			provinces = new ArrayList<Province>();// 这里
			currentRegion = null;
		}
		if (name.equals("province")) {
			currentProvince.setCitys(getCitys());
			citys = new ArrayList<City>();
			provinces.add(currentProvince);
			currentProvince = null;
		}
		if (name.equals("city")) {
			currentCity.setCountys(getCountys());
			countys = new ArrayList<County>();
			citys.add(currentCity);
			currentCity = null;
		}
		if (name.equals("county")) {
			countys.add(currentCounty);
			currentCounty = null;
		}
		this.tagName = null;
	}
}
