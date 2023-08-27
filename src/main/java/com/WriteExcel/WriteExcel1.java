package com.WriteExcel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		sheet.createRow(0);
		sheet.getRow(0).createCell(0).setCellValue("username");
		sheet.getRow(0).createCell(1).setCellValue("password");
		sheet.createRow(1);
		sheet.getRow(1).createCell(0).setCellValue("biswajit.sahoo@apmosys.com");
		sheet.getRow(1).createCell(1).setCellValue("Welcome@2022");
		File fs=new File("C:\\Users\\biswa\\eclipse-workspace\\ExcelFile\\Test3.xlsx");
		FileOutputStream fos=new FileOutputStream(fs);
		
		int rowcount=sheet.getLastRowNum();
		System.out.println("Total row is "+(rowcount+1));
		for(int i=0;i<=rowcount;i++)
		{
			Row row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum();j++)
			{
				System.out.println(row.getCell(j).getStringCellValue()+" ");
			}
			System.out.println();
		}
		workbook.write(fos);
		workbook.close();

	}

}
