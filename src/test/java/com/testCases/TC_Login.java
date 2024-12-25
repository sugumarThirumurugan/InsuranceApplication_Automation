package com.testCases;

import org.testng.annotations.Test;

import com.pageObjects.LoginPage;

public class TC_Login extends BaseClass{


	@Test
	public void testLogin() {
		logger.info("URL Loaded Successfully");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(userName);
		logger.info("Email Entered");
		loginPage.setPassword(password);
		logger.info("Password Entered");
		loginPage.clickLogin();
		String LogedinEmail = loginPage.emailText.getText();
		if(LogedinEmail.equals("sugusuriya347@gmail.com")) {
			logger.info("Successfully Logged In with:" + LogedinEmail );
			loginPage.clickLogout();
			if(loginPage.userName.isDisplayed()) {
				logger.info("Logged Out Successfully");
			}
			else {
				logger.info("Log out is not Successful");
			}
		}
		else {
			logger.info("Logged In Email is not Matching");
		}
	}
	
	public void loginForFutureCase() {
		logger.info("URL Loaded Successfully");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(userName);
		logger.info("Email Entered");
		loginPage.setPassword(password);
		logger.info("Password Entered");
		loginPage.clickLogin();
		String LogedinEmail = loginPage.emailText.getText();
		if(LogedinEmail.equals("sugusuriya347@gmail.com")) {
			logger.info("Successfully Logged In with:" + LogedinEmail );	
		}
		else {
			logger.info("Logged In Email is not Matching");
		}


	}

}
