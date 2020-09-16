package mavn.Selenium.utilies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHelper {
	
	public static void readExcel() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./data/testData.xlsx"); // read file path
		Workbook workbook = WorkbookFactory.create(file); // loading excel worbook
		Sheet sheet = workbook.getSheet("nnnow"); // getting sheet name
		Row row = sheet.getRow(0); // read row -- based on index based
		Cell cell = row.getCell(1); //r ead cell -- based on index based
		String celvalue = cell.getRichStringCellValue().toString(); // the cell wich uw ant read int or string
		System.out.println(celvalue);
	}
	
	public static void readExcel(int r, int c) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./data/testData.xlsx"); // read file path
		Workbook workbook = WorkbookFactory.create(file); // loading excel worbook
		Sheet sheet = workbook.getSheet("nnnow"); // getting sheet name
		Row row = sheet.getRow(r); // read row -- based on index based
		Cell cell = row.getCell(c); //r ead cell -- based on index based
		String celvalue = cell.getRichStringCellValue().toString(); // the cell wich uw ant read int or string
		System.out.println(celvalue);
	}
	public static void writeExcel(int r, int c,String value) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./data/testData.xlsx"); // read file path
		Workbook workbook = WorkbookFactory.create(file); // loading excel worbook
		Sheet sheet = workbook.getSheet("nnnow"); // getting sheet name
		Row row = sheet.getRow(r); // read row -- based on index based
		row.createCell(c).setCellValue(value);

		FileOutputStream fileout = new FileOutputStream("./data/testData.xlsx");
		workbook.write(fileout);
		fileout.close();
	}
	
	public static void readExcel(String filename,String shet,int r, int c) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(filename); // read file path
		Workbook workbook = WorkbookFactory.create(file); // loading excel worbook
		Sheet sheet = workbook.getSheet(shet); // getting sheet name
		Row row = sheet.getRow(r); // read row -- based on index based
		Cell cell = row.getCell(c); //r ead cell -- based on index based
		String cellvalue="";
		try {
			double celint = cell.getNumericCellValue(); 
			cellvalue = BigDecimal.valueOf(celint).toPlainString();
		} catch (Exception e) {
		cellvalue = cell.getRichStringCellValue().toString();
		}
		System.out.println(cellvalue);
	}
	/**
	 * next --> will just jump one step ahead and stop over there
	 * hasnext --> will jump one step ahead and check it has or not 
	 
	 */
	
	public static HashMap<String, String> readExcel_map(String filename,String shet,int r, int c,String testcase) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(filename); // read file path
		Workbook workbook = WorkbookFactory.create(file); // loading excel worbook
		Sheet sheet = workbook.getSheet(shet); // getting sheet name
		//Adding map logic
		Iterator<Row> iterator = sheet.rowIterator(); //row  -- row0,r1,r2,r3,--row 10
		//TestCase	mobilenumber	email	countrycode	pincode	address
		String key = "";
		String value="";
		HashMap<String, String> map = new HashMap<String, String>();
		//Reading data from excel and setting data in hashmap
		Row header = iterator.next(); //row -- row0
		while(iterator.hasNext()) {//row ---  r0, r1,
			Row rowdata = iterator.next(); //row -- r0, r1,r2
			String initialcellvalue = rowdata.getCell(0).toString(); // Tescasses,tc_1,tc_2
			if(testcase.equalsIgnoreCase(initialcellvalue)) { //tc_2 == tc_2 -- rowdata = r2
				for (int i = 0; i < rowdata.getLastCellNum(); i++) { //5--testcases,mobilnumber,country,email,address
					key = header.getCell(i).toString(); //i=0 -- key = Testcase,i=1 key =mobilnumber,i=2 key=country
					try {
						double dv = rowdata.getCell(i).getNumericCellValue();
						value = BigDecimal.valueOf(dv).toPlainString();
					} catch (Exception e) {
						value = rowdata.getCell(i).toString();// i=0 -- value = TC_2 value =9058,value =+91
					}
					map.put(key, value);
				}
				break;
			}
		}
		System.out.println(map);
		return map;
	}
	
	public static void writeExcel_map(String filename,String shet,int r, int c,String testcase
			,String datakey,String datavalue) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(filename); // read file path
		Workbook workbook = WorkbookFactory.create(file); // loading excel worbook
		Sheet sheet = workbook.getSheet(shet); // getting sheet name
		//Adding map logic
		Iterator<Row> iterator = sheet.rowIterator(); //row  -- row0,r1,r2,r3,--row 10
		//TestCase	mobilenumber	email	countrycode	pincode	address
		String key = "";
		String value="";
		
		//Reading data from excel and setting data in hashmap
		Row header = iterator.next(); //row -- row0
		while(iterator.hasNext()) {//row ---  r0, r1,
			Row rowdata = iterator.next(); //row -- r0, r1,r2
			String initialcellvalue = rowdata.getCell(0).toString(); // Tescasses,tc_1,tc_2
			if(testcase.equalsIgnoreCase(initialcellvalue)) { //tc_2 == tc_2 -- rowdata = r2
				for (int i = 0; i < rowdata.getLastCellNum(); i++) { //5--testcases,mobilnumber,country,email,address
					key = header.getCell(i).toString(); //i=0 -- key = Testcase,i=1 key =mobilnumber,i=2 key=country
					if(key.equalsIgnoreCase(datakey)) {
						//rowdata.getCell(i).getRichStringCellValue();
						rowdata.createCell(i).setCellValue(datavalue);
					}
				}
				break;
			}
		}
		FileOutputStream fileout = new FileOutputStream(filename);
		workbook.write(fileout);
		fileout.close();
	}
	
	
	public static String filename="./data/testData.xlsx";
	public static String sheetname = "nnnow";
	static int row=1;
	static int cell=1;
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//readExcel(); // hardcoded values
		//readExcel(0,1); //row,cell
		//readExcel("./data/testData.xlsx","nnnow",1,1);//filename,sheet,row,cell
		//readExcel(filename,sheetname,row, cell);
//		writeExcel_map(filename,sheetname,row, cell,"TC_2","email","dummmy@naik.com");
//		
//		HashMap<String, String> map = readExcel_map(filename,sheetname,row, cell,"TC_2");
//		String email = map.get("email");
//		System.out.println(email);
//		
		writeExcel(1,4,"LazyAunty");
	}
}
