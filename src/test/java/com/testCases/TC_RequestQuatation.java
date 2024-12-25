package com.testCases;

import org.testng.annotations.Test;

import com.pageObjects.RequestQuatation;

public class TC_RequestQuatation extends BaseClass{
	
	@Test
	public void testRequestQuatation() throws Exception {
		TC_Login login = new TC_Login();
		login.loginForFutureCase();
		RequestQuatation requestQuatation = new RequestQuatation(driver);
		requestQuatation.clickRequestQuatation();
		requestQuatation.selectBreadDownCover("At home");
		requestQuatation.selectWindScreen();
		requestQuatation.enterIncident("Container Crashed");
		requestQuatation.enterRegistration("TN 32 CM 0001");
		requestQuatation.enterMileage("18 KMPL");
		requestQuatation.enterEstimatedValue("25 Lacks On Road");
		requestQuatation.selectParkingLocation("Public Place");
		requestQuatation.selectPolicyYear("2022");
		requestQuatation.selectPolicyMonth(5);
		requestQuatation.selectPolicyDate("20");
		requestQuatation.clickSaveQuatation();
		Thread.sleep(2000);
		logger.info("Quatation Saved SuccessFully");
		logger.info(requestQuatation.pickIdentityNumber());
		
	}

}
