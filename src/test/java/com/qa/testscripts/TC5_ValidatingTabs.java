package com.qa.testscripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

import junit.framework.Assert;

public class TC5_ValidatingTabs extends TestBase {

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
	public void UserManagemenTab() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
	   	Thread.sleep(2000);
	   	String Text = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).getText();
 	   	Assert.assertEquals("User Management", Text);
 		Reporter.log(" User is Now in Tab =  " + Text, true);
		
	}
	   	
	@Test(priority=4)
	public void JobTab() throws InterruptedException
	{
	   	driver.findElement(By.xpath("//a[@id='menu_admin_Job']")).click();
		Thread.sleep(2000);
	   	String Text1 = driver.findElement(By.xpath("//a[@id='menu_admin_Job']")).getText();
 		Assert.assertEquals("Job", Text1);
 		Reporter.log(" User is Now in Tab =  " + Text1, true);
 	   	
	}	
 		
	   @Test(priority=5)
	   public void OrganizationTab()throws InterruptedException
	   
	   
	   {
	   
			driver.findElement(By.xpath("//a[@id='menu_admin_Organization']")).click();
			Thread.sleep(2000);
		   	String Text2 = driver.findElement(By.xpath("//a[@id='menu_admin_Organization']")).getText();
	 		Assert.assertEquals("Organization", Text2);
	 		Reporter.log(" User is Now in Tab =  " + Text2, true);
	   
	   }
	   
 	
	   
	   @Test(priority=6)
	   public void QualificationTab()throws InterruptedException
	   
	   
	   {
	   
	   		driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']")).click();
			Thread.sleep(2000);
		   	String Text3 = driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']")).getText();
	 	   	Assert.assertEquals("Qualifications", Text3);
	 		Reporter.log(" User is Now in Tab =  " + Text3, true);
	   
	   }
	   
	   

 	
 		  	
	   	
	   	
	   	
	}
	
	
