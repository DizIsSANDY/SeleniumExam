package com.shortinterest.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static FileInputStream fileloc ;
	public static XSSFWorkbook wBook; 
	public static XSSFSheet wSheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	
	// get row count  

		public static int getRowCount(String xLFile, String xLSheet) throws IOException
		{
			fileloc = new FileInputStream(xLFile);
			wBook = new XSSFWorkbook(fileloc);
			wSheet = wBook.getSheet(xLSheet);
			int rowCount = wSheet.getLastRowNum();
			wBook.close();
			fileloc.close();
			return rowCount;
		}
		
		// get coloumn count 

		public static int getCellCount(String xLFile, String xLSheet , int rowNum) throws IOException
		{
			fileloc = new FileInputStream(xLFile);
			wBook = new XSSFWorkbook(fileloc);
			wSheet = wBook.getSheet(xLSheet);
			row = wSheet.getRow(rowNum);
			int cellCount = row.getLastCellNum();
			wBook.close();
			fileloc.close();
			return cellCount;
		}
		
		//get cell data 

		public static String getCellData(String xLFile, String xLSheet , int rowNum , int colNum) throws IOException
		{
			String data ;
			fileloc = new FileInputStream(xLFile);
			wBook = new XSSFWorkbook(fileloc);
			wSheet = wBook.getSheet(xLSheet);
			row = wSheet.getRow(rowNum);
			cell = row.getCell(colNum);
	 		try {
			DataFormatter formatter = new DataFormatter();
			String cellDate = formatter.formatCellValue(cell);
			return cellDate;
	 		}
	 		catch(Exception e)
	 		{
	 			data ="";
	 		}
			wBook.close();
			fileloc.close();
			return data;


	 	}
	 
		
	}
