package com.pageObjects;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RetreiveQuatation {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//a[text()='Retrieve Quotation']") WebElement retreiveQuatationTab;
	@FindBy(how=How.XPATH,using="//input[@name='id']") WebElement identifyNumber;
	@FindBy(how=How.XPATH,using="//input[@id='getquote']") WebElement retreiveButton;
	@FindBy(how=How.XPATH,using="/html/body/table/tbody") WebElement table;
	
	public RetreiveQuatation(WebDriver driver) throws Exception {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickRetreiveQuatationTab() {
		retreiveQuatationTab.click();
	}
	
	public void sendIdentityNumber(String identifyNumber) {
		this.identifyNumber.sendKeys(identifyNumber);
	}
	
	public void clickRetreiveButton() {
		retreiveButton.click();
	}
	
	public void tookScreenShot()throws Exception {
		File source = table.getScreenshotAs(OutputType.FILE);
		File destination =new File("E:\\New folder\\InsuranceApplication_Automation\\ScreenShots\\QuatationDetails.jpg");
		FileUtils.copyFile(source, destination);	
	}
	
	
	

}
