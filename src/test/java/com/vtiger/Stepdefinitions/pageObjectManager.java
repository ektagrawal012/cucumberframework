package com.vtiger.Stepdefinitions;

import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;
import com.vtiger.pages.NewLeadPage;

public class pageObjectManager {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Map<String,Map<String,String>> alldata;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static String vTCName;
	
	public LoginPage lp;
	public HomePage hp;
	public NewLeadPage ldp;
	
	public void getPageObject()
	{
		if(lp==null)
		{
			lp = new LoginPage(driver, logger);
		}
		if(hp==null)
		{
			hp = new HomePage(driver, logger);
		}
		if(ldp==null)
		{
			ldp = new NewLeadPage(driver, logger);
		}
	}

}
