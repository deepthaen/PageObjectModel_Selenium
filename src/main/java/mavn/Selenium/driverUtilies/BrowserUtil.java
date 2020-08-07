package mavn.Selenium.driverUtilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.log4testng.Logger;

public class BrowserUtil {

	public static WebDriver driver= null;
	public static Logger log = Logger.getLogger(BrowserUtil.class);
	public BrowserUtil() {
		this.driver = getInstance(); 
	}

	public static WebDriver getInstance() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL-E7470\\Downloads\\chromedriver_win32_1\\chromedriver.exe");
			driver = new ChromeDriver(options());
			log.info("Launching Chrome Browser");
		}
		return driver;
	}
	
	public static ChromeOptions  options() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		return option;
		}


}
