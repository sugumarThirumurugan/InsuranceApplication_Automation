package com.testCases;

import org.testng.annotations.Test;

import com.pageObjects.RequestQuatation;
import com.pageObjects.RetreiveQuatation;

public class TC_RetreiveQuatation extends BaseClass {
	
	@Test
	public void testRetreiveQuatation() throws Exception{
		TC_Login login = new TC_Login();
		login.loginForFutureCase();	
		RetreiveQuatation retreiveQuatation = new RetreiveQuatation(driver);
		retreiveQuatation.clickRetreiveQuatationTab();
		logger.info("Retreive Quatation Tab Clicked");
		retreiveQuatation.sendIdentityNumber(RequestQuatation.idNumber);
		logger.info("Identity Number Loaded");
		retreiveQuatation.clickRetreiveButton();
		logger.info("Retreive Button Clicked");
		Thread.sleep(2000);
		retreiveQuatation.tookScreenShot();
		logger.info("Screenshot Tooked for Quauation Details");
	}

}
