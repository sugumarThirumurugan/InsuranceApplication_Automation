package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")public WebElement userName;
	@FindBy(how=How.XPATH,using="//input[@id='password']")WebElement password;
	@FindBy(how=How.XPATH,using="//input[@name='submit']") WebElement Login;
	@FindBy(how=How.XPATH,using="//h4[contains(text(),'sugu')]")public WebElement emailText;
	@FindBy(how=How.XPATH,using="//input[@value='Log out']") WebElement Logout;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void setUserName(String userName) {
		this.userName.sendKeys(userName);
	}
	
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void clickLogin() {
		this.Login.click();
	}
	
	public void clickLogout() {
		Logout.click();
		
		
	}
	
	

}
