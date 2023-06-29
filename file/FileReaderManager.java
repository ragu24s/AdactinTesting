package com.file;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {
		
		
	}
	
	public static FileReaderManager getInstanceF() {
	
        FileReaderManager frm=new FileReaderManager();
        		
		return frm;

	}
	
	public  ConfigurationReader getInstanceC() throws IOException{
		
		ConfigurationReader c=new ConfigurationReader();
		
		return c;
		
	}
	
}
