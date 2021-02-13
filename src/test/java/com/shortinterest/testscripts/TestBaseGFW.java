package com.shortinterest.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.apache.commons.io.FileUtils;

public class TestBaseGFW {

	public static WebDriver Driver;
	public static FileInputStream fileLoc;
	public static Properties prop;

	@Parameters({ "browser" })
	@BeforeClass
	public void setUp(String browser) {

		try {
			fileLoc = new FileInputStream(
					"C:\\SDET\\com.qa.devlabs.selenium\\com.qa.devlabs.selenium\\configuration\\configGFW.properties");
			prop = new Properties();
			prop.load(fileLoc);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Program outside if loop to invoke chrome");
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Browser  chrome Got Launched");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gajawadas\\eclipse-workspace\\SDET_Selenium_Batch1\\Driver\\chromedriver.exe");
			Driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gajawadas\\eclipse-workspace\\SDET_Selenium_Batch1\\Driver\\chromedriver.exe");
			Driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\gajawadas\\eclipse-workspace\\SDET_Selenium_Batch1\\Driver\\chromedriver.exe");
			Driver = new InternetExplorerDriver();
		}

		Driver.manage().deleteAllCookies();
		Driver.manage().window().maximize();
		Driver.get(prop.getProperty("url"));

	}

	@AfterClass
	public void tearDown() {
		
		System.out.println("Inside teardown");
		//Driver.quit();
	}

	 public void captureScreenShot(WebDriver Driver, String tname) throws
	 IOException
	 {
	 TakesScreenshot ts = (TakesScreenshot) Driver;
	 File Src= ts.getScreenshotAs(OutputType.FILE);
	 File dest = new File(System.getProperty("user.dir")+"/screenshots/" + tname +
	 ".png");
	 FileUtils.copyFile(Src, dest);
	 System.out.println("Screen shot is captured");
	
	
	 }

}
