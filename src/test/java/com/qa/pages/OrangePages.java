package com.qa.pages;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.interactions.Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangePages {

	WebDriver driver;

	
	@FindBy(xpath="//input[@id='txtUsername']")
 	WebElement Login ;
	public void GetLoginUserName(String UserName)
	{
		Login.clear();
		Login.sendKeys(UserName);
	}
	
	@FindBy(xpath="//input[@id='txtPassword']")
	WebElement EnterPassword ;
	public void GetPassword(String Password)
	{
		EnterPassword.clear();
		EnterPassword.sendKeys(Password);
		
	}
	
	@FindBy(xpath="//input[@id='btnLogin']")
	WebElement SubmitButton ;
	public void SetSubmitOnLoginButton()
	{
		SubmitButton.click();
	}
	
	@FindBy(xpath="//b[contains(text(),'Dashboard')]")
	WebElement DashBoard;
	public String getDashBoardCOnfirmation()
	{
		return DashBoard.getText();	
	}
	
	
	@FindBy(xpath="//b[contains(text(),'Dashboard')]")
	WebElement DashBoardTab;
	public void  getDashBoardUsingTabName()
	{
		DashBoardTab.click();
	}
	
	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	WebElement DashBoardTabHeader;
	public String getDashBoardConfirmtionUsingHeaderText()
	{
		return DashBoardTabHeader.getText();
	}
	

	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement ClickAdminTab;
	public void GetAdminTab() throws InterruptedException
	{
		ClickAdminTab.click();
		Thread.sleep(2000);
		
	}
	
	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement GetAdminTagText;
	public String GetAdminTabConfirmation()
	{
		return GetAdminTagText.getText();
	}
	
	
	@FindBy(xpath="//a[@id='menu_admin_viewJobTitleList']")
	WebElement JobTitle;

	public void GetJobMenu()
	{
		JobTitle.click(); 
		
		
	}
	
	
	
	@FindBy(xpath="//b[contains(text(),'PIM')]")
	WebElement PIMTab;
	public void GetPImTab()
	{
		PIMTab.click();
	}
	
	@FindBy(xpath="//b[contains(text(),'PIM')]")
	WebElement GetPIMTagText;
	public String GetPIMTabConfirmation()
	{
		return GetPIMTagText.getText();
	}
	
	
	
	@FindBy(xpath="//b[contains(text(),'Leave')]")
	WebElement LeaveTAB;
	public void GetLeaveTab()
	{
		LeaveTAB.click();
	}
	
	@FindBy(xpath="//b[contains(text(),'Leave')]")
	WebElement GetLeaveTab;
	public String GetLeaveTabConfirmation()
	{
		return GetLeaveTab.getText();
	}
	
	
	@FindBy(xpath="//b[contains(text(),'Directory')]")
	WebElement Directory;
	public void GetDirectoryTab()
	{
		Directory.click();
	}
	
	
	@FindBy(xpath="//b[contains(text(),'Directory')]")
	WebElement DirectoryText;
	public String GetDirectoryTabConfirmation()
	{
		
		return DirectoryText.getText();
	}
	
	
	@FindBy(xpath="//b[contains(text(),'Maintenance')]")
	WebElement Maintenance;
	public void GetMaintenanceTab()
	{
		Maintenance.click();
	}
	
	
	@FindBy(xpath="//b[contains(text(),'Maintenance')]")
	WebElement MaintenanceTab;
	public String GetMaintenanceTabConfirmation()
	{
		
		return MaintenanceTab.getText();
	}
	
	
	
	@FindBy(xpath="//b[contains(text(),'Time')]")
	
	WebElement TimeTab;
	public void GetTimeTab()
	{
		TimeTab.click();
	}
	
	@FindAll(@FindBy(xpath="/a"))
	@CacheLookup
	List<WebElement> AllLinks;
	
	public List<WebElement> getAllLinks() {
		
		return AllLinks;
	}
	
	@FindAll(@FindBy(xpath="/img"))
	@CacheLookup
	List<WebElement> AllImages;
	
	public List<WebElement> getAllImages() {
		
		return AllImages;
	}
	
	
	
	
	@FindAll(@FindBy(xpath="//input[contains(@name,'txt')]"))
	@CacheLookup
	List<WebElement> AllTextBoxs;
	public List<WebElement> getAllTextBoxs()
	{
		return AllTextBoxs;
	}
	
	@FindBy(css="#menu_pim_viewPimModule")

	@CacheLookup
	WebElement CSSPIMTAB;
	public void CSSPIMTab()
	{
		CSSPIMTAB.click();
	}
	
	@FindBy(css="div.menu:nth-child(2) ul.main-menu-first-level-unordered-list.main-menu-first-level-unordered-list-width li.current.main-menu-first-level-list-item:nth-child(4) a.firstLevelMenu:nth-child(1) > b:nth-child(1)")
	@CacheLookup
	WebElement CSSTime;
	public void CSSTimeTab()
	{
		CSSTime.click();
	}
	
	
	
	public OrangePages(WebDriver Driver) {
		this.driver = driver;
		PageFactory.initElements(Driver, this);
	}
	
	
	
}
