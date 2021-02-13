package com.qa.testScripts;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;
import com.qa.utilities.excelutility;

public class TC_AmazonSearchItemDDT_003 extends TestBase {
AmazonPages AmazonOR;
	
	@BeforeMethod
	public void loadPages() {
		AmazonOR= new AmazonPages(Driver);
	} 
	
	@Test(dataProvider="DataSource")
	public void searchItemDDT(String category, String itemname) throws IOException {
		
		AmazonOR.SetCategoryList(category);
		AmazonOR.setSearchInput(itemname);
		AmazonOR.setMagnifierBtn();
		
		List<WebElement> getAllItemName = AmazonOR.GetAllItemName();
		if(getAllItemName.size()!=0) {
			Reporter.log("There are items displayed");
			Assert.assertTrue(true);
			for(WebElement ele: getAllItemName) { 
				Reporter.log(ele.getText());
			}
			
			
		}else {
			captureScreenShot(Driver,"searchItemDDT");
			Reporter.log("There are no items displayed");
			Assert.assertTrue(false);
		}
		
	}
	
	
	@DataProvider(name="DataSource")
	public String[][] getData() throws IOException {
		
		
		
		String xlPath ="C:\\Users\\gajawadas\\eclipse-workspace\\SDET_Selenium_Batch1\\src\\test\\java\\com\\qa\\testdata\\inputData.xlsx";
		String xlSheet = "Sheet2";
		int rowcount = excelutility.getRowCount(xlPath, xlSheet);
		int cellCount = excelutility.getCellCount(xlPath, xlSheet, 1);
		String data[][] = new String[rowcount][cellCount];
		System.out.println(rowcount);
		System.out.println(cellCount);
		for(int i=1;i<=rowcount;i++ )
		{
			for(int j=0;j<cellCount;j++)
			{
				data[i-1][j] = excelutility.getCellData(xlPath, xlSheet, i, j); //1,0
				
			}
		}
		
		return data; 

//		Object[][] data = new Object[3][2]; 

//		//Field 1
//
//		data[0][0] = "Books";
//		data[1][0] = "Electronics";
//		data[2][0] = "Furniture";
//
//		//Field 2
//
//		data[0][1] = "Da vinci Code";
//		data[1][1] = "Mobile phones";
//		data[2][1] = "Wooden table";

//		return data; 
	}

	

}
