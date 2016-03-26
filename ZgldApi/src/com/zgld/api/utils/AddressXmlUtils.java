package com.zgld.api.utils;

import java.io.InputStream;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.zgld.api.beans.Region;

/**
 * 地址解析工具
 * 
 * @author LLP
 * 
 */
public class AddressXmlUtils {
	public static List<Region> readXML() {
		try {
			InputStream inputStream = AddressXmlUtils.class.getClassLoader().getResourceAsStream("address.xml");
			SAXParserFactory spf = SAXParserFactory.newInstance();// 创建解析器
			SAXParser saxParser = spf.newSAXParser();
			// 设置解析器的相关特性，true表示开启命名空间特性
			// saxParser.setProperty("http://xml.org/sax/features/namespaces",
			// true);
			XMLContentHandler handler = new XMLContentHandler();
			saxParser.parse(inputStream, handler);
			handler.getCountys();
			handler.getCitys();
			handler.getProvinces();
			handler.getRegions();
			inputStream.close();
			// List<Region> listRegions = handler.getRegions();
			// for (Region region : listRegions) {
			// System.out.println("地区:ID=" + region.getId() + ",name=" +
			// region.getName());
			// for (Province province : region.getProvinces()) {
			// System.out.println("省份:ID=" + province.getId() + ",name=" +
			// province.getName());
			// for (City city : province.getCitys()) {
			// System.out.println("市:ID=" + city.getId() + ",name=" +
			// city.getName());
			// for (County county : city.getCountys()) {
			// System.out.println("县:ID=" + county.getId() + ",name=" +
			// county.getName());
			// }
			return handler.getRegions();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static String readXML(int regionId) {
		String address = "";
		try {
			InputStream inputStream = AddressXmlUtils.class.getClassLoader().getResourceAsStream("address.xml");
			SAXParserFactory spf = SAXParserFactory.newInstance();// 创建解析器
			SAXParser saxParser = spf.newSAXParser();
			// 设置解析器的相关特性，true表示开启命名空间特性
			// saxParser.setProperty("http://xml.org/sax/features/namespaces",
			// true);
			CountyXMLContentHandler handler = new CountyXMLContentHandler(regionId);
			saxParser.parse(inputStream, handler);
			inputStream.close();
			address = handler.getAddress();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return address;
	}

	public static void main(String[] args) {
		// readXML();
		System.out.println(readXML(1947));
	}
}
