package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
public WebDriver driver; 
	
	
	@FindBy(id="location")
    public WebElement select;
	 
	 @FindBy(id="hotels")
	 public WebElement select1;
	
	 @FindBy(id="room_type")
	 public WebElement select2;
	 
	 @FindBy(id="room_nos")
	 public WebElement select3;
	 
	 @FindAll({
		 @FindBy(xpath="//input[@name='datepick_in']")
	 })
	 public WebElement select4;
	 
	 @FindAll({
		 @FindBy(xpath="//input[@name='datepick_out']")
	 })
	 public WebElement select5;
	 
	 @FindBy(id="adult_room")
	 public WebElement select6;
	 
	 @FindBy(id="child_room")
	 public WebElement select7;
	 
	 @FindBy(id="Submit")
	 public WebElement select8;
	 
	 @FindBy(id="radiobutton_0")
	 public WebElement radioselect;

	 @FindBy(id="continue")
	 public WebElement click1;

	 @FindBy(id="first_name")
	 public WebElement send1;
	 
	 @FindBy(id="last_name")
	 public WebElement send2;
	
	 @FindBy(id="address")
	 public WebElement send3;
	 
	 @FindBy(id="cc_num")
	 public WebElement send4;
	 @FindBy(id="cc_type")
	 public WebElement send5;
	 @FindBy(id="cc_exp_month")
	 public WebElement send6;
	 @FindBy(id="cc_exp_year")
	 public WebElement send7;
	 @FindBy(id="cc_cvv")
	 public WebElement send8;
	 @FindBy(id="book_now")
	 public WebElement click2;
	 @FindBy(id="my_itinerary")
	 public WebElement click3;
	 @FindBy(id="logout")
	   public WebElement logout;
	 
	 

	

	public Search_Hotel(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver,this);
		}
		
		 public WebElement getSelect() {
		return select;
	}
	public WebElement getSelect1() {
		return select1;
	}
	public WebElement getSelect2() {
		return select2;
	}
	public WebElement getSelect3() {
		return select3;
	}
	public WebElement getSelect4() {
		return select4;
	}
	public WebElement getSelect5() {
		return select5;
	}
	public WebElement getSelect6() {
		return select6;
	}
	public WebElement getSelect7() {
		return select7;
	}
	public WebElement getSelect8() {
		return select8;
	}
	public WebElement getRadioselect() {
		return radioselect;
	}
	public WebElement getClick1() {
		return click1;
	}
	public WebElement getSend1() {
		return send1;
	}
	public WebElement getSend2() {
		return send2;
	}
	public WebElement getSend3() {
		return send3;
	}
	public WebElement getSend4() {
		return send4;
	}
	public WebElement getSend5() {
		return send5;
	}
	public WebElement getSend6() {
		return send6;
	}
	public WebElement getSend7() {
		return send7;
	}
	public WebElement getSend8() {
		return send8;
	}
	public WebElement getClick2() {
		return click2;
	}
	public WebElement getClick3() {
		return click3;
	}
	public WebElement getLogout() {
		return logout;
	}
}
