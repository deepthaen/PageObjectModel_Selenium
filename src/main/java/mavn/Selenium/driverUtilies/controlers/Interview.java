package mavn.Selenium.driverUtilies.controlers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview {
	
	static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String cellval = readData();
		launchBrowser();
		passUrl();
		searchText(cellval);
	}

	static String FILE_PATH = "./data/testData.xlsx";
	static String SHEET = "nnnow";
	public static String readData()throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(FILE_PATH);
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(SHEET);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String cellval = cell.getRichStringCellValue().toString();
		return cellval;
	}
	
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL-E7470\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public static void passUrl() {
		driver.get("https://www.google.com/");
	}

	public static void searchText(String cellval) {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(cellval);
		driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).click();
		String total = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
		System.out.println(total);
	}
}
