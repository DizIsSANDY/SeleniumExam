package com.qa.testscripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC9_MinimizeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gajawadas\\eclipse-workspace\\SDET_Selenium_Batch1\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		System.out.println("Browser is in Maximized Stage");
 		System.out.println("user have initiated OrangeHRM URL");
 		Dimension n = new Dimension(360,592);
 		driver.manage().window().setSize(n);
		System.out.println("Browser is in Minimized Stage");
		driver.close();
	
	}

}
