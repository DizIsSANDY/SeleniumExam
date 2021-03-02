package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

public class TC8_ValidateAllTabs extends TestBase {
	OrangePages  OrangeOR;


	@BeforeMethod
	public void loadpages()
	{
		OrangeOR = new OrangePages(driver);
	}
	
	@Test(priority=1)
 	public void login() throws InterruptedException
	{
		OrangeOR.GetLoginUserName(prop.getProperty("username"));
		Thread.sleep(2000);
		OrangeOR.GetPassword(prop.getProperty("password"));
		Thread.sleep(2000);
		OrangeOR.SetSubmitOnLoginButton();
		Thread.sleep(2000);

	}
	
	@Test(priority=2)
 	public void ValidatingAdminTab() throws InterruptedException
	{
		OrangeOR.GetAdminTab();
		Thread.sleep(3000);
		OrangeOR.GetAdminTabConfirmation();
		String TabName = OrangeOR.GetAdminTabConfirmation();   	
		Assert.assertEquals("Admin", TabName);
 		Reporter.log(" User is Now in Tab =  " + TabName, true);

	}
	
	@Test(priority=3)
 	public void PIMTab() throws InterruptedException
	{
		 OrangeOR.GetPImTab();
		 Thread.sleep(3000);
			String TabName1 = OrangeOR.GetPIMTabConfirmation();
			
			Assert.assertEquals("PIM", TabName1);
	 		Reporter.log(" User is Now in Tab =  " + TabName1, true);

			

	}
	
	@Test(priority=4)
		public void LeaveTab() throws InterruptedException
		{
	
		OrangeOR.GetLeaveTab();
		Thread.sleep(2000);
		String TabName2 = OrangeOR.GetLeaveTabConfirmation();
		
		Assert.assertEquals("Leave", TabName2);
 		Reporter.log(" User is Now in Tab =  " + TabName2, true);

		}
	
	
	@Test(priority=5)
		public void Directory() throws InterruptedException
		{
	
		OrangeOR.GetDirectoryTab();
		Thread.sleep(2000);
		String TabName3 = OrangeOR.GetDirectoryTabConfirmation();
		
		Assert.assertEquals("Directory", TabName3);
 		Reporter.log(" User is Now in Tab =  " + TabName3, true);

		}
	

	@Test(priority=6)
	public void Miantenance() throws InterruptedException
	{

	OrangeOR.GetMaintenanceTab();
	Thread.sleep(2000);
	String TabName4 = OrangeOR.GetMaintenanceTabConfirmation();
	
	Assert.assertEquals("Maintenance", TabName4);
		Reporter.log(" User is Now in Tab =  " + TabName4, true);

	}

	
	
		}
		
	
		


