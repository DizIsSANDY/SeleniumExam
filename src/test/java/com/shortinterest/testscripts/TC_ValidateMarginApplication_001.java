package com.shortinterest.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.testScripts.TestBase;
import com.shortinterest.pages.GFWPages;

public class TC_ValidateMarginApplication_001  extends TestBaseGFW {
	
	GFWPages GFWOR;
	
	@BeforeMethod
	public void loadPages() {
		System.out.println("Program is inside the loadpages ");
		GFWOR= new GFWPages(Driver);
		
		
	}

	
	
	
	@Test

	public void MarginMoneyLineinGFW( ) throws  IOException, InterruptedException
	{
		System.out.println("Logon Page started");

		GFWOR.Login();
		
		System.out.println("Program is inside the actual test ");
		GFWOR.GetBPSConnect();
			System.out.println("Clicked on BPS Connect");
			Reporter.log("Clicked on BPS Connect");
		GFWOR.GetMarginPage();
			System.out.println("Clicked on BPS Margin");
			Reporter.log("Clicked on BPS Margin");
		GFWOR.GetMoneyline();
			System.out.println("Clicked on BPS Margin Moneyline");
			Reporter.log("Clicked on BPS Margin Moneyline");
			
	        Thread.sleep(30000);
	        
	        
  	     
 	       
  
 	         
	        
	        
	        GFWOR.SetAccountinMoneyline("100");
			GFWOR.SetBranchinMoneyline("00001");
			GFWOR.SubmitinMoneyline();
			GFWOR.getAccountNameinMoneyLine();
			captureScreenShot(Driver,"MarginMoneyLineinGFW");
			 
//	        GFWOR.getShortInterest();
//	        Thread.sleep(45000);
//	        Driver.findElement(By.id("searchtext")).click();
//	        System.out.println("Clicked on Search tab");
//	        Thread.sleep(10000);
//	        Driver.findElement(By.cssSelector("#symbol")).sendKeys("ADP");
//	        System.out.println("Entered secuirty ADP hardcoaded ");
//	        Driver.findElement(By.xpath("//button[@id='maximise']")).click();
//	        System.out.println("Clicked on Search button ");
//	        Thread.sleep(45000);
//	        String FirstSecuirty = Driver.findElement(By.xpath("//*[@id=\"agGrid\"]/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[1]")).getText();
//	        System.out.println(FirstSecuirty);
//	         Driver.findElement(By.xpath("//*[@id=\"agGrid\"]/div/div[2]/div[1]/div[3]/div[2]/div/div/div[1]/div[1]")).click();
//	        Thread.sleep(10000);
//	        Driver.findElement(By.xpath("/html/body/modal-container/div/div/shortreporting/div[2]/contour-ag-grid/div/div[1]/div/span[1]/button")).click();
//	        
	        
 			
	}
	
	
	
}
