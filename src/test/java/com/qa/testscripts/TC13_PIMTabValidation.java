package com.qa.testscripts;

 import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

public class TC13_PIMTabValidation extends TestBase {

 	OrangePages OrangeOR;
	
	@BeforeMethod
	public void setup()
	{
		OrangeOR = new OrangePages(driver);

	}
	
	@Test
	public void PIMTab() throws InterruptedException, IOException
	{
		OrangeOR.GetLoginUserName(prop.getProperty("username"));
		Thread.sleep(2000);
		OrangeOR.GetPassword(prop.getProperty("password"));
		Thread.sleep(2000);
		OrangeOR.SetSubmitOnLoginButton();
		Thread.sleep(2000);
		OrangeOR.GetPImTab();
		String PIMTAB = OrangeOR.GetPIMTabConfirmation();
		Assert.assertEquals("PIM", PIMTAB);	
		Reporter.log("User is on PIM TAB", true);
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']"));
		FirstName.sendKeys("Linda Anderson");
		Thread.sleep(2000);
		String attribute = FirstName.getAttribute("value");
		System.out.println("Entered value:"+attribute);

		if(attribute.contains("Linda Anderson"))
		{
			captureScreenShot(driver,"Data Entered Correctly ");
			System.out.println("Exact Data Entered");

		}
		
		else
		{
			captureScreenShot(driver,"Data Not Entered Correctly ");

			System.out.println("Data not entered");
		}
		
		
	}
	
}
