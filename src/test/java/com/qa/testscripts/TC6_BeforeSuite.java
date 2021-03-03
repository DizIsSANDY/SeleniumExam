package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC6_BeforeSuite {
	
	WebDriver driver;
	
	@BeforeSuite
	public void URLLaunch()
	{
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajawadas\\eclipse-workspace\\SDET_Selenium_Batch1\\Driver\\chromedriver.exe");
 		 driver = new ChromeDriver();
 		driver.get("https://opensource-demo.orangehrmlive.com/");
 		
		
	}
	
	@Test
	public void TestURL()
	{
		String Title = driver.getTitle();
		System.out.println(Title);
		
	}

	
	@AfterSuite
	public void Teardown() {
		driver.close();
	}
}
