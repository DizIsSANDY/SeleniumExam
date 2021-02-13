package com.shortinterest.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GFWPages {

    WebDriver Driver;
  
    
    
    
    @FindBy(xpath="//span[@id='spL0001S0000I0000P0000']")
    @CacheLookup 
    WebElement MarginPage ;
	public void GetMarginPage()
	{
		MarginPage.click();
	}
	
	@FindBy(xpath="//span[@id='spL0000S0000I0000P0000']")
    @CacheLookup 

    WebElement BPSConnect ;
	public void GetBPSConnect()  
	{
		BPSConnect.click();
 	}
	
	 @FindBy(xpath="//span[@id='spL0002S0000I0000P0000']")
	    @CacheLookup 
	    WebElement Moneyline ;
		public void GetMoneyline()  
		{
			Moneyline.click();
 
		}

		
		@FindBy(xpath="//input[@id='branch']")
		  @CacheLookup 
		    WebElement BranchinMoneyline ;
		public void SetBranchinMoneyline(String InputBranch)
		{
			BranchinMoneyline.clear();
			BranchinMoneyline.sendKeys(InputBranch);
		}
		
		@FindBy(xpath="//input[@id='account']")
		  @CacheLookup 
		    WebElement AccountInMoneyLine ;
		public void SetAccountinMoneyline(String InputAccount)
		{
			AccountInMoneyLine.clear();
			AccountInMoneyLine.sendKeys(InputAccount);
		}
		
		
		@FindBy(xpath="//tbody/tr[2]/td[20]/input[1]")
		  @CacheLookup 
		    WebElement setSubmitinMoneyline ;
		public void SubmitinMoneyline()
		{
			setSubmitinMoneyline.click();
		}
		
		
  @FindBy(xpath="/html[1]/body[1]/form[1]/form[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
 @CacheLookup 
 WebElement GetAccountNameinMoneyline ;
public void  getAccountNameinMoneyLine()
{
	String AccoutName = GetAccountNameinMoneyline.getText();
	System.out.println(AccoutName);
	
	
	}
		
public void Login() throws InterruptedException, IOException
{
File file = new File("C:\\SDET\\com.qa.devlabs.selenium\\com.qa.devlabs.selenium\\src\\test\\java\\com\\shortinterest\\testdata\\inputDataGFWMargin.xlsx");
FileInputStream iFile = new FileInputStream(file);
XSSFWorkbook wb = new XSSFWorkbook(iFile);
XSSFSheet sheet = wb.getSheet("Sheet1");
int rowCount = sheet.getLastRowNum();
System.out.println("the no of rows are : " + rowCount);
for (int row=1; row<=rowCount; row++)
{
    String username = sheet.getRow(row).getCell(0).getStringCellValue();
    System.out.println("User Name is " + username);
    String password = sheet.getRow(row).getCell(1).getStringCellValue();
    System.out.println("Password Name is " + password);
    Thread.sleep(5000);
    
    Driver.findElement(By.xpath("//tbody/tr[2]/td[3]/input[1]")).sendKeys(username);
    Driver.findElement(By.xpath("//tbody/tr[4]/td[3]/input[1]")).sendKeys(password);
    Driver.findElement(By.xpath("//tbody/tr[7]/td[1]/input[6]")).click();
    Thread.sleep(5000);
}

}
    

@FindBy(xpath="//span[@id='spL0000S0000I0014P0000']")
@CacheLookup
WebElement  ShortinterestMenu ;
public void getShortInterest()
{
	ShortinterestMenu.click();
	String winHandleBefore = Driver.getWindowHandle();
	for(String winHandle : Driver.getWindowHandles()){
	    Driver.switchTo().window(winHandle);
	    System.out.println(Driver.getTitle());
	}

}



    public GFWPages(WebDriver Driver) {
        this.Driver = Driver;
        PageFactory.initElements(Driver, this);
    }
//    
//    public AmazonPages(WebDriver Driver) {
//        this.Driver = Driver;
//        PageFactory.initElements(Driver, this);
//    }
	
    
    
    
    
    
    
    
}
