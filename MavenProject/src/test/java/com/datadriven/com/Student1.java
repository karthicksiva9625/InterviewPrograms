package com.datadriven.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Student1 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\karthick rs\\eclipse-workspace\\MavenProjects\\dd1.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		
		int rowsize = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < rowsize; i++) {
			Row row = sheetAt.getRow(i);
		
		int cellsize = row.getPhysicalNumberOfCells();
		for (int j = 0; j < cellsize; j++) {
			Cell cell = row.getCell(j);
		
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);
		
		}else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			long value=(long) numericCellValue;
			String valueOf = String.valueOf(value);
			System.out.println(valueOf);
		
		
		
		}
	}}
		Cell cell = wb.getSheetAt(0).createRow(10).createCell(11);
		cell.setCellValue("Data");
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		
		wb.close();
	}}
