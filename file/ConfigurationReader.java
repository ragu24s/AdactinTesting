package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;
	
	public String getUsername(){
		 
	    String user = p.getProperty("username");
		return user;
		
	}
	public  String getUassword(){
		
		String pass = p.getProperty("password");
		return pass;
		
	}
	public ConfigurationReader() throws IOException {
		
		File f=new File("C:\\Users\\S RAGUPATHI\\eclipseNew-workspace\\Mavenproject\\credentials.properties");
		
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);	
	}


	
}
