package com.zgld.api.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import Decoder.BASE64Decoder;
import Decoder.BASE64Encoder;

public class ImageBase64 {
	// 图片转化成base64字符串
	public static String GetImageStr() {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
		String imgFile = "d://test.jpg";// 待处理的图片
		InputStream in = null;
		byte[] data = null;
		// 读取图片字节数组
		try {
			in = new FileInputStream(imgFile);
			data = new byte[in.available()];
			in.read(data);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 对字节数组Base64编码
		BASE64Encoder encoder = new BASE64Encoder();
		return encoder.encode(data);// 返回Base64编码过的字节数组字符串
	}

	// base64字符串转化成图片
	public static String GenerateImage(int userId, String fileName, String imgStr) { // 生成jpeg图片
		String imgFilePath = "";// 新生成的图片
		String saveFilePath = null;
		BASE64Decoder decoder = new BASE64Decoder();
		try {
			// Base64解码
			byte[] b = decoder.decodeBuffer(imgStr);
			for (int i = 0; i < b.length; ++i) {
				if (b[i] < 0) {// 调整异常数据
					b[i] += 256;
				}
			}
			String dir = AppParametersConfig.getParameter("file.user.head_dir");
			File f = new File(dir + userId + "/");
			if (!f.isDirectory()) {
				f.mkdirs();
			}
			Date currentTime = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmssS");
			String dateString = formatter.format(currentTime);

			imgFilePath = dir + userId + "/" + dateString + fileName;
			saveFilePath = AppParametersConfig.getParameter("file.user.head_db") + userId + "/" + dateString + fileName;
			OutputStream out = new FileOutputStream(imgFilePath);
			out.write(b);
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
			saveFilePath = null;
		}
		return saveFilePath;
	}

	public static void main(String[] args) {
		System.out.println(GenerateImage(1117, "0.png", GetImageStr()));
	}
}
