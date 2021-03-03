package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;
 


public class TC14_HighlitFields extends TestBase {
	
	OrangePages OrangeOR;

	
	@BeforeMethod
	public void setup()
	{
		
		OrangeOR = new OrangePages(driver);

	}
	
	@Test
	public void highlighterElement() throws InterruptedException, IOException {
		
		OrangeOR.GetLoginUserName(prop.getProperty("username"));
		Thread.sleep(2000);
		OrangeOR.GetPassword(prop.getProperty("password"));
		Thread.sleep(2000);
		OrangeOR.SetSubmitOnLoginButton();
		Thread.sleep(2000);
		WebElement PIM = driver.findElement(By.cssSelector("#menu_pim_viewPimModule"));
		highLighterMethod(driver,PIM);
		WebElement time = driver.findElement(By.cssSelector("#menu_time_viewTimeModule"));
		highLighterMethod(driver,time);
		WebElement maintanance  = driver.findElement(By.cssSelector("#menu_maintenance_purgeEmployee"));
		highLighterMethod(driver,maintanance);
		WebElement AssignLeave  = driver.findElement(By.cssSelector("div.box:nth-child(3) div.inner div.outerbox.no-border:nth-child(1) div.maincontent.group-wrapper div.panel_wrapper div.panel_draggable.panel-preview fieldset.panel_resizable.panel-preview table.quickLaungeContainer tr:nth-child(1) td:nth-child(1) div.quickLaunge a:nth-child(1) > img:nth-child(1)"));
		highLighterMethod(driver,AssignLeave);
		WebElement Timesheet  = driver.findElement(By.cssSelector("div.box:nth-child(3) div.inner div.outerbox.no-border:nth-child(1) div.maincontent.group-wrapper div.panel_wrapper div.panel_draggable.panel-preview fieldset.panel_resizable.panel-preview table.quickLaungeContainer tbody:nth-child(1) tr:nth-child(1) td:nth-child(6) > div.quickLaunge"));
		highLighterMethod(driver,Timesheet);
		captureScreenShot(driver,"All Fileds Higlited ");

	}
	
	
	
	public void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", element);
	}
	 
	

}
