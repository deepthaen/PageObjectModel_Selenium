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

public class Excels {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		excel();
		excelRead();
	}

	private static void excelRead() throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("./");
	Workbook workbook = WorkbookFactory.create(file);
	Sheet sheet = workbook.getSheet("nnnow");
	Row row = sheet.getRow(0);
	row.createCell(0).setCellValue("TestVal");
	FileOutputStream fileout = new FileOutputStream("./");
	workbook.write(fileout);
	fileout.close();
		
	}

	private static void excel() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("nnnow");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		String cellval = cell.getRichStringCellValue().toString();
		System.out.println(cellval);
		
	}

}
