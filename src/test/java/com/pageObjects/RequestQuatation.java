package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RequestQuatation {
	
	WebDriver driver;
	Select select;
	public static String idNumber;

	@FindBy(how=How.XPATH,using="//a[text()='Request Quotation']") WebElement requestQuatationTab;
	@FindBy(how=How.XPATH,using="//select[@id='quotation_breakdowncover']") WebElement breadDownCover;
	@FindBy(how=How.XPATH,using="//input[@id='quotation_windscreenrepair_t']") WebElement windScreenRepair;
	@FindBy(how=How.XPATH,using="//input[@id='quotation_incidents']") WebElement incident;
	@FindBy(how=How.XPATH,using="//input[@name='registration']") WebElement registration;
	@FindBy(how=How.XPATH,using="//input[@name='mileage']") WebElement mileage;
	@FindBy(how=How.XPATH,using="//input[@id='quotation_vehicle_attributes_value']") WebElement estimatedValue;
	@FindBy(how=How.XPATH,using="//select[@name='parkinglocation']") WebElement parkingLocation;
	@FindBy(how=How.XPATH,using="//select[@name='year']") WebElement policyYear;
	@FindBy(how=How.XPATH,using="//select[@name='month']") WebElement policyMonth;
	@FindBy(how=How.XPATH,using="//select[@name='date']") WebElement policyDate;
	@FindBy(how=How.XPATH,using="//input[@name='submit']") WebElement saveQuatation;
	@FindBy(how=How.XPATH,using="//body") WebElement identityNumber;
	
	public RequestQuatation(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickRequestQuatation() {
		requestQuatationTab.click();
	}
	
	public void selectBreadDownCover(String breadDownCover) {
		select = new Select(this.breadDownCover);
		select.selectByVisibleText(breadDownCover);
	}
	
	public void selectWindScreen() {
		windScreenRepair.click();
	}
	
	public void enterIncident(String incidentName) {
		incident.sendKeys(incidentName);
	}
	
	public void enterRegistration(String registration) {
		this.registration.sendKeys(registration);
	}
	
	public void enterMileage(String mileage) {
		this.mileage.sendKeys(mileage);
	}
	
	public void enterEstimatedValue(String estimatedValue) {
		this.estimatedValue.sendKeys(estimatedValue);
	}
	
	public void selectParkingLocation(String parkingLocation) {
		select = new Select(this.parkingLocation);
		select.selectByVisibleText(parkingLocation);
	}
	
	public void selectPolicyYear(String policyYear) {
		select = new Select(this.policyYear);
		select.selectByValue(policyYear);
	}
	
	public void selectPolicyMonth(int policyMonth) {
		select = new Select(this.policyMonth);
		select.selectByIndex(policyMonth);
	}
	
	public void selectPolicyDate(String policyDate) {
		select = new Select(this.policyDate);
		select.selectByVisibleText(policyDate);
	}
	
	public void clickSaveQuatation() {
		saveQuatation.click();
	}
	
	public String pickIdentityNumber() {
		String identityNumber = this.identityNumber.getText();
		idNumber = identityNumber.replaceAll("\\D+", ""); // Removes all non-digit characters
		return idNumber;
	}
	
	
}
