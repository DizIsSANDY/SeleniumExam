package com.qa.testscripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

public class TC4_Login extends TestBase{
	
	OrangePages  OrangeOR;
	
	@BeforeMethod
	public void loadpages()
	{
		OrangeOR = new OrangePages(driver);
	}
	
	@Test()
 	public void login() throws InterruptedException
	{
		OrangeOR.GetLoginUserName(prop.getProperty("username"));
		Thread.sleep(2000);
		OrangeOR.GetPassword(prop.getProperty("password"));
		Thread.sleep(2000);
		OrangeOR.SetSubmitOnLoginButton();
		Thread.sleep(2000);

	}

	
	
}
