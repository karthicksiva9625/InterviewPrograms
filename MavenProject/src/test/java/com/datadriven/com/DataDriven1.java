package com.datadriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven1 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\karthick rs\\eclipse-workspace\\MavenProjects\\dataDrve1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		
		int rowsize = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row  row= sheet.getRow(i);
			
			int Cellsize = row.getPhysicalNumberOfCells();
			for (int j = 0; j < Cellsize; j++) {
				Cell cell = row.getCell(j);
				
			CellType cellType = cell.getCellType();	
			if (cellType.equals(cellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				
			}else if (cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				long value=(long) numericCellValue;
				//String to int conversion(ALphaNumeric)
				String valueOf = String.valueOf(value);
				System.out.println(valueOf);
			}}}
		
		Cell cell2 = wb.getSheetAt(0).createRow(7).createCell(9);
		cell2.setCellValue("Data");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		
		wb.close();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
