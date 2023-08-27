package com.WriteExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;

public class UsingFillow {
	
	
	static String  ad="C:\\Users\\biswa\\eclipse-workspace\\ExcelFile\\fi1.xlsx";

	public static void main(String[] args) throws IOException, FilloException {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("USERNAME");
		sheet.getRow(0).createCell(1).setCellValue("PASSWORD");
		File f=new File(ad);
		
		
		FileOutputStream fs=new FileOutputStream(f);
		workbook.write(fs);
	
		
		Fillo f1=new Fillo();
		
	
	   Connection c=f1.getConnection(ad);
	
		String strInsertQuerry="insert into Sheet0(USERNAME,PASSWORD) VALUES('biswajit','Welcome@2022')";
			c.executeUpdate(strInsertQuerry);
		
		workbook.close();
		c.close();
	}

}
