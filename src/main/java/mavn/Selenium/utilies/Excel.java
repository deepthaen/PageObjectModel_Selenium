package mavn.Selenium.utilies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		excel();
		excelwrite();
	}
	
	private static void excelwrite() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("");
		Workbook workook = WorkbookFactory.create(file);
		Sheet sheet = workook.getSheet("nnnow");
		Row row = sheet.getRow(0);
	    row.createCell(0).setCellValue("test");
	    FileOutputStream fileout = new FileOutputStream("./");
	    workook.write(fileout);
	    fileout.close();
		
		
		
	}

	public static void excel() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./data/testData.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("nnnow");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String CellValue = cell.getRichStringCellValue().toString();
		System.out.println(CellValue);
		
	}

	
}
