package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;



public class TC3_AllFields {

	
	WebDriver  driver;
	OrangePages OrangeOR;

	@Test
public void Login()
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajawadas\\eclipse-workspace\\SDET_Selenium_Batch1\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		OrangeOR = new OrangePages(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
	
	List<WebElement> Count = OrangeOR.getAllLinks();
	int AllLinks = Count.size();
 	Assert.assertTrue(AllLinks==6);
	Reporter.log("Total Number of Links on Login Page are " + AllLinks, true);
	
	List<WebElement> CountForImages = OrangeOR.getAllImages();
	int AllImages = CountForImages.size();
 	Assert.assertTrue(AllImages==5);
	Reporter.log("Total Number of Images on Login Page are " + AllImages, true);
	
	List<WebElement> CountofTextBoxs = OrangeOR.getAllTextBoxs();
	int AllTextBoxs = CountofTextBoxs.size();
	Assert.assertTrue(AllTextBoxs==2);
	Reporter.log("Total Number of Images on Login Page are " + AllTextBoxs, true);
 		
	System.out.println("Login Funtion Text Box is Performed used xpath");
	OrangeOR.GetLoginUserName("Admin");
	
	System.out.println("Password  Funtion Text Box is Performed used xpath");
	OrangeOR.GetPassword("admin123");
	
	
	
}
	
	
}
