package com.Adactin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login {

	public WebDriver driver; 
	
	@FindBy(id="username")
    private  WebElement username;
	
	@FindBy(id="password")
    private  WebElement password;

	 @FindBy(id="login") 
     private  WebElement login;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
}
