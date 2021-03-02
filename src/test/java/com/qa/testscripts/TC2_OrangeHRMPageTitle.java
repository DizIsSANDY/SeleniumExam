package com.qa.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2_OrangeHRMPageTitle {

  		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajawadas\\eclipse-workspace\\SDET_Selenium_Batch1\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
	 		Thread.sleep(3000);
	 		System.out.println("user have initiated OrangeHRM URL");
	 		String Title = driver.getTitle();
	 		System.out.println("Title of the page is " + Title);
	 		driver.close();
	 		

	}

}
