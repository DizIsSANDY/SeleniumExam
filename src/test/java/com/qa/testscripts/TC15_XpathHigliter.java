package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pages.OrangePages;

public class TC15_XpathHigliter extends TestBase {

	
	
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
 		WebElement MarketPlace = driver.findElement(By.xpath("//input[@id='MP_link']"));
		highLighterMethod(driver,MarketPlace);
		WebElement Welcome = driver.findElement(By.xpath("//a[@id='welcome']"));
		highLighterMethod(driver,Welcome);
		WebElement Admin  = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
		highLighterMethod(driver,Admin);
		WebElement Leave  = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]/img[1]"));
		highLighterMethod(driver,Leave);
		
		captureScreenShot(driver,"All Fileds Higlited using Xpath ");
		
	}
	
	public void highLighterMethod(WebDriver driver, WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'border: 3px solid red;');", element);
	}
	
}
