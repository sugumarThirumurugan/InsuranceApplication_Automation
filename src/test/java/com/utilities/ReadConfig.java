package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties properties;
	
	public ReadConfig() {
		
		try {
			File file = new File("E:\\New folder\\InsuranceApplication_Automation\\configurations\\config.properties");
			FileInputStream	fileInputStream = new FileInputStream(file);
			properties = new Properties();
			properties.load(fileInputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public String getUrl() {
		String url = properties.getProperty("url");
		return url;	
	}
	
	public String getUserName() {
		String userName=properties.getProperty("userName");
		return userName;
	}
	
	public String getPassword() {
		String password = properties.getProperty("password");
		return password;
	}
	
	public String getChromePath() {
		String chromePath = properties.getProperty("chromePath");
		return chromePath;
	}
	
	public String getEdgePath() {
		String edgePath = properties.getProperty("edgePath");
		return edgePath;
	}
	
}
