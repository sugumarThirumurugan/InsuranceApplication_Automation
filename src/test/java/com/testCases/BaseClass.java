package com.testCases;

import java.io.File;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.github.javafaker.Faker;
import com.utilities.ReadConfig;

public class BaseClass {

	ReadConfig readConfig = new ReadConfig();
	public String url = readConfig.getUrl();
	public String userName = readConfig.getUserName();
	public String password = readConfig.getPassword();
	public String chromePath = readConfig.getChromePath();
	public String edgePath = readConfig.getEdgePath();
	public static WebDriver driver;
	public static Logger logger;
	public Faker faker;
	
	
	@Parameters("Browsers")
	@BeforeClass
	public void setUp(String browsers) {
		logger = LogManager.getLogger(BaseClass.class);
		faker = new Faker();
		
		switch (browsers) {
		case "Chrome":
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addExtensions(new File("./Extentions/AdBlock.crx"));
			System.setProperty("webdriver.chrome.driver",chromePath);
			driver = new ChromeDriver();
			break;
		case "Edge":
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addExtensions(new File("./Extentions/adBlockForEdge.crx"));
			System.setProperty("webdriver.edge.driver",edgePath);
			driver = new EdgeDriver();		
			break;
		default:
			break;	
		}
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
