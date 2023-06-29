package com.Adactin;

import org.openqa.selenium.WebDriver;
public class PomOfPom {
	 public WebDriver driver;
	 
	 private Login l;
	 
	 private Search_Hotel s;

	   public PomOfPom(WebDriver driver1)
	   {
	   this.driver=driver1;
	    }
	 
	    public Login getL() {
		l=new Login(driver);
		return l;
	    }
	   public Search_Hotel getS() {
		s=new Search_Hotel(driver);
		return s;
	  }
}
